package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-pairs/
 * 
 * @author ql030422
 * 
 */
public class Solution_336 {

    // Time Limit Exceeded,如果有很多很多words,可能会超时
    public List<List<Integer>> palindromePairs(final String[] words) {
        final List<List<Integer>> resultOuterList = new ArrayList<List<Integer>>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }

                if (isPalindromic(words[i], words[j])) {
                    final List<Integer> integerList = new ArrayList<Integer>();
                    integerList.add(i);
                    integerList.add(j);
                    resultOuterList.add(integerList);
                }
            }
        }
        return resultOuterList;
    }

    public boolean isPalindromic(final String first, final String second) {

        final String all = first + second;
        int start = 0;
        int end = all.length() - 1;

        while (start <= end) {
            if (all.charAt(end) != all.charAt(start)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
