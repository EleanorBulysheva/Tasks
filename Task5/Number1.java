package Task5;

import java.util.Arrays;

public class Number1 {
        /* 1. Пришло время отправлять и получать секретные сообщения.
    Создайте две функции, которые принимают строку и массив и возвращают
    закодированное или декодированное сообщение.
    Первая буква строки или первый элемент массива представляет собой символьный код
    этой буквы. Следующие элементы-это различия между символами: например, A +3 --> C
    или z -1 --> y.*/
        public static void main(String[] args) {
            System.out.println(Arrays.toString(encrypt("Hello")));
            int[] mas = {72, 33, -73, 84, -12, -3, 13, -13, -68};
            System.out.println(decrypt(mas));
        }

    private static int[] encrypt(String str) {
        //Первая буква строки или первый элемент
        // массива представляет собой символьный код
        //этой буквы
        int[] array = new int[str.length()];
        array[0] = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            array[i] = (str.charAt(i) - str.charAt(i - 1));
        }
        return array;
    }
    //различия между символами
    private static String decrypt(int[] array) {
        String str = "";
        str += (char) array[0];
        for (int i = 1; i < array.length; i++) {
            int a = str.charAt(i - 1);
            str += (char) (a + array[i]);
        }
        return str;
    }
}
