package Task2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Number2 {
    //Создайте функцию, которая принимает массив и возвращает разницу между
    //самыми большими и самыми маленькими числами.
    public static void main(String[] args) {
        System.out.println(differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[] {44, 32, 86, 19}));
    }

    public static int differenceMaxMin(int[] ints) {
        IntSummaryStatistics summaryStatistics = Arrays.stream(ints).summaryStatistics();
        return summaryStatistics.getMax() - summaryStatistics.getMin();
    }

}
