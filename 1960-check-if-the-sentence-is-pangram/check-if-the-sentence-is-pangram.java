// class Solution {
//     public boolean checkIfPangram(String sentence) {
//         char[] arr=sentence.toCharArray();
//         Set<Character> ans = new HashSet<>();

//         for (int i=0; i<arr.length;i++){
//             ans.add(arr[i]);
//             if(ans.size()==26){
//                 break;
//             }
//         }
//         if(ans.size()==26){
//             return true;
//         }
//         return false;
        
//     }
// }


class Solution {
    public boolean checkIfPangram(String sentence) {
        for (int i=97; i<123;i++){
            char ch= (char)i;
            if (!sentence.contains(String.valueOf(ch))){
                return false;
            }

        }
        return true;       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna