class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {               // 1. keep going while window is valid
            int mid = left + (right - left) / 2; // 2. find middle (overflow-safe)

            if (nums[mid] == target) {        // 3a. found it!
                return mid;
            } else if (nums[mid] < target) { // 3b. target is to the RIGHT
                left = mid + 1;
            } else {                         // 3c. target is to the LEFT
                right = mid - 1;
            }
        }

        return -1; // 4. target not found
    }
}