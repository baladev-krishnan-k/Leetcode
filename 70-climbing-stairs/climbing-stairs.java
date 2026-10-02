class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int prev=2;
        int curr=3;
        int c=3;
        while(c<n){
            int temp=curr;
            curr=curr+prev;
            prev=temp;
            c++;
        }
        return curr;
    }
}