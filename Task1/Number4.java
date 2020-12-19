package Task1;

public class Number4 {
    //Создайте функцию, которая принимает три аргумента (prob, prize, pay) и
    // возвращает true, если prob * prize > pay; в противном случае возвращает false.
    //Чтобы проиллюстрировать это: profitableGamble (0,2, 50, 9) должен выдать значение true,
    //поскольку 1 (0,2 * 50 - 9), а 1> 0.
    public static void main(String[] args) {
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
    }

    static boolean profitableGamble(double prob, int prize, int pay) {
        return prob*prize>pay;
    }
}
