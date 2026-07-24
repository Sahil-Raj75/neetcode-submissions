class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        int start  = 0 , end = rows * cols - 1 ;

        while(start <= end){
            int mid = start  + (end - start )/2; 

            int row = mid / cols; // How many complete rows did we pass?
            // Division → complete groups (rows)
            int col = mid % cols; // After filling complete rows, how far inside the current row am I? 
            // The modulo gives exactly the leftover amount.
            // Modulo → leftover part (column)

            if(arr[row][col] == target){
                return true;
            }
            else if(arr[row][col] > target){
                end = mid -1;
            }
            else{
                start  = mid + 1;
            }
        }
        return false;
    }
}