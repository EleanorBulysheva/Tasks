package Task6;

import java.util.Scanner;
import java.util.Vector;

public class Number6 {
        /* 6.Создайте функцию, которая принимает число n и возвращает n-е число в
    последовательности Улама.*/
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(ulam(n));
        }

    static final int MAX = 1000;
    static Vector<Integer> arr = new Vector<Integer>();

   static void ulam1() {
        arr.add(1);//первое число
        arr.add(2);//второе число
        for (int i = 3; i < MAX; i++) {
            int count = 0;
            for (int j = 0; j < arr.size() - 1; j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    if (arr.get(j) + arr.get(k) == i) {//если числа разные и сумма этих двух знач = след знач
                        count++;
                    }
                    if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }
            if (count == 1) {
                arr.add(i);
            }
        }
    }

    public static int ulam(int n) {
        ulam1();
        int[] ulam = new int[n];
        int k = 0;
        for (int i = 0; i <= n; i++, k++, n--) {
            ulam[k] = (arr.get(n - 1));
            i = 0;
        }
        return (ulam[0]);//вывод
    }
}
