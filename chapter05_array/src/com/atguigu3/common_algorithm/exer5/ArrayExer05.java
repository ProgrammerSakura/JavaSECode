package com.atguigu3.common_algorithm.exer5;

/**
 * ClassName: ArrayExer05
 * Package: com.atguigu3.common_algorithm.exer5
 * Description:
 *
 * @Author Chia Wu
 * @Create 2023-08-29 10:13
 * @Version 1.0
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};

        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
