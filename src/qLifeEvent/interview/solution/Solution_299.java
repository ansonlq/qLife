package qLifeEvent.interview.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/bulls-and-cows/ "1122"/"2211": "0A4B" "1222"/"0111": "0A1B"
 * 
 * @author ql030422 2962 7236
 * 
 */
public class Solution_299 {
    public String getHint(final String secret, final String guess) {
        final int size = secret.length();
        int bull = 0;
        int cow = 0;
        final Map<String, Integer> secretSet = new HashMap<String, Integer>();
        final Map<String, Integer> guessSet = new HashMap<String, Integer>();

        for (int i = 0; i < size; i++) {
            final String sStr = String.valueOf(secret.charAt(i));
            final String gStr = String.valueOf(guess.charAt(i));

            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
                continue;
            }

            if (secretSet.containsKey(gStr)) {
                cow++;
                secretSet.put(gStr, secretSet.get(gStr) - 1);
                if (secretSet.get(gStr) == 0) {
                    secretSet.remove(gStr);
                }
            }

            if (guessSet.containsKey(sStr)) {
                cow++;
                guessSet.put(sStr, guessSet.get(sStr) - 1);
                if (guessSet.get(sStr) == 0) {
                    guessSet.remove(sStr);
                }
            }

            if (secretSet.containsKey(sStr)) {
                secretSet.put(sStr, secretSet.get(sStr) + 1);
            } else {
                secretSet.put(sStr, 1);
            }

            if (guessSet.containsKey(gStr)) {
                guessSet.put(gStr, guessSet.get(gStr) + 1);
            } else {
                guessSet.put(gStr, 1);
            }
        }

        return bull + "A" + cow + "B";
    }
}
