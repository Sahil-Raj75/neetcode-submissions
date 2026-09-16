class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int diff = sum - k;

            if (map.containsKey(diff)) {
                count += map.get(diff);
            }

            // SUM ISS LIYE STORE KR RHE KYU KI BAAD ME AGAR KOI DIFF AATA HAI THO HUM CHECK KR SAKE KI KYA PEHLE KISI SUBARRAY KA SUM DIFF KE BARABAR HIA KYA 

            // TAB THO (sum - k) + (k) = sum 
            // is liye sum store kr rhe 
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}