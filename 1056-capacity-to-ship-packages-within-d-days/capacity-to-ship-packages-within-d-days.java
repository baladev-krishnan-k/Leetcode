class Solution {
    public int cal(int[] w, int mid){
        int c=0;
        int sum=0;
        int n=w.length;
        for(int i=0;i<n;i++){
            sum+=w[i];
            if(sum==mid){
                sum=0;
                c++;
            }else if(sum>mid){
                sum=w[i];
                c++;
            }
        }if(sum>0)c++;
        return c;
    }
    public int shipWithinDays(int[] w, int days) {
        int n=w.length;
        int max=0;
        int sum=0;
        for(int i : w){
            sum+=i;
            max=Math.max(max,i);
        }int i=max;
        int j=sum;
        int mid=0;
        while(i<=j){
            mid=(i+j)/2;
            int c=cal(w,mid);
            if(c>days){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }return i;
    }
}