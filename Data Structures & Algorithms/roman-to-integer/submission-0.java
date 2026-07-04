class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        int i = 0;
        int j = i+1;
        
        while(i<s.length()){
            if(j<s.length() && map.get(s.charAt(i)) < map.get(s.charAt(j))){
                // diffrence nikalo
                ans+= map.get(s.charAt(j)) - map.get(s.charAt(i));
                i = i+2;
            }
            else{
                ans+= map.get(s.charAt(i));
                i++;
            }
            j=i+1;
        }

        return ans;
    }
}