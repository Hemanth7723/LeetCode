class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=0;
        int m = matrix.length;
        int n = matrix[i].length;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna