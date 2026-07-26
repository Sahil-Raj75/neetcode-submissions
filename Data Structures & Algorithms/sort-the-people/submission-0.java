class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i<heights.length; i++){
            map.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

        String[] ans = new String[names.length];
        int i = 0;
        for(int idx = heights.length -1 ; idx >=0 ; idx--){
            ans[i++] = map.get(heights[idx]); 
        }
        return ans;
    }
}