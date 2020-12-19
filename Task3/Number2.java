package Task3;

public class Number2 {
    // Напишите функцию, которая возвращает позицию второго вхождения " zip " в
    //строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
    //быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
    //произойти в строке.
    public static void main(String[] args) {
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));
    }
//Метод lastIndexOf() возвращает индекс последнего вхождения указанного
// значения в строковый объект String, на котором он был вызван, или -1, если ничего не было
    private static int findZip(String s) {
        if (s.lastIndexOf("zip") != s.indexOf("zip") && s.indexOf("zip") != -1)
            return s.lastIndexOf("zip");
        return -1;
    }
}
