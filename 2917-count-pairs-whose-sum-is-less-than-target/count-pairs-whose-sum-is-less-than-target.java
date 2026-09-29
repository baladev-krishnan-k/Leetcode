class Solution {
    public int countPairs(List<Integer> nums, int t) {
        int n=nums.size();
        int i=0;
        int j=n-1;
        Collections.sort(nums);
        int r=0;
        while(i<j){
            if(nums.get(i)+nums.get(j) < t){
                r+=(j-i);
                i++;
            }else{
                j--;
            }
        }return r;
    }
}