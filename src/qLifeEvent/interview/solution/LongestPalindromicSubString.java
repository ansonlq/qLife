package qLifeEvent.interview.solution;

/*
 * http://articles.leetcode.com/longest-palindromic-substring-part-i 
 * O(N2) time and O(1) space:
 */
public class LongestPalindromicSubString {

    // 中间向两边扩散
    public String expandAroundCenter(final String s, final int c1, final int c2) {
        int start = c1;
        int end = c2;

        // 注意start>= 和 Start+1的问题，因为subString 方法的缘故，所以后面的end不用-1
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }

    public String longestPalindromeSimple(final String inputString) {
        final int length = inputString.length();
        String longest = "";
        if (length == 0) {
            return longest;
        }

        for (int i = 0; i < length - 1; i++) {
            // 不同的情况：例如aba
            final String oddCase = expandAroundCenter(inputString, i, i);
            if (oddCase.length() > longest.length()) {
                longest = oddCase;
            }

            // 不同的情况：例如abba
            final String evenCase = expandAroundCenter(inputString, i, i + 1);
            if (evenCase.length() > longest.length()) {
                longest = evenCase;
            }
        }
        return longest;
    }
}
