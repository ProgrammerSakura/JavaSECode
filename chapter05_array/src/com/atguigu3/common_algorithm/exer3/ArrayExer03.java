package com.atguigu3.common_algorithm.exer3;

/**
 * ClassName: ArrayExer03
 * Package: com.atguigu3.common_algorithm.exer3
 * Description:
 *
 * @Author Chia Wu
 * @Create 2023-08-28 10:11
 * @Version 1.0
 */
public class ArrayExer03 {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];

        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            yanghui[i][0] = yanghui[i][i] = 1;

            for (int j = 1; j < yanghui[i].length - 1; j++) {
                yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
            }
        }

        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
