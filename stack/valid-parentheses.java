class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            //opening bracket *push
            if(ch=='(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            //closing brackets * pop
            else {
                if(st.isEmpty()) {
                    return false;
                }
                if(ch == ']' && st.peek() == '[') {
                    st.pop();
                } else if(ch == ')' && st.peek() == '(') {
                    st.pop();
                } else if(ch == '}' && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();    
    }
}