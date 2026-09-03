class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;
        int e = 0;
        int o = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                e++;
            } else
                o = Math.min(o, nums[i]);
        }if(e==0 || e==n) return true;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                if(nums[i]<o) return false;
            }
        }return true;
    }
}