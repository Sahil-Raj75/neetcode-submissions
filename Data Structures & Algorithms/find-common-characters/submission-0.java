class Solution {
    static String  Reccommon(String[] arr , int index, String common){
        // base-case
        if(index == arr.length){
            return common;
        }

        // 1 case hum solve kr rhe
       HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        // map me sara add kr rhe 
        for(char ch : common.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            System.out.println(ch);
        }
        // next element se compare karenge or common nikalnge 
        for(char c : arr[index].toCharArray()){
            if(map.containsKey(c) && map.get(c)>0){
                sb.append(c);
                map.put(c, map.get(c) - 1);
            }
        }

        //common ban chuka hai 2 string ka 
        common = sb.toString();

        // recursion call mar denge
       return Reccommon(arr , index+1, common);
    }
    public List<String> commonChars(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String str = Reccommon(words,1, words[0]);

        for(int i=0; i<str.length(); i++){
            String word = str.substring(i,i+1);
            list.add(word);
        }

        return list;
    }
}