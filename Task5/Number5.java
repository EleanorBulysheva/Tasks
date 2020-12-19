package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Number5 {
        /* 5. Напишите функцию, которая выбирает все слова, имеющие все те же гласные (в
    любом порядке и / или количестве), что и первое слово, включая первое слово.*/
        public static void main(String[] args) {
            String[] s = {"toe", "ocelot", "maniac"};
            System.out.println(Arrays.toString(sameVowelGroup(s)));
        }

    public static String[] sameVowelGroup(String[] words) {
        boolean first = true;
        String wordVowels = "";
        String vowels = "aeiou";

        ArrayList<String> results = new ArrayList<>(); //list для слов

        //первое слово, если существует гласная в слове из list(words), то запись гласной
        for (String word : words) {
            if (first) {
                first = false;
                wordVowels = getUniqueVowels(word);
                if (wordVowels.length() == 0)
                    break;
                continue;
            }

            StringBuilder vb = new StringBuilder(vowels);

            // перебор всех слов по очереди, если существует гласная в слове из list(words), то запись гласных
            boolean valid = true;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (vowels.contains(Character.toString(c))) {
                    if (!wordVowels.toString().contains(Character.toString(c))) {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid) {
                if (results.isEmpty())
                    results.add(words[0]);
                results.add(word);
            }
        }

        if (results.isEmpty())
            results.add(words[0]);

        return results.toArray(new String[results.size()]);
    }

    //пребор гласных всех слов по очереди(second), если гласные первого слова
    // совпадают с гласными след слова, то записываем, иначе удаляем
    public static String getUniqueVowels(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.contains(Character.toString(c))) {
                if (set.add(c))
                    sb.append(c);
            }
            if (sb.length() == 5)
                break;
        }
        return sb.toString();
    }
}