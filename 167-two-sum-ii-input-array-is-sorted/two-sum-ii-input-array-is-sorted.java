class Solution {
    public int[] twoSum(int[] a, int t) {
        int n=a.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int s=a[i]+a[j];
            if(s==t){
                return new int[]{i+1,j+1};
            }if(s>t){
                j--;
            }else{
                i++;
            }
        }return new int[]{};
    }
}