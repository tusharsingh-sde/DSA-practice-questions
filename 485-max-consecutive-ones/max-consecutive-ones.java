class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount=0;
        for (int val:nums){
            if(val==1){
                count++;

            } else {
                count=0;
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna