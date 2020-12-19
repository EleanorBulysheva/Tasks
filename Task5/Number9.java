package Task5;

public class Number9 {
        /* 9. Напишите функцию, которая принимает строку и возвращает строку с правильным
    регистром для заголовков символов в серии "Игра престолов".
    Слова and, the, of и in должны быть строчными. Все остальные слова должны иметь
    первый символ в верхнем регистре, а остальные-в Нижнем.*/
        public static void main(String[] args){
            System.out.println(correctTitle("sansa stark, lady of winterfell."));
        }


    public static String correctTitle(String title) {
        String[] text = title.toLowerCase().split(" ");//слова с нижным регистром
        //for (int i = 0; i < text.length; i++) System.out.println(text[i]);
        title = "";
        String pos = "";
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals("in") || text[i].equals("of") || text[i].equals("and") || text[i].equals("the"))
                title += text[i].toLowerCase() + " ";//Слова and, the, of и in должны быть строчными
            else
                //установка 1 символа с верхним регистром+след. символы
                title += text[i].substring(0, 1).toUpperCase() + text[i].substring(1) + " ";
        }
        return title;
    }
}
