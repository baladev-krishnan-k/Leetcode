class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int r[]=new int[n];
        int i=0;
        int j=1;
        for(int k=0;k<n;k++){
            if(nums[k]%2==0){
                r[i]=nums[k];
                i+=2;
            }else{
                r[j]=nums[k];
                j+=2;
            }
        }return r;
        
    }
}