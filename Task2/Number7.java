package Task2;

public class Number7 {
    //Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
    //напишите функцию, чтобы определить, является ли вход действительным
    //почтовым индексом. Действительный почтовый индекс выглядит следующим
    //образом:
    //– Должно содержать только цифры (не допускается использование нецифровых цифр).
    //– Не должно содержать никаких пробелов.
    //– Длина не должна превышать 5 цифр.
    public static void main(String[] args) {
        System.out.println(isValid("59001"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("732 32"));
        System.out.println(isValid("393939"));
    }

    private static boolean isValid(String s) {
        return s.matches("[0-9]{5}");
    }
}
