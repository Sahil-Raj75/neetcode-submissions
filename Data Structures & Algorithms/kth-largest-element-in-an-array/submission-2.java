class Solution {
    public int findKthLargest(int[] nums, int k) {
        // min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // first k elements add kr lo taki utne me se k-th largest mil jaye
        // 2,3 me bhi 2nd largest (2 hoga).

        for(int i = 0; i<k; i++){
            pq.add(nums[i]);
        }
        
        for(int j = k; j<nums.length; j++){
            if(pq.peek() < nums[j]){
                pq.poll();
                pq.add(nums[j]);
            }
        }
        return pq.peek();
    }
}