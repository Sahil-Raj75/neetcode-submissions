class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer,Integer> frequencymap = new HashMap<>();

        for(int i : nums){
            frequencymap.put(i,frequencymap.getOrDefault(i,0)+1);
        }
        for(int key : frequencymap.keySet()){
            int frequency = frequencymap.get(key);
                if(bucket[frequency]== null){
                    bucket[frequency]=new ArrayList<>();
                }
                bucket[frequency].add(key);
            }
        int[] result = new int[k];
        int counter = 0;
        for(int position = bucket.length -1 ; position>=0 && counter < k ; position--){
            if(bucket[position] != null){
                for(int hold : bucket[position]){
                    result[counter++] = hold;
                }
            }
        }
        return result;
    }
}
