class Solution {
    public int[] searchRange(int[] nums, int target) {
       int start = findFirst(nums,target);
       int end = findLast(nums,target);
       return new int[]{start,end};
    }

       private int findFirst(int nums[], int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low<=high) {
            int guess = low+(high-low)/2;
            if(nums[guess]<target) {
                low = guess+1;
            } else if(nums[guess]>target) {
                high = guess-1;
            } else {
                res = guess;
                high = guess - 1;
            }
        }
        return res;
       }

       private int findLast(int nums[], int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = -1;
        while(low<=high) {
            int guess = low+(high-low)/2;
            if(nums[guess]<target) {
                low = guess+1;
            } else if(nums[guess]>target) {
                high = guess-1;
            } else {
                res = guess;
                low = guess + 1;
            }
        }
        return res;
       }
    }