package com.moxiaofan.java.leetcode;

/**
 * Created by wangxy on 2018/6/1.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 */

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 3) {
            return res;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int k = 0; k < nums.length - 2; k++) {
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                if (nums[k] + nums[i] + nums[j] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    res.add(list);
                    //避免相同元素
                    while (j > i && nums[i + 1] == nums[i]) {
                        i++;
                    }
                    while (j > i && nums[j - 1] == nums[j]) {
                        j--;
                    }
                }
                if (nums[k] + nums[i] + nums[j] < 0) {
                    i++;
                } else {
                    j--;
                }
            }
            //避免相同元素
            while (k < nums.length - 2 && nums[k] == nums[k + 1]) {
                k++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }
}
