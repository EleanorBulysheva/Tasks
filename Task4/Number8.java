package Task4;

public class Number8 {
    //Создайте функцию, которая возвращает true,
    // если две строки рифмуются, и false в противном случае.
    // Для целей этого упражнения две строки рифмуются,
    // если последнее слово из каждого предложения содержит одни и те же гласные.
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
    }

   public static boolean doesRhyme(String str1, String str2) {
       str1 = str1.substring(str1.lastIndexOf(" ") + 1);//возвращает последнее слово
       str2 = str2.substring(str2.lastIndexOf(" ") + 1);
       //System.out.println(str1);
       String let = "aeiouyAEIOUY";//все гласные
       String res1 = "", res2 = "";
       for (int i = 0; i < str1.length(); i++) {
           //indexOf возвращает индекс, под которым символ или строка первый раз появляется в строке;
           //возвращает (-1) если символ или строка не найдены.
           if (let.indexOf(str1.charAt(i)) != -1)//если есть гласные
               res1 += str1.charAt(i);//записывает последнюю гласную
       }
       for (int i = 0; i < str2.length(); i++) {
           if (let.indexOf(str2.charAt(i)) != -1)//если есть гласные
               res2 += str2.charAt(i);//записывает последнюю гласную
       }
       //преобразовывает все гласные в нижний регистр и сравнивает их
       if (res1.toLowerCase().equals(res2.toLowerCase())) return true;
       else
           return false;
   }
}
