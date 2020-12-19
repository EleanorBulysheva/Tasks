package Task3;


import java.util.Arrays;

public class Number10 {
    // Учитывая три числа, x, y и z, определите, являются ли они ребрами
    // прямоугольного треугольника.
    public static void main(String[] args) {
        System.out.println(rightTriangle(3,4,5));
    }

    public static boolean rightTriangle(int a, int b, int c) {
        if ( a == 0 || b == 0 || c == 0 )
            return false;
        return  (a*a+b*b==c*c || a*a==b*b+c*c || a*a+c*c == b*b);//Теорема Пифагора

    }
}
