package qLifeEvent.interview.solution;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/jump-game/
 * 
 * @author ql030422
 * 
 */
public class Solution_55 {
    public boolean canJump(final int[] nums) {
        int biggestNumber = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i > biggestNumber) {
                return false;
            }
            biggestNumber = Math.max(biggestNumber, i + nums[i]);
        }
        return true;

    }

    // DP solution Backward thinking can't passed the checking but it works.
    public boolean canJumpDP(final int[] nums) {
        final Set<Integer> checkedNode = new HashSet<Integer>();
        final int indexInput = nums.length - 1;
        final boolean result = checkJump(nums, checkedNode, indexInput, indexInput);
        return result;
    }

    boolean checkJump(final int[] nums, final Set<Integer> checkedNode, final int curIndex, final int targetIndex) {
        final int curStep = nums[curIndex];
        if (curIndex == 0) {
            return (curIndex + curStep) >= targetIndex;
        }

        if (curIndex < 0) {
            return false;
        }

        if (checkedNode.contains(curIndex)) {
            return false;
        }

        boolean result = false;
        if ((curIndex + curStep) >= targetIndex) {
            checkedNode.add(curIndex);
            for (int i = curIndex - 1; i >= 0; i--) {
                result = result || checkJump(nums, checkedNode, i, curIndex);
            }
        } else {
            checkedNode.add(curIndex);
        }
        return result;
    }
}
