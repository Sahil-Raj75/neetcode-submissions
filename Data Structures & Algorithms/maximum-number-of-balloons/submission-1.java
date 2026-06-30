class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0) + 1);
        }

        String word = "balloon";
        int count = 0;

        while (true) {
            int j = 0;

            while (j < word.length()) {
                if (map.containsKey(word.charAt(j)) && map.get(word.charAt(j)) != 0) {
                    map.put(word.charAt(j), map.getOrDefault(word.charAt(j), 0) - 1);
                } else {
                    break;
                }
                j++;
            }
            if (j == word.length()) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}