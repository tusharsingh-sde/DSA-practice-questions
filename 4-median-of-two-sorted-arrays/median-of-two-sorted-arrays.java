class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] output = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0,output,0,nums1.length);
        System.arraycopy(nums2,0,output,nums1.length,nums2.length);

        Arrays.sort(output);

        int n = output.length;

        if (n % 2 != 0) {
            return output[n / 2];
        } else {
            return (output[n / 2 - 1] + (double) output[n / 2]) / 2;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna