package com.moxiaofan.java.leetcode;

/**
 * Created by wangxy on 2018/6/2.
 */

import java.util.*;

/**
 * 字谜分组
 *
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 */
public class GroupAnagrams {

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(strs.length);
        String key;
        char[] chars;
        for(String str : strs){
            chars= str.toCharArray();
            Arrays.sort(chars);
            key = String.valueOf(chars);
            //相对更省时
            /*if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }*/

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
