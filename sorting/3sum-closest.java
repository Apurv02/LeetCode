class Solution {
    public int threeSumClosest(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int maxdiff = Integer.MAX_VALUE;
        int closestsum = nums[0] + nums[1] + nums[2];
        for(int i=0; i<n-2; i++) {
            int left = i+1;
            int right = n-1;
            int newtarget = target - nums[i];
            while(left<right) {
                int sum = nums[left] + nums[right];
                int total = nums[i] + sum;
                int diff = Math.abs(target-total);
                if(maxdiff>diff) {
                    maxdiff = diff;
                    closestsum = total;
                }
                if(sum<newtarget) {
                    left++;
                }
                else if(sum>newtarget) {
                    right--;
                }
                else {
                    return total;
                }
            }
        }
        return closestsum;
    }
}