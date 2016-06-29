package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/shortest-word-distance/ Given a list of words and two words word1 and word2, return the
 * 
 * shortest distance between these two words in the list.
 * 
 * For example, Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 * 
 * Given word1 = “coding”, word2 = “practice”, return 3. Given word1 = "makes", word2 = "coding", return 1.
 * 
 * @author ql030422
 * 
 */
public class Solution_243 {
    public int shortestDistance(final String[] words, final String word1, final String word2) {
        int wordIndex1 = -1;
        int wordIndex2 = -1;
        int distance = Integer.MAX_VALUE;

        if (words == null || words.length == 0) {
            return 0;
        }

        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i] == null) {
                continue;
            }

            if (words[i].equals(word1)) {
                wordIndex1 = i;
            } else if (words[i].equals(word2)) {
                wordIndex2 = i;
            }

            if (wordIndex1 != -1 && wordIndex2 != -1) {
                final int temp = Math.abs(wordIndex1 - wordIndex2);
                if (temp < distance) {
                    distance = temp;
                }
            }
        }

        return distance;
    }
}
