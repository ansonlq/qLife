package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/palindrome-pairs/
 * 
 * @author ql030422
 * 
 */
public class Solution_336 {

    /**
     * 优势:单词长 劣势：单词量如果很多，速度会比较慢
     * 
     * @param words
     * @return
     */
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

    /**
     * 优势:如果单词量很多但是每个单词都比较短，这个方法有优势，但是如果有一个单词非常非常长，这个方法就是有劣势
     * 
     * @param words
     * @return
     */
    public List<List<Integer>> palindromePairs2(final String[] words) {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        final List<List<Integer>> resultOuterList = new ArrayList<List<Integer>>();

        // 先把目标值全部放在一起
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            final String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                final String first = word.substring(0, j);
                final String second = word.substring(j);

                if (isPalindromic(first, "")) {
                    final String secondReverse = new StringBuilder(second).reverse().toString();
                    if (map.containsKey(secondReverse) && map.get(secondReverse) != i) {
                        final List<Integer> integerList = new ArrayList<Integer>();
                        integerList.add(map.get(secondReverse));
                        integerList.add(i);
                        resultOuterList.add(integerList);
                    }
                }

                if (isPalindromic(second, "")) {
                    final String firstReverse = new StringBuilder(first).reverse().toString();
                    if (map.containsKey(firstReverse) && map.get(firstReverse) != i && second.length() != 0) {
                        final List<Integer> integerList = new ArrayList<Integer>();
                        integerList.add(i);
                        integerList.add(map.get(firstReverse));
                        resultOuterList.add(integerList);
                    }
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
