class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int maxLen = 0;
        int zerocount = 0;
        for(int high = 0; high<n; high++) {
            if(nums[high]==0) {
                zerocount++;
            }
            while(zerocount>k) {
                if(nums[low]==0) {
                    zerocount--;
                }
                low++;
            }
            maxLen = Math.max(maxLen, (high-low+1));
        }
        return maxLen;
    }
}