class Solution {
    public char findTheDifference(String s, String t) {
        int sumOft = 0;
        int sumOfs = 0;

        for(char ch : t.toCharArray()){
            sumOft += ch - 'a';
        }
        for(char ch : s.toCharArray()){
            sumOfs += ch - 'a';
        }
        int diff = sumOft - sumOfs;
        return (char) (diff + 'a');
    }
}
