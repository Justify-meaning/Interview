package jianzhioffer;

//传入一个二维数组和一个整数，判断该二维数组内是否有这个整数
public class lab04 {
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
                return false;
            }

            int rows = matrix.length; int columns = matrix[0].length;
            for (int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    if (matrix[i][j] == target)
                        return true;
                }
            }
            return false;

        }
    }

    class Solution2 {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return false;
            }
            int rows = matrix.length, columns = matrix[0].length;
            int row = 0, column = columns - 1;
            while (row < rows && column >= 0) {
                int num = matrix[row][column];
                if (num == target) {
                    return true;
                } else if (num > target) {
                    column--;
                } else {
                    row++;
                }
            }
            return false;
        }
    }

}
