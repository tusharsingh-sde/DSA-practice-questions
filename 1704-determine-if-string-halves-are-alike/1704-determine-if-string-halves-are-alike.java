class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int i = 0;
        int mid = n/2;
        int j = mid;
        String vowels ="aeiouAEIOU";
        int count1 = 0;
        int count2 = 0;

        while (i<mid && j<n){
            if (vowels.indexOf(s.charAt(i))!=-1){
                count1++;
            } if(vowels.indexOf(s.charAt(j))!=-1){
                count2++;
            }
            i++;
            j++;
        }
        return count1==count2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna