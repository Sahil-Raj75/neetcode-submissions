class Solution {
    static int min(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }

        int minRest = min(arr, index + 1);

        return Math.min(arr[index], minRest);
    }

    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for (char ch : text.toCharArray()) {
            // freq array me ch - 'a' index pe 0 ++ hota jayega
            // 'a' = 97
            freq[ch - 'a']++;
        }

        int[] value = {
                freq['b' - 'a'],
                freq['a' - 'a'],
                freq['l' - 'a'] / 2,
                freq['o' - 'a'] / 2,
                freq['n' - 'a']
        };

        return min(value, 0);
    }
}