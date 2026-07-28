class Solution {
    static void solve(int[] candidates, int target, List<Integer> TempSubarray, int index,
            List<List<Integer>> FinalResultArray) {
        //base-case - sum agar 0 hota hai tho add to result list
        if (target == 0) {
            FinalResultArray.add(new ArrayList<>(TempSubarray));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }

        // 1 case solve kr rhe
        // include 
        TempSubarray.add(candidates[index]);
        solve(candidates, target - candidates[index], TempSubarray, index, FinalResultArray);

        //backtracking me remove krenge kyu?
        // include ke baad jab return aa rha hoga yahanpe tho subarray me wo number hoga tho last numbe ko remove krna hoga 
        TempSubarray.remove(TempSubarray.size() - 1);
        // exclude
        solve(candidates, target, TempSubarray, index + 1, FinalResultArray);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> FinalResultArray = new ArrayList<>();
        List<Integer> TempSubarray = new ArrayList<>();
        int index = 0;

        solve(candidates, target, TempSubarray, index, FinalResultArray);
        return FinalResultArray;
    }
}