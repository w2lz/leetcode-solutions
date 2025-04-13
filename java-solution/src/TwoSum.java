import java.util.HashMap;
import java.util.Map;

/**
 * AlgoCastsTitle: P2. 求和为给定值的两个数
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/RVmVkGQd
 * LeetCodeTitle: 1. 两数之和
 * LeetCodeLink: https://leetcode.cn/problems/two-sum/description/
 */
public class TwoSum {
    // Time: O(n^2)  Space: O(n^2)
    public int[] getTwoNumToGivenValueBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // Time: O(n^2)  Space: O(n^2)
    public int[] getTwoNumToGivenValueHasMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int numNeeded = target - nums[i];
            if (map.containsKey(numNeeded)) {
                return new int[]{map.get(numNeeded), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
