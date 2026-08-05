class Solution {
    static void solve(String digits, String[] mappedString, int index, StringBuilder sb, List<String> result){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';
        String mapString = mappedString[digit];

        for(char ch : mapString.toCharArray()){

            sb.append(ch);
            solve(digits,mappedString,index+1,sb,result);

            // backtrack or undo step;
            sb.deleteCharAt(sb.length()-1);

        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0){
            return new ArrayList<>();
        }
        String[] mappedString = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index = 0;
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        solve(digits, mappedString, index, sb, result);
        return result;
    }
}