package Task3;

import java.util.Arrays;
import java.util.List;

public class Number5 {
    // Создайте функцию, которая определяет, является ли строка допустимым шестнадцатеричным кодом
    public static void main(String[] args){
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#EAECEE"));
        System.out.println(isValidHexCode("#eaecee"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("#CD5C5Z"));
        System.out.println(isValidHexCode("#CD5C&C"));
        System.out.println(isValidHexCode("#CD5C5C"));
    }

    public static boolean isValidHexCode(String s) {
        return s.matches("#[a-fA-F0-9]{6}");
    }
    //Метод matches() — в Java сообщает, соответствует ли или нет данная строка заданному регулярному выражению.
    //содержит ли строка шестнадцатеричные цифры (от 0 до 9 и от A до F)
}
