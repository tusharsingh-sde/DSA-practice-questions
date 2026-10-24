class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        for(char ch:ransomNote.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch)<=0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna