/** 
 * The guess API is already defined:
 * int guess(int num); → -1, 0, or 1
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;//searches start from 1 to n 
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // overflow-safe midpoint

            int result = guess(mid);               // ask the API

            if (result == 0) {       // ✅ correct guess
                return mid;
            } else if (result == 1) { // 📈 too low → go right
                left = mid + 1;
            } else {                  // 📉 too high → go left
                right = mid - 1;
            }
        }

        return -1; // never reached if input is valid
    }
}