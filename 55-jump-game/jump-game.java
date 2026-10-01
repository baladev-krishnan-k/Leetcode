class Solution {
    public boolean canJump(int[] a) {
        int n=a.length;
        int max=0;
        if(n==1) return true;
        for(int i=0;i<n;i++){
            if(i>max) return false;
            max=Math.max(max,a[i]+i);
        }return true;
    }
}