class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int i =0;
        int k =0;
        for (int n:nums){
            if (n!=val){
                arr[i] = n;
                k++;
                i++;
            }
        }

        for (int j=0; j<arr.length;j++){
            nums[j] = arr[j];
        }
        return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna