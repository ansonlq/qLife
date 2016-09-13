package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string/
 * 
 * @author ql030422
 * 
 */
public class Solution_151 {
    public String reverseWordsNaive(final String input) {
        final String s = input.trim();
        final char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {

        }

        final String[] stringArray = s.split(" ");
        int start = 0;
        int end = stringArray.length - 1;
        while (start <= end) {
            final String temp = stringArray[start];
            stringArray[start] = stringArray[end];
            stringArray[end] = temp;
            start++;
            end--;
        }
        final StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            if (i == stringArray.length - 1) {
                builder2.append(stringArray[i]);
                continue;
            }
            builder2.append(stringArray[i] + " ");
        }
        return builder2.toString();
    }

    public String reverseWords(final String s) {
        final String[] strs = s.split(" ");
        final List<String> words = new ArrayList<String>();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (!strs[i].isEmpty()) {
                words.add(strs[i]);
            }
        }
        return "";
        // return String.join(" ", words);
    }
}
