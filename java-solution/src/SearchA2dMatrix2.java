/**
 * AlgoCastsTitle: P7. 行列递增的二维数组搜索
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/AEpoMmQ1
 * LeetCodeTitle: 240. 搜索二维矩阵 II
 * LeetCodeLink: https://leetcode.cn/problems/search-a-2d-matrix-ii/description/
 */
public class SearchA2dMatrix2 {
    // Time: O(m+n)  Space: O(1)
    public int[] searchIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (target < matrix[i][j]) --j;
            else if (target > matrix[i][j]) ++i;
            else return new int[]{i, j};
        }
        return new int[]{-1, -1};
    }
}
