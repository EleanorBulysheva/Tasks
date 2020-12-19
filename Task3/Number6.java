package Task3;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Number6 {
    // Напишите функцию, которая возвращает true, если два массива имеют одинаковое
    // количество уникальных элементов, и false в противном случае.
    public static void main(String[] args) {
        System.out.println(same(new int[] {1,3,4,4,4}, new int[] {2,5,7}));
        System.out.println(same(new int[] {9,8,7,6}, new int[] {4,4,3,1}));
        System.out.println(same(new int[] {2}, new int[] {3,3,3,3}));
    }

    private static boolean same(int[] a1, int[] a2) {
        HashSet<Integer> set1 = new HashSet<>();//Класс HashSet реализует интерфейс Set
        HashSet<Integer> set2 = new HashSet<>();//Класс HashSet реализует интерфейс Set

        for (int k: a1) {
            set1.add(k);//Метод set.add() добавляет элемент elem в множество set.
        }

        for (int l: a2) {
            set2.add(l);//Метод set.add() добавляет элемент elem в множество set.
        }

        return set1.size() == set2.size();//Set.size () используется для получения
        // размера набора или количества элементов, присутствующих в наборе.
    }
}
