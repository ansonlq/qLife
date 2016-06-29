package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/plus-one/
 * 
 * @author ql030422
 * 
 */
public class Solution_66 {
    public int[] plusOne(final int[] digits) {
        boolean flag = false;
        final int[] result = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            int digitsNum = digits[digits.length - i - 1];

            if (i == 0) {
                digitsNum++;
            }

            if (flag) {
                digitsNum++;
            }

            int tempResult = 0;
            if (digitsNum >= 10) {
                tempResult = digitsNum - 10;
                flag = true;
            } else {
                tempResult = digitsNum;
                flag = false;
            }

            result[digits.length - i - 1] = tempResult;
        }

        if (flag) {
            final int[] resultEx = new int[result.length + 1];
            resultEx[0] = 1;
            for (int i = 0; i < result.length; i++) {
                resultEx[i + 1] = result[i];
            }
            return resultEx;
        }
        return result;
    }

    public int[] plueOthers(final int[] target, final int[] digits) {

        boolean flag = false;

        final int[] result = new int[target.length];
        // assume target > digits
        for (int i = 0; i < digits.length; i++) {
            final int targetNum = target[target.length - i - 1];
            final int digitsNum = digits[digits.length - i - 1];
            int temp = targetNum + digitsNum;

            if (flag) {
                temp++;
            }

            int tempResult = 0;

            if (temp >= 10) {
                flag = true;
                tempResult = temp - 10;
            } else {
                flag = false;
                tempResult = temp;
            }

            result[target.length - i - 1] = tempResult;

        }

        return null;
    }
}
