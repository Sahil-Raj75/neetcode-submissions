class Solution {
    public List<List<Integer>> generate(int numRows) {
        // start and end pe 1;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i < numRows ; i++){

            List<Integer> row = new ArrayList<>();
            // sara array k starting me 1 add kre ga
            row.add(1);

            // size 3 hone cahiye tab he equation lage ga
            if(i > 1){
                // i = 2 then it will strt  
                for(int j = 1 ; j<i;j++){
                    int value = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    row.add(value);
                }
            }

            if(i>0){
                row.add(1);
            }

            list.add(row);
        }

        return list;
    }
}