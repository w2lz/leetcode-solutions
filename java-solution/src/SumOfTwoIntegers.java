/**
 * AlgoCastsTitle: P5. 不用+/-求两数之和
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/XZWvBW7n
 * LeetCodeTitle: 371. 两整数之和
 * LeetCodeLink: https://leetcode.cn/problems/sum-of-two-integers/description/
 */
public class SumOfTwoIntegers {
    // Time: O(m)  Space: O(1)
    public int getSumRecursive(int a, int b) {
        return b == 0 ? a : getSumRecursive(a ^b, (a & b) << 1);
    }

    // Time: O(m)  Space: O(1)
    public int getSumIterative(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;
            int carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
}
