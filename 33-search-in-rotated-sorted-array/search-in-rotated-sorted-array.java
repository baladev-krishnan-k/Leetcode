class Solution {
    public int search(int[] nums, int t) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[i]==t) return i;
            if(nums[j]==t) return j;
            if(nums[mid]==t) return mid;
            else if(nums[mid]>nums[i]){
                if(nums[i]<=t && t<nums[mid]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }else{
                if(nums[j]>= t && nums[mid]<t){
                    i=mid+1;
                }else{
                    j=mid-1;
                }
            }
        }return -1;
    }
}