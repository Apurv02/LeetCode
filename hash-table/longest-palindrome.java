class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            char ab = s.charAt(i);
            map.put(ab,map.getOrDefault(ab,0)+1);
        }
        //palindrome construction
        boolean odd = false;
        int res = 0;
        for(char ch : map.keySet()) {
            if(map.get(ch) % 2 == 0) {
                res +=  map.get(ch);
            }
            if(map.get(ch) % 2 != 0) {
                odd = true;
            }
        }
        if(odd == false) {
            return res;
        }
        for(char ef : map.keySet()) {
            if(map.get(ef)%2 != 0) {
                res += map.get(ef) - 1;
            }
        }
         if(odd=true) {
                res++;
            }
        return res;
    }
}