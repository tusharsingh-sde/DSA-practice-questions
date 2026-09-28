class Solution {
    public int maxDepth(String s) {
        int count =0;
        int maxcount=0;
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            if (ch == '('){
                count++;
            }
            if (ch== ')'){
                count --;
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna