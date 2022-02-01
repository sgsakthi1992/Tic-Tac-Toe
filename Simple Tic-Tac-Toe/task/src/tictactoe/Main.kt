package tictactoe

import kotlin.math.abs

fun main() {
    val state = mutableListOf(
        MutableList(3) { "_" },
        MutableList(3) { "_" },
        MutableList(3) { "_" }
    )

    print(state)

    var isGameOn = isValid(state)
    var move = 0

    while (isGameOn) {
        if (checkRowHasWinner(state) && checkColumnHasWinner(state)
            && checkDiagonalHasWinner(state) && checkIfGameFinished(state)
        ) {
            var notValidCoordinates = true
            while (notValidCoordinates) {
                print("Enter the coordinates: ")
                val (x, y) = readLine()!!.split(" ").map { it.toIntOrNull() }
                if (x == null || y == null) {
                    println("You should enter numbers!")
                } else {
                    if (x > 3 || y > 3) {
                        println("Coordinates should be from 1 to 3!")
                    } else if (state[x - 1][y - 1] != "_") {
                        println("This cell is occupied! Choose another one!")
                    } else {
                        state[x - 1][y - 1] = if (move++ % 2 == 0) "X" else "O"
                        print(state)
                        notValidCoordinates = false
                    }
                }
            }
        } else {
            isGameOn = false
        }
    }
}

private fun print(state: MutableList<MutableList<String>>) {
    println("---------")
    state.forEach { println("| ${it.joinToString(" ")} |") }
    println("---------")
}

private fun checkIfGameFinished(state: MutableList<MutableList<String>>): Boolean {
    if (state.flatMap { it.filter { value -> value == "_" } }.isNotEmpty()) {
        return true
    }
    println("Draw")
    return false
}

private fun checkDiagonalHasWinner(state: MutableList<MutableList<String>>): Boolean {
    val range = 0..2
    val leftDiagonalValues = getDiagonalValues(state, range)
    if (leftDiagonalValues.size == 1 && leftDiagonalValues.first() != "_") {
        println("${leftDiagonalValues.first()} wins")
        return false
    } else {
        val rightDiagonalValues = getDiagonalValues(state, range.reversed())
        if (rightDiagonalValues.size == 1 && rightDiagonalValues.first() != "_") {
            println("${rightDiagonalValues.first()} wins")
            return false
        }
        return true
    }
}

private fun getDiagonalValues(state: MutableList<MutableList<String>>, range: IntProgression): MutableSet<String> {
    val diagonal = mutableSetOf<String>()
    for ((rowIndex, i) in range.withIndex()) {
        diagonal.add(state[rowIndex][i])
    }
    return diagonal
}

private fun checkColumnHasWinner(state: MutableList<MutableList<String>>): Boolean {
    val columnValues = getColumnValues(state)
    return checkState(columnValues)
}

private fun checkRowHasWinner(state: MutableList<MutableList<String>>): Boolean {
    val rowValues = getRowValues(state)
    return checkState(rowValues)
}

private fun getColumnValues(state: MutableList<MutableList<String>>): MutableSet<String> {
    val column = mutableSetOf<String>()
    for (i in 0..2) {
        val columnValues = getColumn(state, i)
        if (columnValues.size == 1 && columnValues.first() != "_") {
            column.add(state.first()[i])
        }
    }
    return column
}

private fun getColumn(state: MutableList<MutableList<String>>, columnNumber: Int): MutableSet<String> {
    val column = mutableSetOf<String>()
    for (i in 0..2) {
        column.add(state[i][columnNumber])
    }
    return column
}

private fun getRowValues(state: MutableList<MutableList<String>>): MutableSet<String> {
    val row = mutableSetOf<String>()
    for (i in 0..2) {
        if (state[i].toSet().size == 1 && state[i].first() != "_") {
            row.add(state[i].first())
        }
    }
    return row
}

private fun checkState(values: MutableSet<String>): Boolean {
    if (values.size == 1 && values.first() != "_") {
        println("${values.first()} wins")
        return false
    } else if (values.size > 1 && !values.contains("_")) {
        println("Impossible")
        return false
    }
    return true
}

private fun isValid(input: MutableList<MutableList<String>>): Boolean {
    val countX = input.flatMap { it.filter { value -> value == "X" } }.count()
    val countO = input.flatMap { it.filter { value -> value == "O" } }.count()
    return if(abs(countX - countO) <= 1) {
        true
    } else {
        println("Impossible")
        return false
    }
}
