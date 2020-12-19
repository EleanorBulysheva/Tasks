package Task3;

import java.util.Arrays;

public class Number8 {
    // Напишите функцию, которая возвращает самую длинную последовательность
    // последовательных нулей в двоичной строке.
    public static void main(String[] args) {
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));
    }
    public static String longestZero(String n) {
        String sum = "";
        String otvet = "";
        for (int i = 0; i < n.length() - 1; i++) {
            if (n.charAt(i) == '0'){//если 0, сохраняем 0
                sum += "0";
            }
            else {
                if (otvet.length() < sum.length())//если длина ответа меньше длины след последовательности
                    otvet = sum;
                sum = "";
            }
        }
        if (otvet.length() < sum.length()) otvet = sum;
        return otvet;
    }
}
