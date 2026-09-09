class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int unique = 1;
        int off = 0;
        int cm = 1;
        while(cm<n) {
            if(nums[cm]==nums[cm-1]) {
                cm++;
            } else {
                off++;
                nums[off] = nums[cm];
                cm++;
                unique++;   
            }
        }
        return unique;
    }
}