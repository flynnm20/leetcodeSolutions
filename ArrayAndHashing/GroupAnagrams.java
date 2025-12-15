class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // sort each String chars as you pass it into alphabetical order 
        // if that alphabetical order exists as a key then append the string to the value
        // if it doesn't exist then add it and the String

        Map<String, List<String>> result = new HashMap<>();
        String alphString;
        List<String> newList;
        char[] alphOrder;
        for(String current: strs){
            alphOrder = current.toCharArray();
            Arrays.sort(alphOrder);
            alphString = new String(alphOrder);
            if(result.get(alphString) == null){
                newList = new ArrayList<String>();
                newList.add(current);
                result.put(alphString, newList);
            } else {
                newList = result.get(alphString);
                newList.add(current);
                result.put(alphString, newList);
            }
        }
        List<List<String>> output = new ArrayList<List<String>>();
        for(String elem: result.keySet()){
            output.add(result.get(elem));
        }
        return output;
    }
}
