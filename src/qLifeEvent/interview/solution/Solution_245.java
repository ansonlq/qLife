package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/shortest-word-distance-iii/
 * 
 * @author ql030422
 * 
 */
public class Solution_245 {
    public int shortestWordDistance(final String[] words, final String word1, final String word2) {
        if (words == null || words.length == 0 || word1 == null || word2 == null) {
            return 0;
        }

        int distance = Integer.MAX_VALUE;

        if (word1.equals(word2)) {
            int preIndex = -(words.length);
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word1) || words[i].equals(word2)) {
                    distance = Math.min(distance, i - preIndex);
                    preIndex = i;
                }
            }
            return distance;
        }

        int wordIndex1 = -1;
        int wordIndex2 = -1;
        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].equals(word1)) {
                wordIndex1 = i;
            } else if (words[i].equals(word2)) {
                wordIndex2 = i;
            }

            if (wordIndex1 != -1 && wordIndex2 != -1) {
                final int temp = Math.abs(wordIndex1 - wordIndex2);
                distance = Math.min(distance, temp);
            }
        }

        return distance;
    }

    public int shortestWordDistanceBetter(final String[] words, final String word1, final String word2) {

        if (words == null || words.length == 0 || word1 == null || word2 == null) {
            return 0;
        }

        int distance = Integer.MAX_VALUE;
        int wordIndex1 = -1;
        int wordIndex2 = -1;
        for (int i = 0; i <= words.length - 1; i++) {
            if (words[i].equals(word1)) {
                wordIndex1 = i;
                if (wordIndex2 != -1) {
                    final int temp = Math.abs(wordIndex1 - wordIndex2);
                    distance = Math.min(distance, temp);
                }
            }

            if (words[i].equals(word2)) {
                wordIndex2 = i;
                if (wordIndex1 != -1 && wordIndex2 != wordIndex1) {
                    final int temp = Math.abs(wordIndex1 - wordIndex2);
                    distance = Math.min(distance, temp);
                }
            }
        }

        return distance;

    }
}
