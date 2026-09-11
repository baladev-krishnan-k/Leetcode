class Solution {

    public int totalNumbers(int[] digits) {
        int[] digitCounts = new int[10];
        for (int d : digits) {
            digitCounts[d]++;
        }
        
        int uniqueEvenCount = 0;
        for (int num = 100; num < 1000; num += 2) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int ones = num % 10;
            
            int[] currentCounts = new int[10];
            currentCounts[hundreds]++;
            currentCounts[tens]++;
            currentCounts[ones]++;
            
            if (digitCounts[hundreds] >= currentCounts[hundreds] &&
                digitCounts[tens] >= currentCounts[tens] &&
                digitCounts[ones] >= currentCounts[ones]) {
                uniqueEvenCount++;
            }
        }
        
        return uniqueEvenCount;
        

    }
}