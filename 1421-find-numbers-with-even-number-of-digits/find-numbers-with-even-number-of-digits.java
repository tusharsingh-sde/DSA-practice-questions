class Solution {
    public int findNumbers(int[] nums) {
        
        int temp = 0;
        for (int i=0; i<nums.length;i++){
            int count = 0;
            
            int n = nums[i];

            while (n>0){
                n = n/10;
                count++;
            }

            if (count%2==0){
                temp++;
            }
        }
        return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna