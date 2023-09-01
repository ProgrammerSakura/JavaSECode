package com.atguigu3.common_algorithm.exer2;

/**
 * ClassName: ArrayExer02
 * Package: com.atguigu3.common_algorithm.exer2
 * Description:
 *      （1）在编程竞赛中，有10位评委为参赛的选手打分，分数分别为：5,4,6,8,9,0,1,2,7,3
 *      （2）求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）
 * @Author Chia Wu
 * @Create 2023-08-21 21:39
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args) {
        int[] scores = new int[]{5,4,6,8,9,0,1,2,7,3};
        int sum_score = 0, min_score = scores[0], max_score = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max_score) {
                max_score = scores[i];
            }
            if (scores[i] < min_score) {
                min_score = scores[i];
            }

            sum_score += scores[i];
        }


//        for (int i = 0; i < scores.length; i++) {
//            if (scores[i] != max_score && scores[i] != min_score) {
//                sum_score += scores[i];
//            }
//        }

        System.out.println("最后得分为：" + (sum_score - max_score - min_score) / (scores.length - 2));
    }
}
