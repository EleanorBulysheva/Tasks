package Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number2 {
    //Напишите функцию, которая группирует строку в кластер скобок.
    //Каждый кластер должен быть сбалансирован.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("((())())(()(()()))")));
    }

    public static String[] split(String str) {
        List<String> list = new ArrayList<String>();
        int f = 0;
        int i = 0;//индекс
        while (str.length() > 0) {
            if (str.charAt(i) == '(') f++;
            else f--;
            if (f == 0) {//срабатывает, когда кол-во открытых скоб = кол-ву закрытых
                list.add(str.substring(0, i + 1));//группировка
                str = str.substring(i + 1);//обрезание обработанной строки
                i = 0;//обнулние индекса
                continue;
            }
            i++;
        }
        return list.toArray(new String[list.size()]);
    }
}
