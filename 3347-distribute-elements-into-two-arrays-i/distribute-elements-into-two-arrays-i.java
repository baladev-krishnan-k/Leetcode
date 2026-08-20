class Solution {
    public int[] resultArray(int[] nums) {
        Stack<Integer> a1=new Stack();
        Stack<Integer> a2=new Stack();
        int n=nums.length;
        int res[]=new int[n];
        a1.push(nums[0]);
        a2.push(nums[1]);
        for(int i=2;i<n;i++){
            if(a1.peek()>a2.peek()){
                a1.push(nums[i]);
            }else{
                a2.push(nums[i]);
            }
        }for(int i=n-1;i>=0;i--){
            if(i>a1.size()-1)
            res[i]=a2.pop();
            else res[i]=a1.pop();
        }return res;

    }
}