import java.util.Stack;

/**
 * AlgoCastsTitle: P8. 判断二叉树是否相同
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/eAGQlm4D
 * LeetCodeTitle: 100. 相同的树
 * LeetCodeLink: https://leetcode.cn/problems/same-tree/description/
 */
public class SameTree {
    // Time: O(n)  Space: O(n)
    public boolean isSameTreeRecursive(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTreeRecursive(p.left, q.left) && isSameTreeRecursive(p.right, q.right);
    }
    // Time: O(n)  Space: O(n)
    public boolean isSameTreeIterative(TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(p);
        stack.push(q);

        while (!stack.isEmpty()) {
            TreeNode s = stack.pop(), t = stack.pop();
            if (s == null && t == null) continue;
            if (s == null || t == null) return false;
            if (s.val != t.val) return false;
            stack.push(s.left);
            stack.push(t.left);
            stack.push(s.right);
            stack.push(t.right);
        }
        return true;
    }
}
