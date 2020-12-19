package Task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Number3 {
    //Создайте функцию, которая принимает массив в качестве аргумента и возвращает
    //true или false в зависимости от того, является ли среднее значение всех элементов
    //массива целым числом или нет.
        public static void main(String[] args) {
            System.out.println(isAvgWhole(new int[] {1, 3}));
            System.out.println(isAvgWhole(new int[] {1, 2, 3, 4}));
            System.out.println(isAvgWhole(new int[] {1, 5, 6}));
            System.out.println(isAvgWhole(new int[] {1, 1, 1}));
            System.out.println(isAvgWhole(new int[] {9, 2, 2, 5}));
        }

        private static boolean isAvgWhole(int[] ints) {
            IntSummaryStatistics summaryStatistics = Arrays.stream(ints).summaryStatistics();
            return summaryStatistics.getAverage() % 1 ==0;
        }
}
