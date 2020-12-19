package Task4;

public class Number6 {
    // Создайте функцию, которая принимает число и возвращает его
    // мультипликативное постоянство, которое представляет собой количество раз,
    // которое вы должны умножать цифры в num, пока не достигнете одной цифры.
    public static void main(String[] args){
        System.out.println(bugger(999));
    }

   public static int bugger(int num) {
       int kol = 0;
       while (num > 9) {//пока значение двузначное
           int chnum = 1;//произведение
           while (num > 0) {
               chnum *= (num % 10);//произвдение всех цифр
               num /= 10;//целочисленное деление
           }
           num = chnum;//num = произвдение всех цифр
           kol++;
       }
       return kol;
   }
}
