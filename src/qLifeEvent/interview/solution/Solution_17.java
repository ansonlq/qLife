package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * 
 * @author ql030422
 * 
 */
public class Solution_17 {
    public List<String> letterCombinations(final String digits) {
        final List<String> wordsList = new ArrayList<String>();

        if (digits == null || digits.length() == 0) {
            return wordsList;
        }

        final Map<Character, String> map = new HashMap<Character, String>();
        map.put('1', "");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        map.put('0', "");

        for (int i = 0; i < digits.length(); i++) {
            final char index = digits.charAt(i);
            wordsList.add(map.get(index));
        }

        final StringBuilder stringBuilder = new StringBuilder();
        final List<String> output = new ArrayList<String>();

        return convertString(wordsList, stringBuilder, output);
    }

    public List<String> convertString(final List<String> wordsList, final StringBuilder stringBuilder,
            List<String> output) {

        if (wordsList == null || wordsList.size() == 0) {
            output.add(stringBuilder.toString());
            return output;
        }

        final String word = wordsList.get(0);
        final List<String> next = wordsList.subList(1, wordsList.size());
        for (int j = 0; j < word.length(); j++) {
            final char character = word.charAt(j);
            stringBuilder.append(character);
            output = convertString(next, stringBuilder, output);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        return output;
    }
}
