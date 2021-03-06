package solution.leetcode.lc_572_subtree_of_another_tree;

/**
 * @author chenglong.yu
 * created on 2020/5/7
 */
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (null == s && null != t) {
            return false;
        }
        if (null != s && null == t) {
            return false;
        }

        if (isSameTree(s, t)) {
            return true;
        }

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (null == root1 && null == root2) {
            return true;
        }

        if (null == root1 && null != root2) {
            return false;
        }

        if (null != root1 && null == root2) {
            return false;
        }

        if (root1.val != root2.val) {
            return false;
        }

        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

