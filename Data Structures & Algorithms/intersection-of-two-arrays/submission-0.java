class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hm1 = new HashSet<>();
        HashSet<Integer> hm2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();


        for(int num : nums1){
            if(!hm1.contains(num)){
            hm1.add(num);
            }
        }
        for(int num2 : nums2){
            if(!hm2.contains(num2)){
            hm2.add(num2);
            }
        }
        for(int val : hm2){
            if(hm1.contains(val)){
                list.add(val);
            }
        }

        int[] arr = new int[list.size()];
        int i =0;
        while(i<arr.length){
            arr[i] = list.get(i);
            i++;
        }

        return arr;
    }
}