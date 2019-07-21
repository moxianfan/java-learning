package com.moxiaofan.java.leetcode;

/**
 * @author wangxy
 * @date 2019/4/22
 */

import java.util.Arrays;

/**
 * 给定一个整数数组 A，对于每个整数 A[i]，我们可以选择 x = -K 或是 x = K，并将 x 加到 A[i] 中。
 * <p>
 * 在此过程之后，我们得到一些数组 B。
 * <p>
 * 返回 B 的最大值和 B 的最小值之间可能存在的最小差值。
 * 输入：A = [1,3,6], K = 3
 * 输出：3
 * 解释：B = [4,6,3]
 * <p>
 * 提示：
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * 0 <= K <= 10000
 */
public class SmallestRange {
    public int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int length = A.length;
        int res = A[length - 1] - A[0];
        for (int i = 1; i < length; i++) {
            int min = Math.min(A[0] + K, A[i] - K);
            int max = Math.max(A[length - 1] - K, A[i - 1] + K);
            res = Math.min(max - min, res);
        }
        return res;
    }
}
