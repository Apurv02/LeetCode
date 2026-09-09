class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<n; i++) {
            sum+=nums[i];
            int res = sum-k;
            if(map.containsKey(res)) {
                count+=map.get(res);  //update count
            }
            map.put(sum,map.getOrDefault(sum,0)+1);  //sum update
        }
        return count;
    }
}