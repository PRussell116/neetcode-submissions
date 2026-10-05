class Solution {
    fun setZeroes(matrix: Array<IntArray>) {
        val rows = matrix.size
        val columns = matrix[0].size
        var rowZero = false

        for(row in 0 until rows){
            for(column in 0 until columns){
                if(matrix[row][column] == 0){
                    matrix[0][column] = 0
                    if(row > 0){
                        matrix[row][0] = 0
                    } else {
                        rowZero = true
                    }
                 

                }
            }
        }
        for(row in 1 until rows){
            for(column in 1 until columns){
                if(matrix[0][column] == 0 || matrix[row][0] == 0){
                    matrix[row][column] = 0
                }
            }
        }
        if(matrix[0][0] == 0){
            for(row in 0 until rows){
                matrix[row][0] =0
            }
        }
        if(rowZero){
            for(column in 0 until columns){
                matrix[0][column] = 0
            }
        }
    }
}
