class Solution {
    public int climbStairs(int n) {
        int output = 1;
        int[] visited = new int[n+1];

        return helper(n, visited);
    }

    private int helper(int n, int[] visited){
        // base case
        if(n <= 0) {
            return 0;
        }
        else if(n <= 2){
            // if 2 or 1
            return n;
        }
        else if(visited[n] != 0){
            return visited[n];
        }
        else{
            // dp[n] = dp[n-1] + dp[n-2]
            visited[n] = helper(n-1, visited) + helper(n-2, visited); 
            return visited[n];
        }

    }

// Dynamic programming. 
/*  Step 1 is it dynamic?
    Yes, you're looking for combinations of paths/ unique paths. 

    Step 2: what is your DP state? i.e. what do you need at each stage to figure out how many unique ways to reach step n?

    Wrong instinct. How many ways can you reach step N?

    you are either coming from a 2 step or 1 step.

    so therefore dp[n] is the sum of dp[n-1] and dp[n-2]

    Step 3: Define our recurrsion

    dp[n]=dp[n-1] + dp[n-2]

    step 3 base case. 

    0 -> nothing
    1-> 1
    2 = d[1] + d[0] = 2
    3 = d[2] + d[1] = 3
    4 = d[3] + d[4] = 5 etc.

    Step 4 Write our code.
*/
}
