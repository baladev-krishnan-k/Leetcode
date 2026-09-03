class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList();
        int n = nums.length;
        int m = l.length;
        for (int i = 0; i < m; i++) {
            boolean t = true;
            if (r[i] - l[i] == 1) {
                res.add(true);
                continue;
            }
            int tr[] = new int[r[i] - l[i] + 1];
            int k = 0;
            for (int j = l[i]; j <= r[i]; j++) {
                tr[k] = nums[j];
                k++;
            }
            Arrays.sort(tr);
            int di = Math.abs(tr[0] - tr[1]);
            for (int j = 1; j <k-1; j++) {
                int d = Math.abs(tr[j] - tr[j + 1]);
                if (d != di) {
                    t = false;
                    break;
                }
            }
            res.add(t);
        }
        return res;
    }
}