class Solution {
    public void moveZeroes(int[] nums) {

        int count = 0;
        for(int val:nums){
            if (val != 0){
                nums[count] = val;
                count ++;
            }
        }
        while (count < nums.length){
            nums[count] = 0;
            count ++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna