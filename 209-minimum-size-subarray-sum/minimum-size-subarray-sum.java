class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int r=Integer.MAX_VALUE;
        int l=0;
        int s=0;
        for(int i=0;i<n;i++){
            s+=nums[i];
            while(s>=target){
                r=Math.min(r,i-l+1);
                s-=nums[l];
                l++;
            }
            
        }return r==Integer.MAX_VALUE?0:r;
    }
}