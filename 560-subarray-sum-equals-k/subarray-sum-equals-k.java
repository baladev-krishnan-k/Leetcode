class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap();
        int s=0;
        int c=0;
        m.put(0,1);
        for(int i:nums){
            s+=i;
            if(m.containsKey(s-k)){
                c+=m.get(s-k);
            }m.put(s,m.getOrDefault(s,0)+1);
        }return c;
    }
}