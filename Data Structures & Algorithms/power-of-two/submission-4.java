class Solution {
    public boolean isPowerOfTwo(int n) {
        int x = n;
        int x1 = n-1;

        int ans = x & x1;
        return n > 0 && ans == 0;
    }
}