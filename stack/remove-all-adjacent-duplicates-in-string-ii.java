class Solution {
    public String removeDuplicates(String s, int k) {
        class Pair {
            char ch;
            int count;
            Pair(char ch, int count) {
                this.ch = ch;
                this.count = count;
            }
        }

        int n = s.length();
        Stack<Pair> st = new Stack<>();
        for(int i =0; i<n; i++) {
            char c = s.charAt(i);
            if(st.isEmpty()) {
                st.push(new Pair(c,1));
                continue;
            }
            //if stack top is same as upcoming character
            if(st.peek().ch == c) {
                Pair p = st.pop();
                //count check
                if(p.count < k-1) {
                    st.push(new Pair(c,p.count+1));
                }
                //in else condition cpunt becomes k so no push
            } //new character 
            else{
                st.push(new Pair(c,1));
            }
        } //for loop end
        //result store
        String res = "";
        while(!st.isEmpty()) {
            Pair p = st.pop();
            while(p.count-->0) {
                res = p.ch + res;
            }
        }
        return res;
    }
}