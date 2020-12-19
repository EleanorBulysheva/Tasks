package Task2;

public class Number8 {
    //Пара строк образует странную пару, если оба из следующих условий истинны:
    //– Первая буква 1-й строки = последняя буква 2-й строки.
    //– Последняя буква 1-й строки = первая буква 2-й строки.
    //– Создайте функцию, которая возвращает true, если пара строк представляет собой
    //странную пару, и false в противном случае.
    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));
    }

    private static boolean isStrangePair(String s1, String s2) {
        if (s1.equals("") || s2.equals("")){
            return true;
        } else if (s1.charAt(0)== s2.charAt(s2.length()-1) && s2.charAt(0) == s1.charAt(s1.length()-1)) {
            return true;
        } else {
            return false;
        }
    }
}
