import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int high=0; high<n; high++) {
            if(set.contains(nums[high])) {
                return true;
            }
            set.add(nums[high]);
            if((high-low)>=k) {
                set.remove(nums[low]);
                low++;
            }
        }
        return false;
    }
}