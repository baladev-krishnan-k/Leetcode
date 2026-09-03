class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int e=0;
        int o=1;
        int i=0;
        while(e<n && o<n){
            if(nums[e]%2!=0 && nums[o]%2==0){
                int t=nums[e];
                nums[e]=nums[o];
                nums[o]=t;
                e+=2;
                o+=2;
            }else if(nums[e]%2==0) e+=2;
            else if(nums[o]%2!=0) o+=2;
        }return nums;
        
    }
}