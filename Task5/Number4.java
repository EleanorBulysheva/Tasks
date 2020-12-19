package Task5;

public class Number4 {
        /* 4. Создайте функцию, которая принимает числа в качестве аргументов, складывает их
    вместе и возвращает произведение цифр до тех пор, пока ответ не станет длиной
    всего в 1 цифру.*/
        public static void main(String[] args) {
            System.out.println(sumDigProd(16, 28));
        }

   private static int sumDigProd(int... v) {
        int k = 0;//сумма
        for (int i = 0; i < v.length; i++)
            k += v[i];//сумма всех значений
        int u = 1;
        String s = Integer.toString(k);
        for (int j = 0; j < s.length(); j++)
            //Преобразует числовой символ Юникода
            // в указанной позиции в указанной строке
            // в число двойной точности с плавающей запятой
            u *= Character.getNumericValue(s.charAt(j));
        if (u > 9)//пока значение не Однозначное
            return sumDigProd(u);
        else
            return u;
    }
}
