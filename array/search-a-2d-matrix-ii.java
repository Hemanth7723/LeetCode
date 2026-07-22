class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Current Complexity: Time O(m * n), Space O(1)
        // Optimal Complexity: Time O(m + n), Space O(1)
        
        int i=0;
        int j=0;
        int m = matrix.length;
        int n = matrix[i].length;
        for(i=0;i<m;i++){
            for(j=n-1;j>=0;j--){
                if(matrix[i][j]>target){
                    continue;
                }
                if(matrix[i][j]<target){
                    break;
                }
                else{
                    return true;
                }
            }
        }
        // Hint 1: Your current approach is essentially a nested loop (O(m*n)), which is too slow.
        // Hint 2: Notice the properties of the matrix: both rows and columns are sorted.
        // Hint 3: Try starting from the top-right corner (0, n-1). 
        // If matrix[i][j] > target, the entire column j can be ignored (move left: j--).
        // If matrix[i][j] < target, the entire row i can be ignored (move down: i++).
        // This allows you to find the target in O(m + n) time.
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna