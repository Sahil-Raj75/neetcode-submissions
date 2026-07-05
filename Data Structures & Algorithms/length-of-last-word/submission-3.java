class Solution {
    public int lengthOfLastWord(String s) {
        // Whenever you find a space (' '), cut the string there and store the pieces in an array.
        String arr[] = s.split(" ");
        return arr[arr.length - 1].length();
    }
}