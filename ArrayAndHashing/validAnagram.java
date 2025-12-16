class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a'] ++; //add 1 to the count of the letter at s[i]
            count[t.charAt(i) - 'a'] --; //sub 1 to the count of the letter at s[i]
        }
        for(int elem: count){
            if(elem !=0) return false;
        }
        return true;
    }

    // you can do for all potential string characters using a hashmap
    // set the key to be your char and add or sub your value the same way
    // then check all values =0. Little more memory intensive but best
    // overal for flexibility.
}


/*
Basic solution
Spped
O(n log n) 
Memory
O(n)
 if(s.length() != t.length()){
            return false;
        }
        char[] sCharArray = s.toCharArray();
        Arrays.sort(sCharArray);
        char[] tCharArray = t.toCharArray();
        Arrays.sort(tCharArray);

        for(int i = 0; i < s.length(); i++){
            if(sCharArray[i] != tCharArray[i]){
                return false;
            }
        }
        return true;
*/
