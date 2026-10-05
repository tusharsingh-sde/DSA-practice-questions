class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        //take a index variable to score the result on that index
        int index = 0;
        int i = 0;

        while (i < n) {
            //take the current character and count is 0
            char curr_char = chars[i];
            int count = 0;

            //count how many occurance of a same character
            while (i < n && chars[i] == curr_char) {
                count++;
                i++;
            }

            //assign the current character ans increase the index
            chars[index] = curr_char;
            index++;

            //if our count is greater is 1 then
            if (count > 1) {
                //convert the count into string
                String s = Integer.toString(count);

                //store every character in a single element of the char array
                for (char ch : s.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        //return the length of the index
        return index;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna