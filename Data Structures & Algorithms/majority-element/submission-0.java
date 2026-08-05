class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int majorityEl = 0;
        int currMaxCount = 0;

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num) > currMaxCount){
                currMaxCount = map.get(num);
                majorityEl = num;
            }
        }
        return majorityEl;
    }
}