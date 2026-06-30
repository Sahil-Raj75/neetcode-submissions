class Solution {
    public int mySqrt(int x) {
       int r = x, l =0;
       int res = 0;

        while (l <= r){
        int m= l + ((r-l)/2);
        if((long)m*m > x){
            r=m-1;
        }
         else if((long)m*m<x){
            l=m+1;
            res = m;
        }
        else {
            return m;
        }
       }
       return res;
    }
}