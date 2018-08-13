package com.moxiaofan.java.leetcode;

/**
 * Created by wangxy on 2018/6/4.
 */

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 */
public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int maxLength = 0;
        int maxStart = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (isPalindrome(s, i, j) && (i + 1) > maxLength) {
                    maxLength = i + 1;
                    maxStart = j;
                }
            }
        }
        return s.substring(maxStart, maxStart + maxLength);
    }

    private static boolean isPalindrome(String s, int i, int j) {
        int left = j;
        int right = j + i;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aa";
        System.out.println(O2(str));
    }

    private static String O2(String s) {
        int maxLength = 0;
        int maxStart = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int k = len % 2 == 0 ? i : i - 1;
            int j = i + 1;
            while (k >= 0 && j < len && s.charAt(k) == s.charAt(j)) {
                if (j - k + 1 > maxLength) {
                    maxLength = j - k + 1;
                    maxStart = j;
                }
                j++;
                k--;
            }
        }
        return s.substring(maxStart, maxStart + maxLength);
    }


    private static String test(String s) {
        int maxLength = 0;
        int maxStart = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (isPre(s, i, j) && j - i + 1 > maxLength) {
                    maxLength = j - i + 1;
                    maxStart = i;
                }
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    private static boolean isPre(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
