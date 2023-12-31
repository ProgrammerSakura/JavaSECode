package com.atguigu3.common_algorithm.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu3.common_algorithm.exer1
 * Description:
 *    案例：定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，
 *     并输出出来。
 * @Author Chia Wu
 * @Create 2023-08-21 21:26
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }

            if (arr[i] <= min) {
                min = arr[i];
            }
            sum += arr[i];
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("sum: " + sum);
        System.out.println("mean: " + sum / arr.length);
    }
}
