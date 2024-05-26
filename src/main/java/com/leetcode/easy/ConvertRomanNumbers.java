package com.leetcode.easy;

class ConvertRomanNumbers {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCM"));
    }
    public static int romanToInt(String s) {
        int sum = 0;
        int previousVal = 0;
        for (char ch : s.toCharArray()) {
            int currentVal = getValue(ch);
            if (previousVal < currentVal) {
                currentVal -= previousVal;
                if (sum > 0) {
                    sum -= previousVal;
                }
            }
            previousVal = currentVal;
            sum += currentVal;
        }
        return sum;
    }

    public static int getValue(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
