package com.moxiaofan.java.leetcode;


/**
 * Created by wangxy on 2018/6/2.
 */

/**
 * 矩阵置零
 *
 * 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。
 */
public class MatrixSetZero {
    public static void main(String[] args) {

    }

    /**
     * 将为0的元素先替换为true
     * @param matrix
     */
    private static void setZeroes(int[][] matrix) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        boolean[] rows = new boolean[rowLength];
        boolean[] cols = new boolean[colLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if(rows[i] | cols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
