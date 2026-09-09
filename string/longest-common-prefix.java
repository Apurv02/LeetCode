class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        //check if the string is null
        if(strs == null || strs.length == 0) {
            return "";
        }
        //first string 
        String prefix = strs[0];
        //Loop
        for(int i=1; i<n; i++) {
            //chech of Mismatch
            while(strs[i].indexOf(prefix)!=0) {
                //shorten the prefix length;
                prefix = prefix.substring(0, prefix.length()-1);
                //empty string
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}