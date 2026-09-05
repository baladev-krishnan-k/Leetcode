class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap();
        int min=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            min=Math.min(nums[i],min);
            m.put(i,min);
        }int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            if((max-m.get(i))<=k) return i;
        }return -1;
    }
}