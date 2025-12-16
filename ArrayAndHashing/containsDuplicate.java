class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setOfSeen = new HashSet();
        for(int elem : nums){
            if(!setOfSeen.add(elem)) {
                return true;
            }
        }
        return false; 
    }
}
