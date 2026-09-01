class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int r[]=new int[2*n];
        int i=0;
        int j=0;
        while(i<2*n){
            r[i]=nums[j];
            i++;
            j++;
            if(j==n) j=0;
        }return r;
    }
}