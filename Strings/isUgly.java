class Solution {
    public boolean isUgly(int n) {
        // positive integer which doesn't have a prime factor other then 2 3 and 5.
        boolean finished = false;
        if(n <= 0){
            return false;
        }
        while(!finished){
           if(n % 5 == 0){
                n = n/5;
                continue;             
           } else if (n % 3 == 0) {
                n = n/3;
                continue;
           } else if  (n % 2 == 0){
                n = n/2; 
                continue;
           }
           if(n == 1){
            return true;
           } else {
            return false;
           }
        }
        return false;
    }
}
