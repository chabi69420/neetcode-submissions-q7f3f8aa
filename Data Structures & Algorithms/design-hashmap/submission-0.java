                
        
class MyHashMap {

    int[] map;

    public MyHashMap() {
        map = new int[1000001];//create array 
        
        for(int i = 0; i < map.length; i++){
            map[i] = -1;//Initialize all values to -1
        }
    }
    
    public void put(int key, int value) {
        map[key] = value;//Store value
    }
    
    public int get(int key) {
        return map[key];//return value 
    }
    
    public void remove(int key) {
        map[key] = -1;//remove element //TC =O(1)
    }
}