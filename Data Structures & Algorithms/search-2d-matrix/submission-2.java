class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = (row * col) - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            
            int currRow = mid / col;
            int currCol = mid % col;
            
            if(target == matrix[currRow][currCol]){
                return true;
            }
            else if(target < matrix[currRow][currCol]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}
