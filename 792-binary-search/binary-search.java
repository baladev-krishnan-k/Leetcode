class Solution {
    public int search(int[] nums, int t) {
        int i=0;
        int j=nums.length-1;
        int mid=(j+i)/2;
        while(i<=j){
            mid=(j+i)/2;
            if(nums[mid]==t) return mid;
            else if(nums[mid]>t){
                j=mid-1;
            } else{
                i=mid+1;
            }
        }return -1;
    }
}