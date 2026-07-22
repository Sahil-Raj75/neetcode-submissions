class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        // int start = matrix[0][0];
        // int end = matrix[row-1][col-1];

        // while(start<end){
        //     int mid = 
        //     if(target == mid){
        //         return true;
        //     }
        // }

        //brute force

        for(int i = 0 ; i<row;i++){
            for(int j = 0 ; j<col;j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
