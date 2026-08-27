class Solution {
    static void solve( int[] array, int index, List<List<Integer>> result, List<Integer> outputSub) {
        if (index >= array.length) {
            result.add(new ArrayList<>(outputSub));
            return;
        }

        // include
        outputSub.add(array[index]);
        solve(array, index+1, result, outputSub);

        // backtracking
        outputSub.remove(outputSub.size() - 1);

        // exclude
        solve(array, index + 1, result, outputSub);
    }
    public List<List<Integer>> subsets(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> outputSub = new ArrayList<>();
        
        int index = 0;
        solve(array, index, result, outputSub);

        return result;
    }
}