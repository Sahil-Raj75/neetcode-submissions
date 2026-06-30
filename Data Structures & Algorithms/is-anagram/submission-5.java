class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

    char[] Sorteds = s.toCharArray();
    char[] Sortedt = t.toCharArray();

    Arrays.sort(Sorteds);
    Arrays.sort(Sortedt);
    return Arrays.equals(Sorteds,Sortedt);
}
}