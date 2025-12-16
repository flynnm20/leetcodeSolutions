class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap();
        for(int num : nums){
            // get or default saves the null value and just gives 0 if it isn't there
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // bucket solution. Create an array of lists and store the key at their freq
        List<Integer>[] bucket = new List[nums.length +1];
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            int frequency = entry.getValue();
            int element = entry.getKey();
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList();
            }
            bucket[frequency].add(element);
        }

        int[] output = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i > 0 && index < k; i--){
            if(bucket[i] != null){
                for(int elem : bucket[i]){
                    output[index++] = elem;
                    if(index == k) {
                        break;
                    }
                }
            }
        }

        return output;

    }
}

/*
        Map<Integer, Integer> hm = new HashMap();
        int[] output = new int[k];
        for(int element : nums){
            if(hm.get(element) == null){
                hm.put(element, 1);
            } else {
                int val = hm.get(element) + 1;
                hm.put(element, val);
            }
        }

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList(hm.entrySet());
        sortedList.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        for(int i = 0; i < output.length; i++){
            output[i] = sortedList.get(i).getKey();
        }
        return output;

*/
