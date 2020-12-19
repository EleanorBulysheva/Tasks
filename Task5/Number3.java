package Task5;

public class Number3 {
        /* 3. Входная строка может быть завершена, если можно добавить дополнительные
    буквы, и никакие буквы не должны быть удалены, чтобы соответствовать слову.
    Кроме того, порядок букв во входной строке должен быть таким же, как и порядок
    букв в последнем слове.*/
        public static void main(String[] args) {
            System.out.println(canComplete("butl", "beautiful"));
        }

        //проверяем есть ли одинаковые буквы и обрезаем пройденную часть строки
        private static int kolvoOneSimbol(String a, char c) {
        int kolvo = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) kolvo++;
        }
        return kolvo;
    }
    //проверяется порядок букв во входной строке,он должен быть таким же,
    //как и порядок букв в последнем слове
    private static boolean canComplete(String a, String b) {
        if (a.charAt(0) != b.charAt(0)) return false;
        int k = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            if (kolvoOneSimbol(a, c) > kolvoOneSimbol(b, c)) return false;
        }
        return true;
    }
}
