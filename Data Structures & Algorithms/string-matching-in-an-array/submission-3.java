class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();

        for (String sub : words) {
            for (String word : words) {
                if (word != sub && word.contains(sub)) {
                        list.add(sub);
                        break;
                }
            }
        }
        return list;
    }
}