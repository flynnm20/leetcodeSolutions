class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int lhs = 0;
        int maxlength = 0;

        for (int rhs = 0; rhs < s.length(); rhs++) {
            char c = s.charAt(rhs);

            if (hm.containsKey(c)) {
                lhs = Math.max(lhs, hm.get(c) + 1);
            }

            hm.put(c, rhs);
            maxlength = Math.max(maxlength, rhs - lhs + 1);
        }
        
        return maxlength;
    }
}
