package qLifeEvent.interview.solution;

/**
 * https://leetcode.com/problems/decode-ways/
 * 
 * @author ql030422
 * 
 */
public class Solution_91 {
    public int numDecodings(final String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        final int[] dp = new int[s.length() + 1];

        // 如果s是null
        dp[0] = 1;

        // 起始状态是什么，记录下来
        if (s.charAt(0) == '0') {
            dp[1] = 0;
        } else {
            dp[1] = 1;
        }

        for (int i = 2; i <= s.length(); i++) {
            // 分两种情况，一种是去掉一位，判断行不行，行就加，不行就不加，另外一个判断两位
            final int case1 = Integer.valueOf(s.substring(i - 1, i));
            final int case2 = Integer.valueOf(s.substring(i - 2, i));

            if (case1 >= 1 && case1 <= 9) {
                dp[i] += dp[i - 1];
            }

            if (case2 >= 10 && case2 <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()];
    }
}
