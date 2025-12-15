class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        The easiest thing to do is use the difference between the current index 
        and the target. Cal the difference, then check if the difference is a key.

        If no then youve never had an element that when added to the current 
        element will make the sum. So add the current element as a key and its index
        as the value. 

        If yes then return the value for that difference key and the current element.
        */ 
        int[] result = new int[2];
        Map<Integer, Integer> hm = new HashMap<>();
        int difference;
        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];
            if(hm.containsKey(difference)){
                result[0] = hm.get(difference);
                result[1] = i;
                return result;
            }
            hm.put(nums[i], i);
        }
        return result;
    }
}
