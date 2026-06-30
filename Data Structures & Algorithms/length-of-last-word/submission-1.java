class Solution {
    public int lengthOfLastWord(String s) {
        int l=0 ;
        int maximum =0;
        int lengthoflastword =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                l=0;
            }
            else {
                l++;
                maximum = l;
            }
            lengthoflastword = Math.max(maximum,l);
        }
        return lengthoflastword;
    }
}