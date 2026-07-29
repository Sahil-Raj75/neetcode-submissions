class Solution {
    static void solve(
        int[] array, int index, List<List<Integer>> FinalResultList, List<Integer> Subarray) {
        if (index >= array.length) {
            FinalResultList.add(new ArrayList<>(Subarray));
            return;
        }

        // include
        int num = array[index];
        Subarray.add(num);
        solve(array, index + 1, FinalResultList, Subarray);

        Subarray.remove(Subarray.size() - 1);

        solve(array, index + 1, FinalResultList, Subarray);
    }
    public List<List<Integer>> subsets(int[] array) {
        List<List<Integer>> FinalResultList = new ArrayList<>();
        List<Integer> Subarray = new ArrayList<>();
        
        int index = 0;
        solve(array, index, FinalResultList, Subarray);

        return FinalResultList;
    }
}