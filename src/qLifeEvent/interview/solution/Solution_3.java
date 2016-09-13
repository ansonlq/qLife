package qLifeEvent.interview.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 * @author ql030422
 * 
 */
public class Solution_3 {
    public int lengthOfLongestSubstring(final String s) {
        final char[] charArray = s.toCharArray();

        if (charArray.length <= 1) {
            return charArray.length;
        }

        final Set<String> record = new HashSet<String>();
        int longest = Integer.MIN_VALUE;
        int temp = 0;
        int start = 0;

        for (int i = 0; i < charArray.length; i++) {
            final String tempString = String.valueOf(charArray[i]);
            temp = i - start;
            if (!record.contains(tempString)) {
                record.add(tempString);
                longest = Math.max(record.size(), longest);
                continue;
            }

            longest = Math.max(temp, longest);
            while (record.contains(tempString)) {
                record.remove(String.valueOf(charArray[start++]));
            }
            record.add(tempString);
        }
        return longest;

    }
}
