class Solution {
    public int alternatingSum(int[] nums) {
        int s=0;
        int n=nums.length;
        for(int i=0;i<n;i+=2){
            s+=nums[i];
        }for(int i=1;i<n;i+=2){
            s-=nums[i];
        }return s;
    }
}