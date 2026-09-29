class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap();
        int s=0;
        m.put(0,-1);
        for(int i =0;i<n;i++){
            s+=nums[i];
            int r=s%k;
            if(m.containsKey(r)){
                if((i-m.get(r))>1) return true;
            }
            else{
                m.put(r,i);
            }
        }return false;
    }
}