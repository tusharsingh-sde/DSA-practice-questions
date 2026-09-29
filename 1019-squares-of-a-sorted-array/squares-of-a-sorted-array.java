class Solution{
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] temp=new int[n];
        int low=0;
        int high=n-1;
        while(low<=high){
            int leftV=nums[low]*nums[low];
            int rightV=nums[high]*nums[high];
            if(leftV>rightV){
                temp[n-1]=leftV;
                low++;
                n--;
            } else {
                temp[n-1]=rightV;
                n--;
                high--;
            }
        }
        return temp;
    }
}


// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n = nums.length;
//         int[] ans = new int[n];
//         int i = 0, j = n - 1;
//         for (int p = n - 1; p >= 0; p--) {
//             if (Math.abs(nums[i]) > Math.abs(nums[j])) {
//                 ans[p] = nums[i] * nums[i];
//                 i++;
//             } else {
//                 ans[p] = nums[j] * nums[j];
//                 j--;
//             }
//         }
//         return ans;
//     }
// }


// class Solution {
//     public int[] sortedSquares(int[] nums) {
        

//         for (int i=0;i<nums.length;i++){
            
//             nums[i] = Math.sqrt(nums[i]);
//         }

//         Arrays.sort(nums);

//         return nums;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna