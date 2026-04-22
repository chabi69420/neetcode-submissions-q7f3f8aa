class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;       // edge case

        int left = 1;
        int right = x;
        int ans = 0;                // stores best valid answer so far

        while (left <= right) {
            int mid = left + (right - left) / 2;  // overflow-safe

            if ((long) mid * mid <= x) {   // ✅ valid — save and go RIGHT
                ans = mid;
                left = mid + 1;
            } else {                       // ❌ too big — go LEFT
                right = mid - 1;
            }
        }

        return ans;
    }
}