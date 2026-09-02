class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int r[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int pst=r[index[i]];
            int pre;
            for(int j=index[i]+1;j<nums.length;j++){
                pre=r[j];
                r[j]=pst;
                pst=pre;
            }
            r[index[i]]=nums[i];
        }return r;
    }
}