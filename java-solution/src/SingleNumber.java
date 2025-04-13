import java.util.HashSet;
import java.util.Set;

/**
 * AlgoCastsTitle: P6. 单身数字
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/nwp8Dp7j
 * LeetCodeTitle: 136. 只出现一次的数字
 * LeetCodeLink: https://leetcode.cn/problems/single-number/description/
 */
public class SingleNumber {
    // Time: O(n)  Space: O(n)
    public int singleNumberWithSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0, uniqueSum = 0;
        for (int num : nums) {
            if (!set.contains(num)) {
                uniqueSum += num;
                set.add(num);
            }
            sum += num;
        }
        return 2 * uniqueSum - sum;
    }

    // Time: O(n)  Space: O(1)
    public int singleNumberWithXOR(int[] nums) {
        int result = 0;
        for (int num : nums)  result ^= num;
        return result;
    }
}
