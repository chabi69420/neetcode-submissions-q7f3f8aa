class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {//hashing problem 
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){//Loop through each word
            
            char[] arr = s.toCharArray();//Convert string → character array
            Arrays.sort(arr);//Sort characters
            
            String key = new String(arr);//Convert back to string
            
            if(!map.containsKey(key)){//Check if key exists
                map.put(key, new ArrayList<>());//Create new list if key doesn't exist
            }
            
            map.get(key).add(s);//Add original word to list
        }
        
        return new ArrayList<>(map.values());//Return all grouped anagrams
    }
}