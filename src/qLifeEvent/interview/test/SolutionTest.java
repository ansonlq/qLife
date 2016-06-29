package qLifeEvent.interview.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import qLifeEvent.interview.solution.Solution_1;
import qLifeEvent.interview.solution.Solution_15;
import qLifeEvent.interview.solution.Solution_18;
import qLifeEvent.interview.solution.Solution_220;
import qLifeEvent.interview.solution.Solution_243;
import qLifeEvent.interview.solution.Solution_336;
import qLifeEvent.interview.solution.Solution_66;

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
}
