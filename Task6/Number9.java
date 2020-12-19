package Task6;

import java.util.Arrays;

public class Number9 {
        /* 9. Создайте функцию, которая принимает строку и возвращает true или false в
    зависимости от того, является ли формула правильной или нет. */
        public static void main(String[] args) {
            System.out.println(formula("18 / 17 = 2"));
        }

   public static boolean formula(String formula) {
       String[] mass = formula.split(" ");//массив с эл.
       int ans = 0;
       int expectedResult = 0;
       if (!Character.isDigit(mass[0].charAt(0))) return false;//Метод Character.isDigit() — определяет, является ли указанное значение типа char цифрой
       else ans = Integer.parseInt(mass[0]);//Метод parseInt() — в Java используется для получения примитивного типа данных определенной строки, другими словами — преобразует строку в число
       int i = 1;
       while (!mass[i].equals("=")) {//пока не встретит =
           if (mass[i].equals("+")) {//"+"
               ans += Integer.parseInt(mass[i + 1]);
           }
           if (mass[i].equals("-")) {//"-"
               ans -= Integer.parseInt(mass[i + 1]);
           }
           if (mass[i].equals("*")) {//"*"
               ans *= Integer.parseInt(mass[i + 1]);
           }
           if (mass[i].equals("/")) {//"/"
               ans /= Integer.parseInt(mass[i + 1]);
           }
           i=i+2;
       }
       i = formula.indexOf('=');// i присваивается "="
       String check = formula.substring(i + 1, formula.length());//знач. после "="
       if (check.contains("=")) return false;
       else expectedResult = Integer.parseInt(mass[mass.length - 1]);//последнее знач.
       return ans == expectedResult;//проверка
   }
}
