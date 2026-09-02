class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> l = new ArrayList();
        int r = m.length;
        int c = m[0].length;
        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;
        c=c*r;
       int n=0;
        while (n<c) {
            for (int i = left; i <= right && n<c; i++) {
                l.add(m[top][i]);
                n++;
            }
            top++;
            for (int i = top; i <= bottom && n<c; i++) {
                l.add(m[i][right]);
                n++;
            }
            right--;
            for (int i = right; i >= left && n<c; i--) {
                l.add(m[bottom][i]);
                n++;
            }
            bottom--;
            for (int i = bottom; i >= top && n<c; i--) {
                l.add(m[i][left]);
                n++;
            }
            left++;
        }
        return l;
    }
}