class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {

                    boolean comm= false;

                    //row
                    for (int k = 0; k < n; k++) {
                        if (k != j && grid[i][k] == 1) {
                            comm = true;
                            break;
                        }
                    }

                    //column
                    for (int k = 0; k < m; k++) {
                        if (k != i && grid[k][j] == 1) {
                            comm = true;
                            break;
                        }
                    }

                    if (comm) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna