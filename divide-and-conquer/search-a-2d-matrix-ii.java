class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=0;
        int m = matrix.length;
        int n = matrix[i].length;
        if(matrix[i][j]>target){
                   return false;
            }
        while (matrix[i][j]<target){
            i++;
            if(matrix[i][j]==target){
                return true;
            }
            j++;
            if(matrix[i][j]==target){
                return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna