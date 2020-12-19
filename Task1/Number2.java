package Task1;

public class Number2 {
    //Напишите функцию, которая принимает основание и высоту треугольника и
    //возвращает его площадь.
    public static void main(String[] args) {
        System.out.println(triArea(3,2));
        System.out.println(triArea(7,4));
        System.out.println(triArea(10,10));
    }

    static int triArea(int a, int h) {
        return a*h/2;
    }
}
