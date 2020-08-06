package ru.sbrf.lesson_test;


public class Main {
    public static void main(String[] args) {

        byte theSum = add(1, 1);
        System.out.println(theSum);                             //задание 4

        int theMult = add2(13, 14253356);
        System.out.println(theMult);                            //задание 5

        int getMaxNumber = add3(170, 48);
        System.out.println(getMaxNumber);                       //задание 6


        boolean isCharA = add4('B');                    //задание 7
        System.out.println(isCharA);

        char isCharNumber = '5';               //задание 8
        System.out.println(Character.isDigit(isCharNumber));

        for (int bit = 0; bit < 30; bit++) {                //задание 9
            System.out.println(Integer.toBinaryString(bit));
        }

        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE + 1));      //задание 10

        char chr = 'a';                                //задание 11
        System.out.println(Integer.valueOf(chr));

        int num = 123;
        System.out.println(Integer.toString(num));     //задание 12

    }

    public static byte add(int a, int b) {
        return (byte) (a + b);
    }

    public static int add2(int c, long d) {
        return (int) (c * d);
    }

    public static int add3(int i, int j) {
        if (i < j) {
            return j;
        } else {
            return i;
        }
    }

    public static boolean add4(char z) {
        if (z == 'A') {
            return true;
        } else {
            return false;
        }
    }


}
