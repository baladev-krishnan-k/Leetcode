class Solution {
    public boolean isSubsequence(String s, String t) {
        Stack<Character> st=new Stack();
        for(var i:s.toCharArray()){
            st.push(i);
        }int n=t.length();
        for(int i=n-1;i>=0 && !st.empty();i--){
            
            if(t.charAt(i)==st.peek()){
                st.pop();
            }
        }if(st.isEmpty()) return true;
        return false;
    }
}