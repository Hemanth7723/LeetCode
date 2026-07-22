class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // COACH ANALYSIS:
        // Your current approach attempts to move diagonally (i++ and j++), 
        // but this will skip many elements and likely cause an ArrayIndexOutOfBoundsException.
        // Current Time Complexity: O(min(m, n)) - but logic is incorrect.
        // Current Space Complexity: O(1).
        // Optimal Time Complexity: O(m + n) using the "Staircase Search" approach.
        
        // HINT 1: The matrix is sorted row-wise and column-wise. 
        // HINT 2: Start from the TOP-RIGHT corner (row 0, col n-1).
        // HINT 3: If current element > target, the entire column must be > target (move left: j--).
        // HINT 4: If current element < target, the entire row must be < target (move down: i++).
        
        int i=0;
        int j=0;
        int m = matrix.length;
        int n = matrix[i].length;
        if(matrix[i][j]>target){
                   return false;
            }
        while (matrix[i][j]<target && i<m && j<n){
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
        // If you get stuck implementing the Staircase Search, check the "Video Solutions" 
        // section in the Solutions tab on the left pane for a visual walkthrough!
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna