package Task6;

import java.util.Arrays;

public class Number2 {
        /* 2. В «поросячей латыни» (свинский латинский) есть два очень простых правила:
            – Если слово начинается с согласного, переместите первую букву (буквы) слова до
        гласного до конца слова и добавьте «ay» в конец.*/
        public static void main(String[] args) {
            System.out.println(translateWord("flag"));
            System.out.println(translateSentence("I like to eat honey waffles."));
        }


    public static String translateWord(String word) {
        if (word.matches("[aeiouy]")) {//если 1 гласная
            word += "yay";
        } else {
            //System.out.println(word);
            //System.out.println(word.split("[aeiouy]")[0]);
            String newWord = word.split("[aeiouy]")[0];//первая согл. буква
            word = word.replaceFirst(newWord, "") + newWord + "ay";//replaceFirst() — заменяет первую подстроку данной строки, которая соответствует заданному регулярному выражению, с данной заменой
        }
        return word;
    }

    public static String translateSentence(String word) {
        String vow = "aeiouyAEIOUY";//все гласные
        String[] newword = word.substring(0, word.length() - 1).split(" ");//разбиваем предложение по словам
        word = "";
        for (String s : newword) {
            for (int j = 0; j < vow.length(); j++) {
                if (vow.indexOf(s.charAt(j)) != -1) {//если гл.
                    word += s + "yay ";
                    break;
                } else {//если согл.
                    String newWord = s.split("[aeiyouAEIYOU]")[0];//первая согл. буква
                    word += s.replaceFirst(newWord, "") + newWord + "ay ";//алгоритм из задания
                    break;
                }
            }
        }
        return word + ".";
    }
}
