`class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j = 1; j < i; j++){
                List<Integer> prevRow = output.get(i - 1);
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            if(i > 0){
                row.add(1);
            }
            output.add(row);
        }
        return output;
    }
}
