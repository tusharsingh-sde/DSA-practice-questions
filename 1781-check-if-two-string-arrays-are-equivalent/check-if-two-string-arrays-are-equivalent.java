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