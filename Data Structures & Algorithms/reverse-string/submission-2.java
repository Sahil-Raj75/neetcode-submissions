class Solution {
    public void reverseString(char[] s) {
        int  left  = 0 ,  right  = s.length-1;
        char[] temp = new char[s.length];
        for(int i= right , j = 0 ; i >= 0; i-- , j++){
            temp[j] = s[i];
        }

        for(int i = 0 ; i <= right ; i++){
            s[i]=temp[i];
        }
    }
}