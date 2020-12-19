package Task2;

public class Number10 {
    //Создайте функцию, которая принимает число (шаг) в качестве аргумента и
    //возвращает количество полей на этом шаге последовательности.
    //Шаг 0: начните с 0
    //Шаг 1: Добавьте 3
    //Шаг 2: Вычтите 1
    //Повторите Шаги 1 И 2 ...
    public static void main(String[] args) {
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
    }

    private static int boxSeq(int i) {
        int s = 0;
        for (int step = 1; step <= i; step++) {
            if (step % 2 != 0)
                s += 3;
            else
                s -= 1;
        }
        return s;
    }
}
