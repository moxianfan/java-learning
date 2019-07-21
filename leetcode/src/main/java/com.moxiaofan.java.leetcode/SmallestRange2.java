package com.moxiaofan.java.leetcode;

/**
 * @author wangxy
 * @date 2019/4/22
 */


/**
 * 一组数，分为两组，使得其和的差值最小
 *
 * 【思路】动态规划的解法。求得array的和sum，问题转化为：在array中选取若干个元素，使得这些元素的和<=sum/2，且是最接近sum/2的元素集合。

 开一个数组：int[][]f=new int[length+1][sum/2+1]

 状态方程：f[i][j]=Max(f[i-1][j-array[i]]+array[i],f[i-1][j])

 解释：f[i][j]表示array中i个元素的和<=j，且是最接近j的元素集合。f[i-1][j-array[i]]表示array中i-1个元素的和最接近j-array[i]，所以f[i][j]应该是[i-1][j-array[i]]+array[i]和f[i-1][j]中最大的那个。有点像0-1背包问题。

 */
public class SmallestRange2 {
    public static int smallestRange(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        int[][] dp = new int[len + 1][sum / 2 + 1];
        for (int i = 0; i < len; i++) {
            for (int j = 1; j <= sum / 2; j++) {
                dp[i + 1][j] = dp[i][j];
                if (arr[i] <= j && dp[i][j - arr[i]] + arr[i] > dp[i][j]) {
                    dp[i + 1][j] = dp[i][j - arr[i]] + arr[i];
                }
            }
        }

        System.out.println(dp[len][sum / 2]);
        return sum - dp[len][sum / 2] * 2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
        System.out.println("result=" + smallestRange(arr));
    }
}
