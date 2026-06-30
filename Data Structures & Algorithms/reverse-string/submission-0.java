class Solution {
    public void reverseString(char[] s) {
        int  left  = 0 ,  right  = s.length-1;
        char[] temp = new char[s.length];
        while( left < right ){
            temp[ left ] = s[ left ];
            s[ left ]=s[ right ];
            s[ right ] = temp[ left ];
             left ++;
             right --;
        }
    }
}