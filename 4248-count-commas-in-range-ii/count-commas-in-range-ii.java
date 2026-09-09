class Solution {
    public long countCommas(long n) {
        if (n < 999) {
            return 0;
        }
        if (n < 1000000) {
            return n - 999;
        }
        if (n < 1000000000) {
            return 2 * (n - 500499);
        }
        if (n < 1000000000000L) {
            return 3 * (n - 333666999L);
        }
        if (n < 1000000000000000L) {
            return 4 * (n - 250250250249L);
        }
        return 4 * (n - 250250250249L) + 1;
    }
}