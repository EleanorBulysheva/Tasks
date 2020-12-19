package Task4;

public class Number5 {
    // Индекс массы тела (ИМТ) определяется путем измерения вашего веса
    // в килограммах и деления на квадрат вашего роста в метрах.
    // Категории ИМТ таковы:
    // Недостаточный вес: <18,5
    // Нормальный вес: 18.5-24.9
    // Избыточный вес: 25 и более Создайте функцию, которая будет принимать вес
    // и рост (в килограммах, фунтах, метрах или дюймах)
    // и возвращать ИМТ и связанную с ним категорию.
    // Округлите ИМТ до ближайшей десятой.
    public static void main(String[] args) {
        System.out.println(BMI("205 pounds", "73 inches"));
    }

    private static String BMI(String weight, String height) {
        String[] weig = weight.split(" ");
        String[] heig = height.split(" ");
        String result = "";

        //берет значение от 0 индекса до ключевого слова
        double kilos = weig[1].equals("pounds") ? Double.parseDouble(weig[0]) * 0.453592 : Double.parseDouble(weig[0]);
        //parseDouble возвращает примитивный двойник, содержащий значение строки
        double meters = heig[1].equals("inches") ? Double.parseDouble(heig[0]) * 0.0254 : Double.parseDouble(heig[0]);

        double val = kilos / (meters * meters);
        val = Math.round(val * 10.0)/10.0;

        if (val < 18.5) result += val+" Underweight";//если недовес
        if (val >= 18.5 && val <= 24.5) result += val + " Normal weight"; //если нормальный вес
        if (val >= 25 && val <= 29.9) result += val + " Overweight"; //если избыточный вес
        if (val >= 30) result += val + " Obesity"; //если ожирение
        return result;
    }
}
