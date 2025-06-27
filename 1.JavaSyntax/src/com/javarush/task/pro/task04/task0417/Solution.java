package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int origSpeedWind = console.nextInt();
        int speedWind = (int) Math.round(origSpeedWind * 3.6);
        System.out.println(speedWind);

    }
}