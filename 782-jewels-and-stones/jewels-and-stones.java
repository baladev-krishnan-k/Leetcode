class Solution {
    public int numJewelsInStones(String j, String s) {
        int n=0;
        Map<Character,Integer> m=new HashMap();
        for(int i=0;i<j.length();i++){
            m.put(j.charAt(i),i);
        }for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))) n++;
        }return n;
    }
}