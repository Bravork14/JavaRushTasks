package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String string = scan.nextLine();
       int number = scan.nextInt();
       if (number <= 0 || number >= 5) {
           System.out.println(string);
       } else {
           int i = 0;
       do {
           System.out.println(string);
           i++;
       }
       while (i < number);
       }
    }
}