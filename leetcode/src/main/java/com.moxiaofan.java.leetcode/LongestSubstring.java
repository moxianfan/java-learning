package com.moxiaofan.java.leetcode;

/**
 * Created by wangxy on 2018/6/2.
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                if (unique(s, i, j, set)) {
                    max = Math.max(max, j - i);
                } else {
                    break;
                }
            }
        }
        return max;
    }

    private static boolean unique(String s, int start, int end, Set<Character> set) {
        for (int k = start; k < end; k++) {
            char ch = s.charAt(k);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        set.clear();
        return true;
    }
}