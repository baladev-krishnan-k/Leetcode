class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int r[]=new int[n];
        int ls=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }for(int i=0;i<n;i++){
            sum-=nums[i];
            r[i]=Math.abs(sum-ls);
            ls+=nums[i];
        }return r;
    }
}