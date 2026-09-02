class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int n=nums.length;
        int r[]=new int[n];
        for(int i=0;i<k;i++){
            int min=nums[0];
            for(int a=0;a<n;a++){  
                min=Math.min(min,nums[a]);
            }int j=0;
            for(int a=0;a<n;a++){
                if(nums[a]==min) {
                    j=a;
                    break;
                }
            }nums[j]=nums[j]*m;
        }return nums;
    }
}