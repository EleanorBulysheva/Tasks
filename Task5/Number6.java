package Task5;

public class Number6 {
       /* 6. Создайте функцию, которая принимает число в качестве аргумента и возвращает
    true, если это число является действительным номером кредитной карты, а в
    противном случае-false.*/
       public static void main(String[] args) {
           System.out.println(validateCard(1234567890123456L));
       }

   public static boolean validateCard(long cardNum) {
       StringBuilder str = new StringBuilder();
       if (Long.toString(cardNum).length() >= 14 && Long.toString(cardNum).length() <= 19) {
           // шаг 1
           long lastNum = cardNum % 10;//последнее занчение("контрольная цифра")
           StringBuilder cardNumStr = new StringBuilder(Long.toString(cardNum /= 10));//номер без последней цифры
           // шаг 2
           cardNumStr.reverse();//перевернутое число
           // шаг 3
           for (int i = 0; i < cardNumStr.length(); i++) {//перебираем cardNumStr
               if (i % 2 == 0) {//проверка на четность/нечетность
                   //Удвойте значение каждой цифры в нечетных позициях
                   int c = Character.getNumericValue(cardNumStr.charAt(i)) * 2;// возвращает значение INT , что указанный символ Unicode представляет
                   if (c > 9) {//Если удвоенное значение имеет более 1 цифры, сложите цифры вместе
                       String buf = Integer.toString(c);//сохраняем знач. в переменную(String) и складываем 1 и 2 цифру
                       str.append(Character.getNumericValue(buf.charAt(0)) + Character.getNumericValue(buf.charAt(1)));//сложите цифры вместе
                   } else str.append(c);//добавление значения
               } else str.append(cardNumStr.charAt(i));
           }
           System.out.println(str);//изменненный номер
           int sum = 0;
           for (int i = 0; i < str.length(); i++)
               sum += Character.getNumericValue(str.charAt(i));//находим сумму
           System.out.println(sum);//сумма изменненного номера
           System.out.println(lastNum);//вывод последней цифры
           return lastNum == 10 - sum % 10;//10 - последняя цифра суммы
       }
       return false;
   }
}
