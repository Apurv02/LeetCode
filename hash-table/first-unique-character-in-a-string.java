class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character, Integer>map = new HashMap<>();
        //frequency
        for(int i =0; i<n; i++) {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //traversing 
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(map.get(ch)==1) {
                return i;
            }
        }
        return -1;
    }
}