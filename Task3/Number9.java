package Task3;

public class Number9 {
    // Если задано целое число, создайте функцию, которая возвращает следующее
    // простое число. Если число простое, верните само число.
    public static void main(String[] args) {
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));
    }

    private static int nextPrime(int num) {
        boolean prime = true;
        int next = num;
        while (true) {
            prime = true;
            for (int i = 2; i < next - 1; i++) {
                if (next % i == 0) prime = false; //условный опереатор определяет является ли число простым
            }
            if (prime) return next;
            next++;
        }
    }
}
