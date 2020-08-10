package ru.sbrf.lesson_test;


public class Main {
    public static void main(String[] args) {

        byte a = 1;
        short b = 1;
        int c = 13;
        long d = 14253356;
        int g = 548;
        char f = '6';

        System.out.println(theSum(a, b));                //задание 4
        System.out.println(theMult(c, d));               //задание 5
        System.out.println(getMaxNumber(c, g));         //задание 6
        System.out.println(isCharA(f));                 //задание 7
        System.out.println(isCharNumber(f));            //задание 8
        toBinary();                                     //задание 9
        mVal();                                         //задание 10
        System.out.println(charToInt(f));               //задание 11
        System.out.println(intToChar(g));               //задание 12
    }

    public static byte theSum(byte a, short b) {
        return (byte) (a + b);
    }

    public static int theMult(int c, long d) {
        return (int) (c * d);
    }

    public static int getMaxNumber(int c, int g) {
        return c > g ? c : g;
    }

    public static boolean isCharA(char f) {
        return f == 'A' ? true : false;
    }

    public static boolean isCharNumber(char f) {
        return Character.isDigit(f) ? true : false;

    }

    public static void toBinary() {
        for (int bit = 0; bit < 30; bit++) {
            System.out.println(Integer.toBinaryString(bit));
        }
    }

    public static void mVal() {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));
    }

    public static int charToInt(char k) {
        return k;
    }

    public static char intToChar(int h)  {
        return (char) h;
    }
}