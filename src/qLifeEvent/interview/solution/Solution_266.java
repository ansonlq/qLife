package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/palindrome-permutation/
 * 
 * @author ql030422
 * 
 */
public class Solution_266 {
    public boolean canPermutePalindrome(final String s) {
        final int[] stringArray = new int[256];

        for (int i = 0; i < s.length(); i++) {
            stringArray[s.charAt(i)]++;
        }

        int odd = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] % 2 == 0) {
                continue;
            }

            if (stringArray[i] % 2 == 1) {
                odd++;
            }

            if (odd >= 2) {
                return false;
            }
        }
        return true;
    }
}
