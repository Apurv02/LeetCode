class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int minEnd = nums[0];
        int maxEnd = nums[0];
        int res = nums[0];
        for(int i = 1; i<n; i++) {
            int u = nums[i];
            int v = maxEnd*nums[i];
            int w = minEnd*nums[i];
            maxEnd = Math.max(u,Math.max(v,w));
            minEnd = Math.min(u,Math.min(v,w));
            res = Math.max(res,Math.max(maxEnd,minEnd));
        }
        return res;
    }
}