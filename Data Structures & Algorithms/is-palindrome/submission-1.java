class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            // Compare only if both are alphanumeric
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') &&
                (s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= '0' && s.charAt(j) <= '9')) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            } else {
                // If left is not alphanumeric, move i forward
                if (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                    i++;
                }
                // If right is not alphanumeric, move j backward
                if (!(s.charAt(j) >= 'a' && s.charAt(j) <= 'z' || s.charAt(j) >= '0' && s.charAt(j) <= '9')) {
                    j--;
                }
            }
        }
        return true;
    }
}

