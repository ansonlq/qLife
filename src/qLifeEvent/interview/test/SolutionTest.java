package qLifeEvent.interview.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import qLifeEvent.interview.solution.Solution_1;

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
    public void testSolution_251() {

    }

    @Test
    public void testSolution_3() {

    }
}
