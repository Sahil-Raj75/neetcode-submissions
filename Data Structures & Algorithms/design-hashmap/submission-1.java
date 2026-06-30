class MyHashMap {
     int[] obj = new int[1000001];
    public MyHashMap() {
        Arrays.fill(obj,-1);
    }
    
    public void put(int key, int value) {
        obj[key]= value;
    }
    
    public int get(int key) {
        return obj[key];
    }
    
    public void remove(int key) {
        obj[key] =-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */