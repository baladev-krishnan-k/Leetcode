class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double max=Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            int s=0;
            for(int j=i;j<i+k;j++){
                s+=nums[j];
            }double avg=(double)s/k;
            max=Math.max(max,avg);
        }return max;
    }
}