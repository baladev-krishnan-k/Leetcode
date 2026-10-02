class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int d[]=new int[n+1];
        for(int i=2;i<n+1;i++){
            d[i]=Math.min(d[i-1]+cost[i-1],d[i-2]+cost[i-2]);
        }return d[n];
    }
}