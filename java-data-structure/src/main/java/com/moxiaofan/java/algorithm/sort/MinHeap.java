package com.moxiaofan.java.algorithm.sort;

/**
 * @author wangxy
 * @date 2019/6/26
 */

public class MinHeap {
    public static void main(String[] args) {

    }

    public void buildMap(int[] a, int i, int length){
        int l = left(i);
        int r = right(i);
        int min=0;
        if(l<length && a[l] < a[i]) {
            min = l;
        }

        if(r<length && a[r] > a[i]) {
            min = r;
        }

        if( min != i){
            swap(a, i, min);
            buildMap(a, min, length);
        }
    }

    public void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int left(int i){
        return i*2+1;
    }

    public int right(int i){
        return i*2+2;
    }

}
