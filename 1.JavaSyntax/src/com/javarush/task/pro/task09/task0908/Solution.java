package com.javarush.task.pro.task09.task0908;

import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null) {
            return hexNumber;
        }
        if (binaryNumber.length() % 4 == 0){

        }
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String oneHex = binaryNumber.substring(i, i + 4);
            String fourBit = "";
            if (oneHex.equals("0000")) {
                fourBit = "0";
            } else if (oneHex.equals("0001")) {
                fourBit = "1";
            } else if (oneHex.equals("0010")) {
                fourBit = "2";
            } else if (oneHex.equals("0011")) {
                fourBit = "3";
            } else if (oneHex.equals("0100")) {
                fourBit = "4";
            } else if (oneHex.equals("0101")) {
                fourBit = "5";
            } else if (oneHex.equals("0110")) {
                fourBit = "6";
            } else if (oneHex.equals("0111")) {
                fourBit = "7";
            } else if (oneHex.equals("1000")) {
                fourBit = "8";
            } else if (oneHex.equals("1001")) {
                fourBit = "9";
            } else if (oneHex.equals("1010")) {
                fourBit = "a";
            } else if (oneHex.equals("1011")) {
                fourBit = "b";
            } else if (oneHex.equals("1100")) {
                fourBit = "c";
            } else if (oneHex.equals("1101")) {
                fourBit = "d";
            } else if (oneHex.equals("1110")) {
                fourBit = "e";
            } else if (oneHex.equals("1111")) {
                fourBit = "f";
            }
            hexNumber = hexNumber + fourBit;
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber.isEmpty() || hexNumber == null) {
            return "";
        }
        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            String oneHex = String.valueOf(hexNumber.charAt(i));
            String fourBit = "";
            if (oneHex.equals("0")) {
                fourBit = "0000";
            } else if (oneHex.equals("1")) {
                fourBit = "0001";
            } else if (oneHex.equals("2")) {
                fourBit = "0010";
            } else if (oneHex.equals("3")) {
                fourBit = "0011";
            } else if (oneHex.equals("4")) {
                fourBit = "0100";
            } else if (oneHex.equals("5")) {
                fourBit = "0101";
            } else if (oneHex.equals("6")) {
                fourBit = "0110";
            } else if (oneHex.equals("7")) {
                fourBit = "0111";
            } else if (oneHex.equals("8")) {
                fourBit = "1000";
            } else if (oneHex.equals("9")) {
                fourBit = "1001";
            } else if (oneHex.equals("a")) {
                fourBit = "1010";
            } else if (oneHex.equals("b")) {
                fourBit = "1011";
            } else if (oneHex.equals("c")) {
                fourBit = "1100";
            } else if (oneHex.equals("d")) {
                fourBit = "1101";
            } else if (oneHex.equals("e")) {
                fourBit = "1110";
            } else if (oneHex.equals("f")) {
                fourBit = "1111";
            }
            binaryNumber = binaryNumber + fourBit;
        }
        return binaryNumber;
    }
}
