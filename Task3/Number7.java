package Task3;

public class Number7 {
    // Число Капрекара-это положительное целое число, которое после возведения в
    // квадрат и разбиения на две лексикографические части равно сумме двух
    // полученных новых чисел:
    // – Если количество цифр квадратного числа четное, то левая и правая части будут иметь
    // одинаковую длину.
    // – Если количество цифр квадратного числа нечетно, то правая часть будет самой длинной
    // половиной, а левая-самой маленькой или равной нулю, если количество цифр равно 1.
    // – Учитывая положительное целое число n, реализуйте функцию, которая возвращает true,
    // если это число Капрекара, и false, если это не так.
    public static void main(String[] args) {
        System.out.println(isKaprekar(5));
    }

    private static boolean isKaprekar(int x) {
        String result = String.valueOf((int) Math.pow(x, 2));
        //Метод valueOf() возвращает примитивное значение указанного объекта
        int num1, num2 = 0;
        if (result.length() == 1)
            num1 = 0;
        else {
            //Метод Integer.parseInt используется для преобразования String в Integer
            num1 = Integer.parseInt(result.substring(0, (int) (result.length() / 2)));
            num2 = Integer.parseInt(result.substring((int) (result.length() / 2)));
        }
        return (num1 + num2 == x);
    }
}
