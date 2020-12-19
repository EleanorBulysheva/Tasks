package Task4;

public class Number7 {
    // Напишите функцию, которая преобразует строку в звездную стенографию.
    // Если символ повторяется n раз, преобразуйте его в символ*n.
    public static void main(String[] args) {
        System.out.println(toStarShorthand("abbccc"));
    }

    public static String toStarShorthand(String str) {
        int count = 1;
        char let = str.charAt(0);//1 эл.
        String newStr = "";
        for (int i = 1; i < str.length(); i++) {//начинаем с 2 эл.
            if (str.charAt(i) != let) {//проверка на совпадение
                if (count != 1)//если эл. больше 1
                    newStr += let + "*" + count;
                else//если эл. 1
                    newStr += let;
                let = str.charAt(i);//след. эл
                count = 1;
            }
            else
                count++;//кол-во совпадающих эл
        }
        if (count != 1)
            newStr += let + "*" + count;
        else
            newStr += let;
        return newStr;
    }
}
