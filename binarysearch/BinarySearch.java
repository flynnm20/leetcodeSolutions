class Solution {
    public int search(int[] nums, int target) {
        // implement binary search
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int offset = (right - left)/2;
            int i = left + offset;

            if(nums[i] == target){
                return i;
            } 
            else if(nums[i] < target){
                left = ++i;
            }
            else {
                right = --i;
            }
        }
        return -1;
        
    }
}
