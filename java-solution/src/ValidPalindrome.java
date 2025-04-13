/**
 * AlgoCastsTitle: P1. 回文字符串判断
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/4rpaqpZb
 * LeetCodeTitle: 125. 验证回文串
 * LeetCodeLink: https://leetcode.cn/problems/valid-palindrome/description/
 */
public class ValidPalindrome {
    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    private boolean isEqualIgnoreCase(char a, char b) {
        if (a >= 'A' && a <= 'Z') a += 32;
        if (b >= 'A' && b <= 'Z') b += 32;
        return a == b;
    }

    // Time: O(n)  Space: O(1)
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return true;
        int i = 0, j = s.length() - 1;
        for (; i < j; ++i, --j) {
            while (i < j && !isAlphanumeric(s.charAt(i))) ++i;
            while (i < j && !isAlphanumeric(s.charAt(j))) --j;
            if (i < j && !isEqualIgnoreCase(s.charAt(i), s.charAt(j))) return false;
        }
        return true;
    }
}
