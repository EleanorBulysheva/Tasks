package Task2;

public class Number5 {
    //Создайте функцию, которая возвращает число десятичных знаков, которое имеет
    //число (заданное в виде строки). Любые нули после десятичной точки
    //отсчитываются в сторону количества десятичных знаков.
    public static void main(String[] args) {
        System.out.println(getDecimalPlaces("43.20"));
        System.out.println(getDecimalPlaces("400"));
        System.out.println(getDecimalPlaces("3.1"));
    }

    private static int getDecimalPlaces(String s) {
        String[] splitted = s.split("\\.");
        try {
            return splitted[1].length();
        } catch (Exception e) {
            return 0;
        }
    }
}
