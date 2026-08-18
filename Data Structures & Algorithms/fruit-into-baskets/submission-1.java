class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int low = 0;
        int res = 0;    
        int n = fruits.length;
        
        for(int high =0; high<n; high++){
            int fruit = fruits[high];
            map.put(fruit,map.getOrDefault(fruit,0)+1);
            
            while(map.size() > 2){
                int fruitAtLow = fruits[low];
                map.put(fruitAtLow,map.get(fruitAtLow)-1);
                if(map.get(fruitAtLow) == 0){
                    map.remove(fruitAtLow);
                }
                low++;
            }
            
            if(map.size() == 2){
                int len = high - low + 1;
                res = Math.max(res,len);
            }
        }
        
        return map.size() <2 ? fruits.length : res;
    }
}