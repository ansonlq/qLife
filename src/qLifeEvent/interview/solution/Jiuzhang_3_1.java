package qLifeEvent.interview.solution;

import javax.swing.tree.TreeNode;

/**
 * 
 * @author ql030422
 * 
 */
public class Jiuzhang_3_1 {
    public int maxDepth(final TreeNode root) {
        if (root == null) {
            return 0;
        }

        final int left = maxDepth(root.left) + 1;
        final int right = maxDepth(root.right) + 1;

        return Math.max(right, left);
    }
}
