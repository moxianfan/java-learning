package com.moxiaofan.java.algorithm.sort;

/**
 * @author wangxy
 * @date 2018/9/6
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{8, 9, 1, 2, 4, 5, 7, 10};
        _quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void _quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            for (int l : list) {
                System.out.println(l);
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

    private static void quickSort(int[] list, int low, int high) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int key = list[low];
        while (i < j) {
            if (i < j && list[j] > key) {
                j--;
            }
            if (i < j && list[i] < key) {
                i++;
            }
            int tmp = list[i];
            list[i] = list[j];
            list[j] = tmp;
        }
        list[low] = list[i];
        list[i] = key;
        quickSort(list, low, i - 1);
        quickSort(list, i + 1, high);
    }

}
