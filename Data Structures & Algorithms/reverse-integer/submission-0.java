class Solution {
    long rev = 0;
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;

    public int reverse(int x) {

        //overflow condion handle krna hoga 

        while(x != 0){
        int digit = x%10; // 3 2 1
        rev = rev*10+digit;// 3 32 321
        x=x/10; // 321 -> 12 -> 1 -> 0 
        }
        // handle the overflow condition
        if(rev > max || rev < min){
            return 0;
        }
        else{
            return (int) rev;
        }
    }
}