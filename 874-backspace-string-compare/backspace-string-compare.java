class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack();
        Stack<Character> t1=new Stack();
        for(var i:s.toCharArray()){
            if(i=='#' && !s1.isEmpty()){
                s1.pop();
            }else if(i!='#'){
                s1.push(i);
            }
        }for(var i:t.toCharArray()){
            if(i=='#' && !t1.isEmpty()){
                t1.pop();
            }else if(i!='#'){
                t1.push(i);
            }
        }if(s1.equals(t1)) return true;
        return false;
    }
}