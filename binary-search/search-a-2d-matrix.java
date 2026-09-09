class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low<=high) {
            int guess = low + (high-low)/2;
            if(matrix[guess][0]<=target) {
                res = guess;
                low = guess + 1;
            } else {
                high = guess - 1;
            }
        }
        if(res == -1) {
            return false;
        }
        int left = 0;
        int right = m-1;       
        while(left<=right) {
            int mid = left + (right-left)/2;
            if(matrix[res][mid]==target) {
                return true;
            } else if(matrix[res][mid]<target) {
                left = mid + 1;
            } else if(matrix[res][mid]>target) {
                right = mid - 1;
            }
        }
        return false; 
    }
}