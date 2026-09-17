class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long max=0;
        long sum=0;
        int left=0;
        HashSet<Integer> set=new HashSet();
        for(int right=0;right<n;right++){
            while(set.contains(nums[right]) || set.size()==k){
                set.remove(nums[left]);
                sum-=nums[left++];
            }
            sum+=nums[right];
            set.add(nums[right]);
            if(set.size()==k){
                max=Math.max(max,sum);
            }

        }
        return max;
    }
}