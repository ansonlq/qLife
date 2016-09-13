package qLifeEvent.interview.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import qLifeEvent.interview.solution.Jiuzhang_1_1;
import qLifeEvent.interview.solution.Solution_1;
import qLifeEvent.interview.solution.Solution_118;
import qLifeEvent.interview.solution.Solution_15;
import qLifeEvent.interview.solution.Solution_151;
import qLifeEvent.interview.solution.Solution_18;
import qLifeEvent.interview.solution.Solution_205;
import qLifeEvent.interview.solution.Solution_220;
import qLifeEvent.interview.solution.Solution_243;
import qLifeEvent.interview.solution.Solution_259;
import qLifeEvent.interview.solution.Solution_336;
import qLifeEvent.interview.solution.Solution_42;
import qLifeEvent.interview.solution.Solution_66;
import qLifeEvent.interview.solution.Solution_78;
import qLifeEvent.interview.solution.Solution_79;

/**
 * test for Interview Solution
 * 
 * @author ql030422
 * 
 */
@RunWith(JUnit4.class)
public class SolutionTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testSolution_1() {
        final Solution_1 solution = new Solution_1();
        final int[] input = { 2, 3, 4, 5, 6, 7 };
        System.out.println("result: " + solution.twoSum(input, 8)[1]);
    }

    @Test
    public void testSolution_15() {
        final Solution_15 solution = new Solution_15();
        final int[] words = { -1, 0, 1, 2, -1, -4 };

        System.out.println(solution.threeSumMyWay(words));
    }

    @Test
    public void testSolution_18() {
        final Solution_18 solution = new Solution_18();
        // final int[] words = { -1, 0, 1, 2, -1, -4 };
        final int[] words = { 1, 0, -1, 0, -2, 2 };

        System.out.println(solution.fourSum(words, 0));
    }

    @Test
    public void testSolution_336() {
        final Solution_336 solution = new Solution_336();
        final String[] words = { "abcd", "dcba", "lls", "s", "sssll" };

        System.out.println(-3 / 4);
        // System.out.println("Result: " + solution.isPalindromic("bat", "tab"));

        // System.out.println(solution.palindromePairs2(words));

    }

    @Test
    public void testSolution_220() {
        final Solution_220 solution = new Solution_220();
        final int nums[] = { -1, 2147483647 };

        System.out.println("Result: " + solution.containsNearbyAlmostDuplicate(nums, 1, 2147483647));

    }

    @Test
    public void testSolution_66() {
        final Solution_66 solution = new Solution_66();

        final int nums[] = { 9, 9, 9, 9, 9 };
        final int result[] = solution.plusOne(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    @Test
    public void testSolution_243() {
        final Solution_243 solution = new Solution_243();

        final String nums[] = { "a", "b" };
        final int result = solution.shortestDistance(nums, "a", "b");
        System.out.println("Result: " + result);
    }

    @Test
    public void testSolution_118() {
        final Solution_118 solution = new Solution_118();
        final List<List<Integer>> result = solution.generate(6);

        // System.out.println(result.get(3));

        int res = 5;

        res ^= 2;
        System.out.println(res);
        res ^= 3;
        System.out.println(res);

        // for (final List<Integer> list : result) {
        // System.out.println(list);
        // }
    }

    @Test
    public void testSolution_78() {
        final Solution_78 solution = new Solution_78();
        final int nums[] = { 1, 2, 2 };
        final List<List<Integer>> result = solution.subsets(nums);
        for (final List<Integer> list : result) {
            System.out.println(list);
        }
    }

    @Test
    public void testSolution_79() {
        final Solution_79 solution = new Solution_79();
        // final char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
        final char[][] board = { { 'A', 'B' }, { 'C', 'D' } };
        final boolean result = solution.exist(board, "DBAC");

        System.out.println("Result: " + result);
    }

    @Test
    public void testSolution_151() {
        final Solution_151 solution = new Solution_151();
        final String input = "2    1";
        final String output = solution.reverseWords(input);

        final int a = 4;
        final int b = 1;
        final int c = 2;

        final int result = (~a & b & c) | (a & ~b & ~c);
        System.out.println("result: " + result);
        System.out.println("~a: " + ~a);
    }

    @Test
    public void testSolution_259() {
        final Solution_259 solution = new Solution_259();
        final int nums[] = { -2, 0, 1, 3 };
        final int result = solution.threeSumSmaller(nums, 2);
        System.out.println(result);
    }

    @Test
    public void testSolution_42() {
        final Solution_42 solution = new Solution_42();
        final int heights[] = { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2 };
        final int result = solution.waterAmount(heights, 6, 9);

        final String test = "";
        System.out.println(test + 1);
    }

    @Test
    public void testSolution_205() {
        final Solution_205 solution = new Solution_205();

        final Jiuzhang_1_1 test = new Jiuzhang_1_1();

        System.out.println(test.strStr("abcd", "bcd"));

    }
}
