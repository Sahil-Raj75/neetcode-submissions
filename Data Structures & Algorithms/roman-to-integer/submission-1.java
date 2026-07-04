class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int i = 0;

        while (i < s.length() - 1) {
            int val1 = map.get(s.charAt(i));
            int val2 = map.get(s.charAt(i+1));

            if (val1 < val2) {
                // diffrence nikalo
                ans -= val1;
            } else {
                ans += val1;
            }
            i++;
        }
        return ans + map.get(s.charAt(i));
    }
}