class Solution {
    public int majorityElement(int[] nums) {//Boyer-Moore Voting Algorithm
                                            //Idea If two numbers are different → cancel them->Majority element will remain at end       
        int candidate = 0;//possible majority element
        int count = 0;//voting counter
        
        for(int num : nums){
            if(count == 0){//If count becomes 0 → choose new candidate
                candidate = num;
            }
            
            if(num == candidate){
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}