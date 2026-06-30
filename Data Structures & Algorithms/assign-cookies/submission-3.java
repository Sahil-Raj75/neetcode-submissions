class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(s);
        Arrays.sort(g);
        int i =0;
        int j =0;

        // int res =0;
        while(i<g.length){
            while(j<s.length && g[i]>s[j]){
                j++;
            }
                if(j==s.length){
                    break;
                }
                else{
                    i++;
                    j++;
                }
        }
        return i;
    }
}