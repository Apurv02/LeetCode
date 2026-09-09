class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int freq[] = new int[256];
        int low = 0;
        int res = 0;
        int maxFreq = 0;
        for(int high=0; high<n; high++) {
            char ch =  s.charAt(high);
            freq[ch]++;
            maxFreq = Math.max(freq[ch],maxFreq);
            int length = (high-low)+1;
            int diff = length-maxFreq;
            while(diff>k) {
                freq[s.charAt(low)]--;
                low++;
                length = (high-low)+1;
                diff = length-maxFreq;
            }
            length = (high-low)+1;
            res = Math.max(length,res);
        }
        return res;
    }
}