class Solution {
    public int countOdds(int low, int high) {
        return (high+1)/2-(low/2);
    }
}


// class Solution {
//     public int countOdds(int low, int high) {
//         Set<Integer> set = new HashSet<>();

//         for(int i=low; i<=high; i++){
//             if (i%2!=0){
//                 set.add(i);
//             }
//         }

//         return set.size();
        
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna