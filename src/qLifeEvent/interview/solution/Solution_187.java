package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/repeated-dna-sequences/
 * 
 * @author ql030422
 * 
 */
public class Solution_187 {
    public List<String> findRepeatedDnaSequences(final String s) {
        final Set<String> letterSet = new HashSet<String>();
        final List<String> output = new ArrayList<String>();

        if (s.length() == 0) {
            return output;
        }

        if (s.length() <= 10) {
            output.add(s);
            return output;
        }

        for (int i = 0; i < s.length() - 11; i++) {
            final String input = s.substring(i, i + 10);
            if (letterSet.contains(input)) {
                output.add(input);
                continue;
            }
            letterSet.add(input);
        }
        return output;
    }
}
