class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0;
        int res = Integer.MAX_VALUE;
        int sum = 0;
        for(int high=0; high<n; high++) {
            sum += nums[high];
            while(sum>=target) {
                int length = (high-low) + 1;
                res = Math.min(length,res);
                sum -= nums[low];
                low++;
            }
        }
        return res == Integer.MAX_VALUE? 0:res;
    }
}