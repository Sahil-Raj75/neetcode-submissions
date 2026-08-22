class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(char ch1 : t.toCharArray()){
            freq[ch1 - 'a']--;
        }

        for(int count: freq){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
