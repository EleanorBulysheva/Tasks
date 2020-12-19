package Task6;

public class Number3 {
        /* 3. Учитывая параметры RGB (A) CSS, определите, является ли формат принимаемых
    значений допустимым или нет. Создайте функцию, которая принимает строку
            (например, " rgb(0, 0, 0)") и возвращает true, если ее формат правильный, в
    противном случае возвращает false.*/
        public static void main(String[] args) {
            System.out.println(validColor("rgb(0,,0)"));
        }

    public static boolean validColor(String rgb) {
        int num = rgb.indexOf('(');//
        if (rgb.contains(" ")||rgb.contains(",,"))//Java String contains()- метод чтобы проверить, содержит ли String указанную последовательность символов
            return false;
        String[] newrgb = rgb.substring(rgb.indexOf('(') + 1, rgb.indexOf(')')).split(",");//запись цифр в скобках
        double[] n = new double[num];
        for (int i = 0; i < num; i++) {
            n[i] = Double.parseDouble(newrgb[i]);//parseDouble возвращает примитивный двойник, содержащий значение строки
        }
        for (int i = 0; i < num; i++) {
            return n[i] >= 0 && n[i] < 255 && num == newrgb.length;
        }
        return false;
    }
}
