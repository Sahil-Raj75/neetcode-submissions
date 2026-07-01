class Solution {
    private boolean compare(HashMap<Character, Integer> m1, HashMap<Character, Integer> m2) {
        return m1.equals(m2);
    }
    public boolean checkInclusion(String s1, String s2) {
        // frequency table bana rhe hone s1 and s2 ka
        // window of s1 ke haisab se ccheck kr rhe honge match kiya ho gya tho return true
        // nhi tho old char ka frequency-- and put new character
        // if both table is equal means found the permutation (s1= ab hai tho s2 me (ba) allthough
        // character sath honge cuz its permutation)

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap();
        HashMap<Character, Integer> map2 = new HashMap();
        // first frequency table for s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // first frequency table for s2 of size of s1
        int windowSize = s1.length();
        for (int j = 0; j < windowSize; j++) {
            char ch = s2.charAt(j);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        if (compare(map1, map2) == true) {
            return true;
        }

        else {
            // new charcter put mltb remove the first char of old window
            int i = s1.length();
            while (i < s2.length()) {
                // put and remove the first char freq
                char ch = s2.charAt(i);
                char oldChar = s2.charAt(i - s1.length());
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
                map2.put(oldChar, map2.getOrDefault(oldChar, 0) - 1);

                // map tabhi equals hoga jab map ke elements bhi same he ho dono map  main tho iss liye remove krna pare ga mao se if freq - 0
                if (map2.get(oldChar) == 0) {
                    map2.remove(oldChar);
                }

                if (compare(map1, map2) == true) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}
