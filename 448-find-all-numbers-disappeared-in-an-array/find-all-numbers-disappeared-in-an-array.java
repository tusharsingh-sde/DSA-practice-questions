// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
        
//         Set<Integer> set= new HashSet<>();

//         for (int val: nums){
//             set.add(val);
//         }
//         List<Integer> list=new ArrayList<>();
//         for(int i=1; i<=nums.length;i++){
//             if(!set.contains(i)){
//                 list.add(i);
//             }
//         }
//         return list;
//     }
// }

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna