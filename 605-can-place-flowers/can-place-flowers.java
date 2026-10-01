class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int c=0;
        int p=0;
        int m=f.length;
        if(m==1 && f[0]==0 && n==1) return true;
        for(int i=0;i<m-1;i++){
            if(c==n) break;
            if(f[i]==0 && p==0 && f[i+1]==0){
                f[i]=1;
                c++;
            }p=f[i];
        }if(c!=n && m>1 && f[m-1]==0 && f[m-2]==0) c++;
        return c==n;
    }
}