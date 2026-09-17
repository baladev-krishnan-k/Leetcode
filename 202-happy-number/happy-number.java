class Solution {
    private int sq(int n){
        int r=0;
        while(n!=0){
            int k=n%10;
            r+=(k*k);
            n/=10;
        }return r;
    }
    public boolean isHappy(int n) {
        int s=n;
        int f=sq(sq(n));
        while(f!=s && f!=1 && s!=1){
            s=sq(s);
            f=sq(sq(f));
        }return s==1 || f==1;
    }
}