package qLifeEvent.interview.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 * 
 * @author ql030422
 * 
 */
public class Solution_118 {
    public List<List<Integer>> generate(final int numRows) {
        final List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> preRow = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            final List<Integer> currRow = new ArrayList<Integer>(numRows + 2);
            if (i == 0) {
                preRow.add(0);
                preRow.add(1);
                preRow.add(0);
                currRow.add(1);
                result.add(currRow);
                continue;
            }

            for (int j = 0; j < preRow.size() + 1; j++) {
                if (j == 0 || j == preRow.size()) {
                    currRow.add(0);
                    continue;
                }

                final int element = preRow.get(j - 1) + preRow.get(j);
                currRow.add(element);
            }
            preRow = currRow;
            result.add(currRow.subList(1, currRow.size() - 1));
        }
        return result;
    }

    // 只选其中一排数字
    public List<Integer> getRow(final int rowIndex) {
        final Integer[] integers = new Integer[rowIndex + 1];
        integers[0] = 1;
        for (int col = 1; col <= rowIndex; col++) {
            // 算法： https://en.wikipedia.org/wiki/Binomial_theorem 用迭代代替。
            integers[col] = (int) ((long) integers[col - 1] * (rowIndex - col + 1) / col);
        }
        return Arrays.asList(integers);
    }

}
