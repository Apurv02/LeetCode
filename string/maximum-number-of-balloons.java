class Solution {
    public int maxNumberOfBalloons(String text) {
          int n = text.length();
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for(int i=0; i<n; i++) {
            char ab = text.charAt(i);
            need.put(ab,need.getOrDefault(ab,0)+1);
        }
        have.put('b',1);
        have.put('a',1);
        have.put('l',2);
        have.put('o',2);
        have.put('n',1);
        //checking max no of balloon
        int res = Integer.MAX_VALUE;
        for(char ch : have.keySet()) {
            if(!need.containsKey(ch)) {
                return 0;
            }
            res = Math.min(res, need.get(ch)/have.get(ch)); //text me kitne words hai/ balloon me kitne chahiye
        }
         return res;
    }
}