class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int current = 0; 
        int max = 0;
        for(int i=0; i<n; i++) {
            if(nums[i]==1) {
                current++;
            } else {
                current = 0;
            }
            max = Math.max(current,max);
        }
        return max;
    }
}