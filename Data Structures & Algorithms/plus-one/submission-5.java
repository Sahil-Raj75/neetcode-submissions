class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(digits.length == 0){
            return new int[]{1};
        }
        for(int i = digits.length-1;i>=0;i--){ 
            if(digits[i]==9){  // == 9 case
                digits[i]=0;
            }
            else{ // < 9 case
                digits[i]+=1;
                return digits;
            }
        }
            digits = new int[n+1]; // 0,0,0,0
            digits[0]=1;           // 1,0,0,0
            return digits;
    }
}
