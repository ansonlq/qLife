package qLifeEvent.interview.solution;

/**
 * 
 * @author ql030422
 * 
 */
public class Solution_280 {
    public void wiggleSort(final int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                if (nums[i - 1] > nums[i]) {
                    swap(nums, i);
                }
            } else if (i != 0 && nums[i - 1] < nums[i]) {
                swap(nums, i);
            }
        }
    }

    public void swap(final int[] nums, final int i) {
        final int tmp = nums[i];
        nums[i] = nums[i - 1];
        nums[i - 1] = tmp;
    }
}
