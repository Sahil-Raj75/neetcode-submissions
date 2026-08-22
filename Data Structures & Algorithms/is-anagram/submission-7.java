class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch1 : t.toCharArray()) {
            if (!map.containsKey(ch1)) {
                return false;
            }
            map.put(ch1, map.getOrDefault(ch1, 0) - 1);
            if (map.get(ch1) == 0) {
                map.remove(ch1);
            }
        }
        if (map.isEmpty()) {
            return true;
        }
        return false;
    }
}
