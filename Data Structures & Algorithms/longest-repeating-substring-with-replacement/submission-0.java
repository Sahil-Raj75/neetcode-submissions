class Solution {
    static int findMax(int[] arr){
        int maxfreq = 0;
        for(int i = 0; i<arr.length; i++){
            if(maxfreq < arr[i]){
                maxfreq = arr[i];
            }
        }
        return maxfreq;
    }
    public int characterReplacement(String s, int k) {
        int res = 0;
        int low = 0;

        int[] freq = new int[26];

        for(int high = 0; high<s.length(); high++){
            char chAtHigh = s.charAt(high);

            freq[chAtHigh - 'A']++;

            int currLen = high - low + 1;
            int maxFreq = findMax(freq);
            int diff = currLen - maxFreq;

            // number of char to replace in the window is more than the k
            //shrink the winow untill valid 
            while(diff > k){
                char charAtLow = s.charAt(low);
                freq[charAtLow - 'A']--;
                low++;
                currLen = high - low + 1;
                maxFreq = findMax(freq);
                diff = currLen - maxFreq;
            }

            // window can be valid (k >= number of char to be replace)
            res = Math.max(res,currLen);
        }

        return res;
    }
}