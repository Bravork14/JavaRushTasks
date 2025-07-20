package com.javarush.task.pro.task05.task0512;

/* 
Создаем мультимассив
*/

import java.util.Arrays;

public class Solution {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(Arrays.toString(multiArray[i][j]) + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(multiArray));
    }
}
