package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        if (number >= 5) {
            return decompose (number * number, number - 1)
        } else {
            return null
        }
    }
    private fun decompose (nNumber: Int, nextStep: Int): Array<Int>? {
        for ( i in nextStep downTo sqrt((nextStep * nextStep / 2).toDouble()).toInt() + 1) {
            val remain = nNumber - i * i
            if (remain == 0) {
                return arrayOf(i)
            } else {
                val next = sqrt(remain.toDouble()).toInt()
                val nextElement = if(next < i) decompose(remain,next) else decompose(remain, i - 1)
                if (!nextElement.isNullOrEmpty())
                    return nextElement + arrayOf(i)
            }
        }
        return null
    }
}
