class Solution {
    public boolean searchMatrix(int[][] mt, int t) {
        int m=mt.length;
        int n=mt[0].length;
        int i=0;
        int j=n*m-1;
        while(i<=j){
            int mid=(i+j)/2;
            int x=mid/n;
            int y=mid%n;
            if(mt[x][y]==t) return true;
            else if(mt[x][y]>t){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }return false;
    }
}