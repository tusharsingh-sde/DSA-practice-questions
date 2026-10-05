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