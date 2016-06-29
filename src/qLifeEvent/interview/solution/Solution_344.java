package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/reverse-string/ Given s = "hello", return "olleh".
 * 
 * @author ql030422
 * 
 */
public class Solution_344 {
    public String reverseString(final String s) {
        if (s == null) {
            return null;
        }
        if (s == "") {
            return "";
        }

        final char[] charArray = s.toCharArray();
        for (int i = 0, j = charArray.length - 1; i <= j; i++, j--) {
            final char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        return new String(charArray);
    }
}
