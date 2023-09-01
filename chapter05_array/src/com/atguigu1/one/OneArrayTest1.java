package com.atguigu1.one;

import com.sun.source.tree.ForLoopTree;

/**
 * 一维数组的基本使用(承接OneArrayTest.java)
 *
 * @author 尚硅谷-宋红康
 * @create 12:18
 */
public class OneArrayTest1 {

    public static void main(String[] args) {
        //5. 数组元素的默认初始化值
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);

        double[] arr2 = new double[3];
        System.out.println(arr2[0]);

        char[] arr3 = new char[3];
        System.out.println(arr3[0]);

        if(arr3[0] == 0){
            System.out.println("1111");
        }

        if(arr3[0] == '0'){
            System.out.println("2222");
        }

        if(arr3[0] == '\u0000'){
            System.out.println("3333");
        }

        String[] arr4 = new String[3];
        System.out.println(arr4[0]);  // null
        for (String s : arr4) {
            System.out.print(s + ' ');
        }
        System.out.println();

        boolean[] arr5 = new boolean[3];
        System.out.println(arr5[0]);   // false

        //6. 数组的内存解析
        int[] a1 = new int[]{1, 2, 3};
        System.out.println(a1[0]);  // 1
        int[] a2 = a1;
        a2[0] = 5;
        System.out.println(a1[0]);  // 5
        System.out.println(a2[0]);  // 5
        System.out.println(a1);  // [I@41629346
        System.out.println(a1);  // [I@41629346

        int a = 0;
        int b = a;
        b = 10;
        System.out.println(a);  // 0
        System.out.println(b);  // 10
    }
}
