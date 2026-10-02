class Solution {
    public int maximumUnits(int[][] b, int s) {
        Arrays.sort(b,(x,y) -> y[1]-x[1]);
        int ns=0;
        int nu=0;
        for(int i=0;i<b.length;i++){
            if(ns+b[i][0]<=s){
                nu=nu+(b[i][0]*b[i][1]);
                ns+=b[i][0];
            }else if(ns!=s && ns+b[i][0]>s){
                nu=nu+((s-ns)*b[i][1]);
                ns=s;
            }
        }return nu;
    }
}