package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(29_200_000);
        Antarctica antarctica = new Antarctica(13_957);
        Australia australia = new Australia(7_686_850);
        Eurasia eurasia = new Eurasia(53_600_000);
        NorthAmerica northAmerica = new NorthAmerica(20_000_000);
        SouthAmerica southAmerica = new SouthAmerica(17_840_000);
    }
}
