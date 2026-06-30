class Solution {
    public String longestCommonPrefix(String[] strs) {
        // sort strs
        // check first and last 
        // take the 0 indices string 
        // iterate the last string and if last.charAt(i)==first.charAt(i) add it.
        StringBuilder sb =new StringBuilder();
         Arrays.sort(strs); //O(nlogn)
        
        String first = strs[0];
        String last = strs[strs.length - 1];
        int len =0;
        if(first.length()<last.length()){
            len = first.length();
        }
        else{
            len = last.length();
        }
        for(int i = 0 ; i<len; i++){
            if(first.charAt(0) != last.charAt(0)){return sb.toString();}
            if(first.charAt(i) == last.charAt(i)){
                sb.append(first.charAt(i));
            }
        }

        return sb.toString(); 
    }
}