class Solution {
    public int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int low=0;
        int high = height.length-1;

        while(low<high){
            int lh = height[low];
            int rh = height[high];
            int min = Math.min(lh,rh);
            ans = Math.max(ans,min*(high-low));
            if (lh<rh){
                low++;

            }else {
                high--;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna