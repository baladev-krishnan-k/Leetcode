class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int c=0;
        for(int i=0;i<f.length;i++){
            if(c==n) break;
            if(i>0 && i<f.length-1){
                if(f[i-1]==0 && f[i]==0 && f[i+1]==0){
                    c++;
                    f[i]=1;
                }
            }else if(i==0){
                if(f.length>1){
                    if(f[i]==0 && f[i+1]==0){
                    f[i]=1;
                    c++;
                    }
                }else{
                    if(f[i]==0){
                        c++;
                        f[i]=1;
                    }
                }
            }else if(i==f.length-1 && i>0){
                if(f[i]==0 && f[i-1]==0){
                    c++;
                    f[i]=1;
                }
            }
        }
        return c==n;
    }
}