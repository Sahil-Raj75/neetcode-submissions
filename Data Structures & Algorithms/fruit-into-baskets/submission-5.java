class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxLen = 0;
        int lo = 0;

        for (int hi = 0; hi < fruits.length; hi++) {
            map.put(fruits[hi], map.getOrDefault(fruits[hi], 0) + 1);

            while (map.size() > 2) {
                map.put(fruits[lo], map.get(fruits[lo]) - 1);
                if (map.get(fruits[lo]) == 0) {
                    map.remove(fruits[lo]);
                }
                lo++;
            }
            int len = hi - lo + 1;
            maxLen = Math.max(len, maxLen);
        }

        return maxLen;
    }
}