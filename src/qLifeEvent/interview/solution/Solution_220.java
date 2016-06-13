package qLifeEvent.interview.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate-iii/
 * 
 * @author ql030422
 * 
 */
public class Solution_220 {
    // O(N^2)
    // ********************************************
    public boolean containsNearbyAlmostDuplicateNavie(final int[] nums, final int k, final int t) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < min(i + k, nums.length); j++) {
                final boolean isValueDistance = isDistance(nums[i], nums[j], t);
                final boolean isPositionDistance = isDistance(i, j, k);
                if (isValueDistance && isPositionDistance) {
                    return true;
                }
            }
        }
        return false;
    }

    public int min(final int a, final int b) {
        if (a >= b) {
            return b;
        } else {
            return a;
        }
    }

    public boolean isDistance(final int first, final int second, final int distance) {
        if (first > second) {
            return (first - second) < distance;
        } else {
            return (second - first) < distance;
        }
    }

    // ********************************************

    public boolean containsNearbyAlmostDuplicate(final int[] nums, final int k, final int t) {
        if (k <= 0 || t < 0) {
            return false;
        }

        if (nums.length <= 1) {
            return false;
        }

        final Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            final int index1 = getBucketId(nums[i], t);
            if (indexMap.containsKey(index1) && Math.abs(indexMap.get(index1) - nums[i]) <= t) {
                return true;
            }

            final int index2 = getBucketId(nums[i], t) + 1;
            if (indexMap.containsKey(index2) && Math.abs(indexMap.get(index2) - nums[i]) <= t) {
                return true;
            }

            final int index3 = getBucketId(nums[i], t) - 1;
            if (indexMap.containsKey(index3) && Math.abs(indexMap.get(index3) - nums[i]) <= t) {
                return true;
            }

            indexMap.put(getBucketId(nums[i], t), nums[i]);

            if (i >= k) {
                indexMap.remove(getBucketId(nums[i - k], t));
            }
        }
        return false;
    }

    public int getBucketId(final int i, int width) {
        if (width == 0) {
            width = 1;
        }

        final int num = i / width;
        return num;
    }
}
