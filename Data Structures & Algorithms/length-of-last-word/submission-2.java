class Solution {
    public int lengthOfLastWord(String s) {

        char[] arr = s.toCharArray();
        int lastIndex = arr.length - 1;
        int count = 0;

        // TC : O(n)
        // trailing space skip krte jao
        while (arr[lastIndex] == ' ') {
            lastIndex--;
        }
        // jab tak next space nhi milta count batate jao
        while (lastIndex >=0 && arr[lastIndex] != ' ') {
            count++;
            lastIndex--;
        }

        return count;
    }
}