package Task3;

public class Number3 {
    // Создайте функцию, которая проверяет, является ли целое число совершенным
    //числом или нет. Совершенное число - это число, которое можно записать как
    //сумму его множителей, исключая само число.
    public static void main(String[] args){
        System.out.println(checkPerfect(6));
    }
    public static boolean checkPerfect(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                result += i;
            if (result > n)
                return false;
        }
        return (result == n);
    }
}
