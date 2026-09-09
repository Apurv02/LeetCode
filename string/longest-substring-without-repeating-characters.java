import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int res = 0;
        HashMap<Character, Integer>map = new HashMap<>();
        for(int high=0; high<n; high++) {
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1) {
                char lowChar = s.charAt(left);
                map.put(lowChar,map.get(lowChar)-1);
                left++;
            }
            int length = (high-left)+1;
            res = Math.max(length,res);
        }
        return res;
    }
}