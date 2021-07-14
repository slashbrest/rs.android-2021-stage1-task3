package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        for (c in 1..n) {
            if(m * 1L == factorial(n) / (factorial(c) * factorial(n - c))) {
                return c
            }
        }
        return null
    }
    fun factorial (a: Int): Long {
        var result = 1L
        for (i in 1..a) {
            result *= i
        }
        return result
    }
}
