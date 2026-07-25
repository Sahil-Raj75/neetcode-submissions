class Solution {
    public boolean isPowerOfTwo(int n) {

        int i = 0;
        int power = 0;
        while (n < Integer.MAX_VALUE && power <= n) {
            power = (int) Math.pow(2, i);
            if (power == n) {
                return true;
            }
            i++;
        }
        return false;
    }
}