class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int s = (l*(l+1)/2);
        int sum = 0;

        for (int val:nums){
            sum = sum + val;
        }

        return s-sum;
    }
}

// class Solution {
//     public int missingNumber(int[] nums) {

//         Set<Integer> set = new HashSet<>();
//         int ans = 0;

//         for (int val : nums) {
//             set.add(val);
//         }

//         for (int i = 0; i <= nums.length; i++) {
//             if (!set.contains(i)) {
//                 ans = i;
//                 break;
//             }
//         }

//         return ans;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna