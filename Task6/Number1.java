package Task6;

public class Number1 {
        /*1. Число Белла - это количество способов, которыми массив из n элементов может
    быть разбит на непустые подмножества. Создайте функцию, которая принимает
    число n и возвращает соответствующее число Белла.*/
        public static void main(String[] args) {
            System.out.println(bell(3));
        }

   public static int bell(int num) {
       int[][] mass = new int[num + 1][num + 1];//создаем массив
       int sum = 0;//переменная для суммы
       mass[0][0] = 1;
       mass[num][num] = 1;
       for (int n = 1; n <= num; n++) {//перебор массива
           for (int i = 1; i < num; i++) {
               mass[n][i] = mass[n - 1][i - 1] + i * mass[n - 1][i];//формула
               //System.out.println(mass[n][i]);
           }
       }
       for (int i = 0; i <= num; i++) sum += mass[num][i];//сумма
       return sum;
   }
}
