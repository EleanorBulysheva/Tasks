package Task2;

public class Number9 {
    //Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
    //– isPrefix должен возвращать true, если он начинается с префиксного аргумента.
    //– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
    //– В противном случае верните false.
    public static void main(String[] args) {
        System.out.println(isPrefix("automation","auto-"));
        System.out.println(isSuffix("arachnophobia","-phobia"));
        System.out.println(isPrefix("retrospect","sub-"));
        System.out.println(isSuffix("vacation","-logy"));
    }
    //Java startsWith() возвращает значение true, если последовательность символов,
    // представленного аргумента является префиксом последовательности символов,
    // представляемой данной строкой; в противном случае значение false.
    private static boolean isSuffix(String s1, String s2) {
        return s1.endsWith(s2.substring(1));
    }

    private static boolean isPrefix(String s1, String s2) {
        return s1.startsWith(s2.substring(0, s2.length()-2));
    }
}
