package com.moxiaofan.java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by wangxy on 2018/8/9.
 */


public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 9, 1, 2, 4, 5, 7, 10};
        _quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    private static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int index = arr[low];

        while (i < j) {
            while (i < j && arr[j] > index) {
                j--;
            }

            while (i < j && arr[i] < index) {
                i++;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        arr[low] = arr[i];
        arr[i] = index;

        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void _quickSort(int[] list, int low, int high) {
        new ConcurrentHashMap<>();
        if (low < high) {
            int middle = getMiddle(list, low, high);
            for(int l : list){
                System.out.println( l);
            }
            System.out.println("111111111");
            _quickSort(list, low, middle - 1);
            _quickSort(list, middle + 1, high);
        }
    }

    public static int getMiddle(int[] list, int low, int high) {
        int tmp = list[low];
        while (low < high) {
            while (low < high && list[high] > tmp) {
                high--;
            }
            list[low] = list[high];
            while (low < high && list[low] < tmp) {
                low++;
            }
            list[high] = list[low];
        }
        list[low] = tmp;
        return low;
    }

}
