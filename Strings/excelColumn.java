class Solution {
    public int titleToNumber(String columnTitle) {
        char[] charArray = columnTitle.toCharArray();
        int a = 'A';
        int output = 0;
        // A  in Ascii is 65. So our number value is char as int -64 
        
        // d(n) = (26^n * charValue) + d(n-1) 
        int n = 0;
        for(int i = charArray.length-1;  i >= 0; i--){
            int charValue =  charArray[i]-64;
            output = ((int)Math.pow(26, n) * charValue) + output; 
            n++; 
        }
        return output;
        
    }
}
