package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        int h = 0;
        while (h < 10) {
            int w = 0;
            while (w < 20) {
                if (h == 0 || h == 9) {
                    System.out.print("Б");
                } else if (w == 0 || w == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
            w++;
        }
            System.out.println();
            h++;
        }
    }
}