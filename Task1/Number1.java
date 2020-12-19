package Task1;

public class Number1 {
    //В Java есть единственный оператор, способный обеспечить остаток от операции
    //деления. Два числа передаются в качестве параметров. Первый параметр,
    //разделенный на второй параметр, будет иметь остаток, возможно, ноль. Верните
    //это значение.
    public static void main(String[] args) {
        System.out.println(remainder(1,3));
        System.out.println(remainder(3,4));
        System.out.println(remainder(-9,45));
        System.out.println(remainder(5,5));
    }

    static int remainder(int a, int b) {
        return a % b;
    }
}
