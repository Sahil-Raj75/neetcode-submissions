class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalLength = m+n;
        int readIndex = 0;
        int writeIndex = m;
        while(writeIndex < totalLength){
            nums1[writeIndex] = nums2[readIndex];
            writeIndex++;
            readIndex++;
        }

        Arrays.sort(nums1);
    }
}