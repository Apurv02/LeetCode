class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low<=high) {
            int guess = low + (high-low)/2;

            if(nums[guess]==target) {
                return guess;
            }
            //part 1
            if(nums[guess]>nums[n-1]) {
                
                if(nums[guess]<target) {
                    low = guess + 1;
                } else {
                    if(target>=nums[0]) {
                        high = guess - 1;
                    } else {
                        low = guess + 1;
                    }
                } 
            }
            //part 2
            else {
                if(nums[guess]>target) {
                    high = guess - 1;
                } else {
                    if(target<=nums[n-1]) {
                        low = guess + 1;
                    } else {
                        high = guess - 1;
                    }
                }
            }
        }
        return res;
    }
}