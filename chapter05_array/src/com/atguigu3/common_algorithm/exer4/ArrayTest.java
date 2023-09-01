package com.atguigu3.common_algorithm.exer4;

/**
 * ClassName: ArrayTest
 * Package: com.atguigu3.common_algorithm.exer4
 * Description:
 *
 * @Author Chia Wu
 * @Create 2023-08-28 10:26
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        array2 = array1;
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }

        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

    }
}
