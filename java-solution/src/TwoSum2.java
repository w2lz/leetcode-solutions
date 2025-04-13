/**
 * AlgoCastsTitle: P3. 有序数组中求和为给定值的两个数
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/6emEjGVr
 * LeetCodeTitle: 167. 两数之和 II - 输入有序数组
 * LeetCodeLink: https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/description/
 */
public class TwoSum2 {
    public int[] getTwoNumSumToGivenValue(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] > target) -- j;
            else if (nums[i] + nums[j] < target) ++i;
            else return new int[]{i+1, j+1};
        }
        return new int[]{-1, -1};
    }
}
