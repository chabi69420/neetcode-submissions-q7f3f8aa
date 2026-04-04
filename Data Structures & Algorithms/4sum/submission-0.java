

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList<>();//create new array to store result 
        
        Arrays.sort(nums);//sort the array 

        for(int i = 0; i < nums.length - 3; i++){//We fix the first element of the quadruplet.Why length - 3?

//Because we still need 3 more numbers.

            if(i > 0 && nums[i] == nums[i-1])//Skip duplicate first numbers
                continue;

            for(int j = i + 1; j < nums.length - 2; j++){//fix 2nd element 

                if(j > i + 1 && nums[j] == nums[j-1])//Skip duplicate second numbers
                    continue;

                int left = j + 1;
                int right = nums.length - 1;

                while(left < right){

                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target){

                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        left++;
                        right--;

                        while(left < right && nums[left] == nums[left-1])
                            left++;

                        while(left < right && nums[right] == nums[right+1])
                            right--;
                    }

                    else if(sum < target)
                        left++;

                    else
                        right--;
                }
            }
        }

        return result;
    }
}