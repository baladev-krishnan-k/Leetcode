class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Stack<Integer> s=new Stack();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                s.push(nums[i]);
            }
        }for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                s.push(nums[i]);
            }
        }for(int i=1;i<n;i=i+2){
            nums[i]=s.pop();
        }for(int i=0;i<n;i=i+2){
            nums[i]=s.pop();
        }return nums;
    }
}