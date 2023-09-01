package com.atguigu2.two;

/**
 * 二维数组的基本使用（难点）
 *
 * @author 尚硅谷-宋红康
 * @create 13:08
 */
public class TwoArrayTest {
	public static void main(String[] args) {
		//1. 数组的声明与初始化
		int[][] a = new int[][]{{1, 2, 3}, {4, 5}, {6, 7}};
//		int[][] a = {{1, 2, 3}, {4, 5}, {6, 7}};
		// 错误的定义
		// int[][] a = new int[][]{1, 2, 3, 4, 5, 6, 7};
		// int[][] a = {1, 2, 3, 4, 5, 6, 7};

		int[][] b = new int[3][4];
		int[][] c = new int[3][];

		//2. 数组元素的调用
		System.out.println(a[0]);
		System.out.println(a[0][1]);

		System.out.println(b[0]);
		System.out.println(b[0][1]);

		//3. 数组的长度
		System.out.println(a.length);  // 3
		System.out.println(a[0].length);  // 3
		System.out.println(a[1].length);  // 2

		System.out.println(c);  // [[I@3b07d329
		System.out.println(c[0]);   // 没有为第二维开辟空间故为null
		System.out.println(c[0][0]);   // 报错Cannot load from int array because "c[0]" is null

		//4. 如何遍历数组
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}


	}
}
