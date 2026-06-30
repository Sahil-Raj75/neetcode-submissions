class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i = 0 ; i<arr.length;i++){
            int rightmax=0;
            for(int j = i+1;j<arr.length;j++){
                rightmax = Math.max(rightmax,arr[j]);
            }
            arr[i]=rightmax;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}