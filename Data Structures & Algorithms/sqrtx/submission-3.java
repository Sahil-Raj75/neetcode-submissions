class Solution {
    public int mySqrt(int x) {
       int high = x;
       int ans = 0;
       int low = 0;
         while (low <= high){
        int  mid = (low + high)/2;

         if( (long)mid * mid <= x){
            low= mid + 1;
            ans =  mid ;
        }
        else {
            high = mid-1;
        }
       }
       return ans;
    }
}