class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = n-1;
        int column = 0;
        while(row>=0 && column<=m-1) {
            if(matrix[row][column]<target) {
                column++;
            } else if(matrix[row][column]>target) {
                row--;
            } else if(matrix[row][column]==target) {
                return true;
            }
        }
        return false;
    }
}