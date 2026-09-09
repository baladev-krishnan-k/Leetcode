class Solution {
    public long countCommas(long n) {
        long res=0;
        if(n<999){
            return 0;
        }else{
            if(n<1000000){
                res=n-999;
            }else if(n<1000000000){
                res=2*(n-500499);
            }else if(n<1000000000000L){
               res=3*(n-333666999L);
            }else if(n<1000000000000000L){
                res=4*(n-250250250249L);
            }else{
                res=4*(n-250250250249L)+1;
            }
        }return res;
    }
}