class Solution {
    public int minPartitions(String n) {
        int m=0;
        for(int i=0;i<n.length();i++){
            int t=(int)n.charAt(i);
            t-=48;
            if(t>m) m=t;
        }return m;
    }
}