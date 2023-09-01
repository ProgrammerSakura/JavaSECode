package com.atguigu2.two.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu2.two.exer1
 * Description:
 *
 * @Author Chia Wu
 * @Create 2023-08-12 21:26
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("总和为：" + sum);
    }
}
