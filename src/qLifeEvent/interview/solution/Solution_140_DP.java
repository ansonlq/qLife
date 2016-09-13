package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/word-break-ii/
 * 
 * @author ql030422
 * 
 */
public class Solution_140_DP {
    private final Map<String, List<String>> cache = new HashMap<String, List<String>>();

    private boolean containsSuffix(final Set<String> dict, final String str) {
        for (int i = 0; i < str.length(); i++) {
            if (dict.contains(str.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public List<String> wordBreakDP(final String s, final Set<String> wordDict) {
        if (cache.containsKey(s)) {
            return cache.get(s);
        }
        final List<String> result = new ArrayList<String>();
        if (wordDict.contains(s)) {
            result.add(s);
        }
        for (int i = 0; i < s.length(); i++) {
            final String left = s.substring(0, i);
            final String right = s.substring(i);
            if (wordDict.contains(left) && containsSuffix(wordDict, right)) {
                for (final String ss : wordBreak(right, wordDict)) {
                    result.add(left + " " + ss);
                }
            }
        }
        cache.put(s, result);
        return result;
    }

    // backtracking solution. Failed because of TLE
    public List<String> wordBreak(final String s, final Set<String> wordDict) {
        final List<String> result = new ArrayList<String>();
        final List<String> temp = new ArrayList<String>();
        backtarcking(result, temp, wordDict, s);
        return result;
    }

    public void backtarcking(final List<String> result, final List<String> temp, final Set<String> wordDict,
            final String subS) {
        // Base Case
        if (subS.length() == 0) {
            String words = "";
            for (final String word : temp) {
                words += word + " ";
            }
            result.add(words.substring(0, words.length() - 1));
            return;
        }

        // For Loop
        for (int i = 0; i <= subS.length(); i++) {
            final String value = subS.substring(0, i);
            if (wordDict.contains(value)) {
                temp.add(value);
                final String subString = subS.substring(i, subS.length());
                backtarcking(result, temp, wordDict, subString);
                temp.remove(temp.size() - 1);
            }
        }

        // Return
        return;
    }

}
