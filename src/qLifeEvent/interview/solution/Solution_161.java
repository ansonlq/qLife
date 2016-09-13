package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_161 {
    public boolean isOneEditDistance(final String s, final String t) {

        if (Math.abs(s.length() - t.length()) > 1) {
            return false;
        }

        if (s.length() == t.length()) {
            if (s.length() == 0) {
                return false;
            }
            return isSameEqual(s, t);
        }

        if (s.length() > t.length()) {
            return isSameDiff(s, t);
        }

        return isSameDiff(t, s);
    }

    public boolean isSameEqual(final String s, final String t) {
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }

    public boolean isSameDiff(final String s, final String t) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.substring(i + 1).equals(t.substring(i));
            }
        }
        return true;
    }
}
