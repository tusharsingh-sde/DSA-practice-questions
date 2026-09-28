class Solution {
    public int majorityElement(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int maxCount = 0;
        int major = 0;

        for (int num : set) {

            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                if (num == nums[i]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                major = num;
            }
        }
        return major;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna