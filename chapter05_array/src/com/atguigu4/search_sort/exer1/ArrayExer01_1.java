package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01_1
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *
 * @Author Chia Wu
 * @Create 2023-09-01 20:14
 * @Version 1.0
 */
public class ArrayExer01_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        // 扩容1倍容量
        int[] new_arr = new int[arr.length << 1];

        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }

        new_arr[arr.length] = 1;
        new_arr[arr.length + 1] = 1;
        new_arr[arr.length] = 1;

    }
}
