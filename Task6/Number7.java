package Task6;

public class Number7 {
        /* 7. Напишите функцию, которая возвращает самую длинную неповторяющуюся
    подстроку для строкового ввода.*/
        public static void main(String[] args) {
            System.out.println(longestNonrepeatingSubstring("abcabcbb"));
        }

    public static String longestNonrepeatingSubstring(String str) {
        String podstr = "";
        char[] mass = str.toCharArray();//массив эл.
        // расширяемую строку, которую можно изменять без ущерба для производительности
        StringBuilder strBuilder = new StringBuilder();
        for (char c : mass) {//перебо массива
            if (!strBuilder.toString().contains(String.valueOf(c)))//проверка на совпадение
                strBuilder.append(c);//обновление strBuilder
            else {
                if (strBuilder.length() > podstr.length())
                    podstr = strBuilder.toString();//ниходим самую длинную неповторяющуюся подстроку
                strBuilder = new StringBuilder("" + c);
            }
        }
        str = strBuilder.toString();//вывод самой длинной неповторяющейся подстроки
        if (str.length() > podstr.length())
            podstr = str;
        return podstr;
    }
}
