import java.util.LinkedList;
import java.util.Stack;

/**
 * AlgoCastsTitle: P4. 判断二叉树是否对称
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/Q2preGz9
 * LeetCodeTitle: 101. 对称二叉树
 * LeetCodeLink: https://leetcode.cn/problems/symmetric-tree/description/
 */
public class SymmetricTree {

    private boolean isSymmetric(TreeNode s, TreeNode t) {
        if (s != null && t != null)
            return s.val == t.val && isSymmetric(s.left, t.right) && isSymmetric(s.right, t.left);
        else return s == null && t == null;
    }

    // Time: O(n)  Space: O(n)
    public boolean isSymmetricTreeRecursive(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    // Time: O(n)  Space: O(n)
    public boolean isSymmetricTreeIterative(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode s = stack.pop(), t = stack.pop();
            if (s == null && t == null) continue;
            if (s == null || t == null) return false;
            if (s.val != t.val) return false;
            stack.push(s.left);
            stack.push(t.right);
            stack.push(s.right);
            stack.push(t.left);
        }
        return true;
    }
}
