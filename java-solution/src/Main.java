import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // P1
        String s = " race a E-car ";
        System.out.println(new ValidPalindrome().isPalindrome(s));

        // P2
        int[] nums = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(new TwoSum().getTwoNumToGivenValueBruteForce(nums, 9)));
        System.out.println(Arrays.toString(new TwoSum().getTwoNumToGivenValueHasMap(nums, 9)));

        // P3
        int[] nums2 = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(new TwoSum2().getTwoNumSumToGivenValue(nums2, 9)));

        // P5
        System.out.println(new SumOfTwoIntegers().getSumRecursive(9, 11));
        System.out.println(new SumOfTwoIntegers().getSumIterative(9, 11));

        // P6
        int[] nums3 = new int[]{1,2,3,3,2};
        System.out.println(new SingleNumber().singleNumberWithSet(nums3));
        System.out.println(new SingleNumber().singleNumberWithXOR(nums3));

        // P7
        int[][] nums4 = new int[][]{{1,3,5}, {2,4,6}};
        System.out.println(Arrays.toString(new SearchA2dMatrix2().searchIn2DArray(nums4, 4)));

        // P10
        System.out.println(new PowXN().pow(2, 11));
        System.out.println(new PowXN().fastPow(2, 11));
    }
}