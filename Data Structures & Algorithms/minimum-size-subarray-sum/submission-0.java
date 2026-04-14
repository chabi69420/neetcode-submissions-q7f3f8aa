class Solution {
    public int minSubArrayLen(int target, int[] nums) {//two pointers and sliding window logic 
        
        int left = 0;//TC = O(n)   SC = O(1)
                int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            
            sum += nums[right];

            while(sum >= target){
                
                minLength = Math.min(minLength, right - left + 1);
                
                sum -= nums[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}