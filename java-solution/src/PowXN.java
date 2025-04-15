/**
 * AlgoCastsTitle: P10. 数值的 n 次方
 * AlgoCastsLink: https://algocasts.io/series/algo-problems-1-50/episodes/Z5mzJmdn
 * LeetCodeTitle: 50. Pow(x, n)
 * LeetCodeLink: https://leetcode.cn/problems/powx-n/description/
 */
public class PowXN {
    public double pow(double x, int n) {
        double result = 1;
        long N = Math.abs((long) n);
        for (int i = 0; i < N; ++i) {
            result *= x;
        }
        return n < 0 ? 1 / result : result;
    }

    public double fastPow(double x, int n) {
        double result = 1;
        long N = Math.abs((long) n);
        while (N != 0) {
            if ((N & 1) == 1) result *= x;
            x *= x;
            N >>= 1;
        }
        return n < 0 ? 1 / result : result;
    }
}
