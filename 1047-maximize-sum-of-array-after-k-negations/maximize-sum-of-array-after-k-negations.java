class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int t=k;
        int n=nums.length;
        while(t-->0){
            if(i<n && nums[i]<0){
                nums[i]*=-1;
                i++;
            }else{
                Arrays.sort(nums);
                if((t+1)%2!=0) nums[0]*=-1;
                break;
            }
        }int sum=0;
        for(int j:nums) sum+=j;
        return sum;
    }
}