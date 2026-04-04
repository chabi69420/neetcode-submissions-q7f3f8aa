class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];          // Line 1
        int left = 0;                       // Line 2
        int maxFreq = 0;                    // Line 3
        int result = 0;                     // Line 4

        for (int right = 0; right < s.length(); right++) {  // Line 5
            freq[s.charAt(right) - 'A']++;                   // Line 6
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']); // Line 7

            int windowSize = right - left + 1;               // Line 8

            if (windowSize - maxFreq > k) {                  // Line 9
                freq[s.charAt(left) - 'A']--;                // Line 10
                left++;                                       // Line 11
            }

            result = Math.max(result, right - left + 1);     // Line 12
        }

        return result;                                        // Line 13
    }
}