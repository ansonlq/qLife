package qLifeEvent.interview.solution;


/**
 * http://www.lintcode.com/en/problem/strstr/#
 * 
 * @author ql030422
 * 
 */
public class Jiuzhang_1_1 {
    public int strStr(final String source, final String target) {
        if (source == null || target == null || source.length() < target.length()) {
            return -1;
        }

        if (target.isEmpty()) {
            return 0;
        } else if (source.isEmpty()) {
            return -1;
        }

        final char[] sourceCharArray = source.toCharArray();
        final char[] targetCharArray = target.toCharArray();

        for (int sourceIndex = 0; sourceIndex < source.length(); sourceIndex++) {
            if (sourceCharArray[sourceIndex] == target.charAt(0)) {
                for (int targetIndex = 0; targetIndex < target.length(); targetIndex++) {
                    final int tempIndex = sourceIndex + targetIndex;
                    if (tempIndex < source.length() && sourceCharArray[tempIndex] == targetCharArray[targetIndex]) {
                        if (targetIndex == target.length() - 1) {
                            return sourceIndex;
                        }
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }

        return -1;
    }
}
