package Task6;

import java.util.LinkedHashMap;
import java.util.Map;

public class Number4 {
        /* 4. Создайте функцию, которая принимает URL (строку), удаляет дублирующиеся
    параметры запроса и параметры, указанные во втором аргументе (который будет
    необязательным массивом).*/
        public static void main(String[] args) {
            String[] b= {"b"};
            System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2",b));
        }

    public static String stripUrlParams(String url, String... paramsToStrip) {
        String str = "";
        if (!url.contains("?"))//Java String contains()- метод чтобы проверить, содержит ли String указанную последовательность символов
            return url;
        else {
            str = url.substring(url.indexOf("?") + 1);//обрезаем ссылку после ?
            url = url.substring(0, url.indexOf("?") + 1);//до ?
        }
        char[] params = str.toCharArray();//разбивает по 1 знаку
// расширяемую строку, которую можно изменять без ущерба для производительности
        StringBuilder print = new StringBuilder();
        for (char param : params) {//перебор массива
            if (Character.isLetter(param))//Character.isLetter() — в Java определяет, является ли указанное значение типа char буквой
                if (!(print.toString().contains(String.valueOf(param)))) {//проверка на совпадение эл.
                    if (paramsToStrip.length > 0) {//если введен paramsToStrip
                        for (String arg : paramsToStrip) {
                            if (!(arg.contains(String.valueOf(param))))//если встречается эл, совпадающий с paramsToStrip
                                //append() — обновляет значение объекта, который вызвал метод
                                print.append(str.substring(str.lastIndexOf(param), str.lastIndexOf(param) + 3)).append("&");//обновление строки
                        }
                    } else
                        print.append(str.substring(str.lastIndexOf(param), str.lastIndexOf(param) + 3)).append("&");//обновление строки без paramsToStrip
                }
        }
        return url + print.substring(0, print.length() - 1);//вывод
    }
}
