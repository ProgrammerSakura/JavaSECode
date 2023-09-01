package com.atguigu1.one.exer3;

import java.util.Scanner;

public class ArrayExer03 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数: ");
        int num = scan.nextInt();

        double[] scores = new double[num];
        char[] rank = new char[num];
        double maxScore = 0;

        System.out.println("请输入每个学生的成绩: ");
        for (int i = 0; i < num; i++) {
            scores[i] = scan.nextDouble();
            if (scores[i] >= maxScore) {
                maxScore = scores[i];
            }

        }

        // 确定每个学生的成绩等级
        for (int i = 0; i < num; i++) {
            if (scores[i] >= maxScore - 10) {
                rank[i] = 'A';
            } else if (scores[i] >= maxScore - 20) {
                rank[i] = 'B';
            } else if (scores[i] >= maxScore - 30) {
                rank[i] = 'C';
            } else {
                rank[i] = 'D';
            }
        }

        //输出结果
        System.out.println("最高分是: " + maxScore);

        for (int i = 0; i < num; i++) {
            System.out.println("student " + i + " score is " + scores[i] + " grade is " + rank[i]);
        }


    }
}
