class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] output = new int[n];
        int plusOne = 1; // always adding one to begin with
        for(int i = n-1; i >= 0; i--){
            int newValue = digits[i] + plusOne; // get the last index
            if(newValue > 9){
                output[i] = 0;
                plusOne = 1;
            } else {
                output[i] = newValue;
                plusOne=0;
            }
        }

        // now we need to deal with the edge case of the leading 0;
        if (output[0] != 0){
            return output;
        } 
        int[] leadingZeroOutput = new int[n+1];
        leadingZeroOutput[0] = 1;
        for(int i = 0; i < output.length;i++){
            leadingZeroOutput[i+1] = output[i];
        }
        return leadingZeroOutput;
    }
}

/* 
Step 1.

Inputs are an array of single digit numbers

Add one to the right most number, if it then =10 set to 0 then add one to the next index to the left.

repeat until you have an array represnting the output of adding one to the number.


Step 2: 
What algorithm are we using
Deals with sums and addatives so it is a prefex sums problem fundementally with a little bit of complexity as we have to return an array.

        int n = arr.length;
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(arr[0]);
        for (int i = 1; i < n; i++)
            prefixSum.add(prefixSum.get(i - 1) + arr[i]);
        return prefixSum


Step 3 implementation
Prefix sum works when you have a list 
[1,2,3,4] and you return an arraylist where each i is the sum of everything that came before. 

We can edit this to work in reverse order and only add 1 when you need to else can break and return. 

        int n = arr.length;
        int[] output = new int[n];
        int plusOne = 1; always adding one to begin with
        for(int i = n-1; i >= 0; i++){
            int newValue = arr[i] + plusOne; // get the last index
            if(newValue > 9){
                output[i] = 0;
                plusOne = 1;
            } else {
                output = newValue;
                plusOne=0
            }
        }

        now we need to deal with the edge case of the leading 0;
        if (output[0] != 0) {
            return output;
        } 
        int[] leadingZeroOutput = new int[n+1];
        leadingZeroOutput[0] = 1;
        for(int i = 0; i < output.length;i++){
            leadingZeroOutput[i+1] = output[n];
        }
        return leadingZeroOutput;

Definitely not the fastest way to do this but does the job. still O(N)
*/
