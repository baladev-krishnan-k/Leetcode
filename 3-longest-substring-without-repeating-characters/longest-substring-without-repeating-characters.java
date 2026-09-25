class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int c=0;
        int r=0;
        HashSet<Character> st=new HashSet();
        for(int i=0;i<n;i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(l));
                l++;
            }st.add(s.charAt(i));
            r=Math.max(r,st.size());
        }return r;
    }
}