class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n*m -1;
        while(low<=high) {
            int guess = low + (high-low)/2;
            int row = guess/m;
            int column = guess%m;
            if(matrix[row][column]==target) {
                return true;
            } else if(matrix[row][column]<target) {
                low = guess + 1;
            } else if(matrix[row][column]>target) {
                high = guess - 1;
            }
        }
        return false;
    }
}