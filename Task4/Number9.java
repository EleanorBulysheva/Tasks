package Task4;

public class Number9 {
    //Создайте функцию, которая принимает два целых числа и возвращает true,
    // если число повторяется три раза подряд в любом месте в num1 и то же самое
    // число повторяется два раза подряд в num2.
    public static void main(String[] args) {
        System.out.println(trouble("451999277","41177722899"));
    }

   public static boolean trouble(String number1, String number2) {
        int count1 = 0;
        int count2 = 0;
        String currentChar = "";
        for (int i = 0; i < number1.length() - 1; i++) {
            currentChar = String.valueOf(number1.charAt(i));
            if (currentChar.equals(String.valueOf(number1.charAt(i + 1))))
                count1++;
            else count1 = 0;
            //если 3 числа совпадают
            if (count1 == 2) {
                count2 = 0;
                for (int j = 0; j < number2.length(); j++) {
                    //если 2 числа совпадают
                    if (currentChar.equals(String.valueOf(number2.charAt(j))))
                        count2++;
                    else count2 = 0;
                    if (count2 == 2) return true;
                }
            }
        }
        return false;
    }
}
