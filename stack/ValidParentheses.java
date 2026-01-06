class Solution {
    public boolean isValid(String s) {
        // create a stack and add the open paranetheses to it.
        // if you see a close parantheses check top of stack. 
        // if yes, pop and continue else return false. 

        char openBrack = '(';
        char closeBrack = ')';
        char openCurl = '{';
        char closeCurl = '}';
        char openSquare = '[';
        char closeSquare = ']';
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()){
            if(c == openBrack || c == openCurl || c == openSquare){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
                
                char top = stack.pop();

                if((top == openBrack && c == closeBrack)
                    || (top == openCurl && c == closeCurl)
                    || (top == openSquare && c == closeSquare)){
                        continue;
                } else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
