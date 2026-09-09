class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n= nums.length;
        int left=0;
        //left boundary set
        while(left<n-1 && nums[left]<=nums[left+1]) {
            left++;
        }
        int right=n-1;
        //right boundary set
        while(right>0 && nums[right-1]<=nums[right]) {
            right--;
        }
        if(left==n-1) {
            return 0;
        }
        //Min MAx 
        int submin = Integer.MAX_VALUE;
        int submax = Integer.MIN_VALUE;
        for(int i=left; i<=right; i++) {
            submin = Math.min(submin,nums[i]);
            submax = Math.max(submax,nums[i]);
        }
        //Expanding the left boundary
        while(left>0 && nums[left-1]>submin) {
            left--;
        }
        //Expanding the right boundary
        while(right<n-1 && nums[right+1]<submax) {
            right++;
        }
        return (right-left) + 1 ;
    }
}