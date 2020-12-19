package Task4;

import java.util.HashMap;
import java.util.Map;

public class Number10 {
    //Предположим, что пара одинаковых символов служит концами книги
    // для всех символов между ними.Напишите функцию,
    // которая возвращает общее количество уникальных символов
    // (книг, так сказать) между всеми парами концов книги.
    public static void main(String[] args) {
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
    }

    public static int countUniqueBooks(String str, char c){
        HashMap<Character, Integer> values = new HashMap<>();
        boolean start = true;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c && start) {//если start=true
                i++;
                while (str.charAt(i) != c){
                    Integer n = values.get(str.charAt(i));//проверка существования значения по ключу
                    if (n == null)//если значений нет - довавить
                        values.put(str.charAt(i), 1);
                    else//если знач. сущ., то добавляем знач в след. ячейку
                        values.put(str.charAt(i), n);
                    i++;
                }
                start = false;
            }
            if (str.charAt(i) == c)
                start = true;
        }
        return values.size();
    }
}
