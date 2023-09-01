package com.atguigu1.one;

/**
 * 一维数组的基本使用
 *
 * @author 尚硅谷-宋红康
 * @create 12:08
 */
public class OneArrayTest {
	
	public static void main(String args[]) {
		//1. 数组的声明与初始化
		double[] prices;
		prices = new double[]{20.1, 30.2};  // 静态初始化

		String[] food = new String[4]; // 动态初始化

		int[] arr = {1, 2, 3};

		//2. 数组元素的调用
		System.out.println(arr[0]);

		// 赋值
		food[0] = "茄子";

		//3. 数组的长度
		System.out.println(food.length);
		System.out.println(prices.length);

		//4. 如何遍历数组
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

	}

}
