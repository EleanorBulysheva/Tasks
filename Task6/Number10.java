package Task6;

public class Number10 {
        /* 10. Число может не быть палиндромом, но его потомком может быть. Прямой потомок
    числа создается путем суммирования каждой пары соседних цифр, чтобы создать
    цифры следующего числа.*/
        public static void main(String[] args) {
            System.out.println(palindromeDescendant(11211230));
        }

    public static boolean palindromeDescendant(int num) {
            //Integer.toString () является встроенным методом в Java,
        // который используется для возврата объекта String, представляющего значение этого Integer
        String ns = Integer.toString(num);
        String rs = "";
        for (int i = 0; i < ns.length(); i++) rs = ns.charAt(i) + rs;

        for (int i = 0; ns.length() >= 2; i++) {
            if (ns.equals(rs)) return true;
            ns = "";
            for (int y = rs.length() - 1; y > 0; y = y - 2)
                //Character.getNumericValue возвращает -1, если это не числовое значение
                ns += Character.getNumericValue(rs.charAt(y)) + Character.getNumericValue(rs.charAt(y - 1));
            rs = "";
            for (int x = 0; x < ns.length(); x++) rs = ns.charAt(x) + rs;
        }
        return false;
    }
}
