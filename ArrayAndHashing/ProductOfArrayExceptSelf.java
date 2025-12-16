class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right =new int[nums.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for(int i = 1; i < left.length; i++){
            left[i] = nums[i-1] * left[i-1];
        }
        for(int i = right.length-2; i >= 0; i--){
            right[i] = nums[i+1] * right[i+1];
        }
        int[] output = new int[nums.length];
        for(int i = 0; i < output.length; i++){
            output[i] = left[i] * right[i];
        }    
        return output;
    }
}
