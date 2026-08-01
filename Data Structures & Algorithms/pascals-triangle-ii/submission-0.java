class Solution {
    public List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex+1;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> output = new ArrayList<>();

            output.add(1);
            if (i > 1) {
                for (int j = 1; j < i; j++) {
                    int val = res.get(i - 1).get(j) + res.get(i - 1).get(j - 1);
                    output.add(val);
                }
            }
            if (i > 0) {
                output.add(1);
            }

            res.add(output);
        }
        return res.get(rowIndex);
    }
}