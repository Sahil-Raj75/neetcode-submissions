class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        int total = 0;
        for(String ops : operations){
            if(ops.equals("+")){
                int sum = (record.peek() + record.get(record.size()-2));
                record.push(sum);
            }
            else if(ops.equals("D")){
                int dbl = record.peek() *2;
                record.push(dbl);
            }
            else if(ops.equals("C")){
                if(!record.isEmpty()){
                record.pop();
                }
            }
            else{
                record.push(Integer.parseInt(ops));
            }
        }
        while (!record.isEmpty()) {
        total += record.pop();
        }
        return total;
    }
}