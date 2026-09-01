class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int r[]=new int[n];
        for(int k=0;k<n;k++){
            for(int i=k+1;i<n;i++){
                if(boxes.charAt(i)=='1'){
                    r[k]+=i-k;
                }
            }for(int i=k-1;i>=0;i--){
                if(boxes.charAt(i)=='1'){
                    r[k]+=k-i;
                }
            }
        }
        
        return r;
    }
}