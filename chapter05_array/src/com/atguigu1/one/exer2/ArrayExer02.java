package com.atguigu1.one.exer2;
import java.util.Scanner;

public class ArrayExer02 {
	public static void main(String[] args) {
		String[] days = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

		Scanner input = new Scanner(System.in);
		int dayNum = input.nextInt();
		System.out.println(days[dayNum - 1]);

		input.close();
	}
}
