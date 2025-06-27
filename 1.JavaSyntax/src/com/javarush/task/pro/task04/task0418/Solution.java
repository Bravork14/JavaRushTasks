package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean isOptimist = console.nextBoolean();
        double glass = 0.5;
        if (isOptimist) {
            System.out.println((int)Math.ceil(glass));
        } else {
            System.out.println((int)Math.floor(glass));
        }
    }
}