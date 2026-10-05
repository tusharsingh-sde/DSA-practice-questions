// class Solution {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//         String s1 = String.join("", word1);
//         String s2 = String.join("", word2);
//         return s1.equals(s2);
        
//     }
// }

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a ="";
        String b = "";
        for (String str : word1){
            a+=str;
        }
        for (String str : word2) {
            b+=str;
        }
        return a.equals(b);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna