class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Integer> list = new HashSet<>();

        int low = 0, high = 0;
        int res = 0;

        while(high<s.length()){
            int ch = s.charAt(high);
            
            while(list.contains(ch)){
                int chAtLow = s.charAt(low); 
                list.remove(chAtLow);
                low++;
            }
                list.add(ch);
                int len = high - low + 1;
                res = Math.max(res,len);
                high++;
        }
        return res;
    }
}