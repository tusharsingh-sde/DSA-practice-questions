class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m=matrix[0].length;
        int[][] ans = new int[m][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna