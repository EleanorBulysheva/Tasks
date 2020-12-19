package Task5;

public class Number2 {
        /* 2. Создайте функцию, которая принимает имя шахматной фигуры, ее положение и
    целевую позицию. Функция должна возвращать true, если фигура может двигаться
    к цели, и false, если она не может этого сделать.*/
        public static void main(String[] args) {
            System.out.println(canMove("Rook", "A8", "H8"));
        }


    public static boolean canMove(String name, String start, String end) {
        char startl = start.charAt(0);//первое занчение start
        int startn = Integer.parseInt(String.valueOf(start.charAt(1)));//преобразует 2 эл. в тип данных int
        char endl = end.charAt(0);//первое занчение end
        int endn = Integer.parseInt(String.valueOf(end.charAt(1)));//преобразует 2 эл. в тип данных int
        if (startl == endl && startn == endn) return false;//если старт является конецной точкой
        switch (name) {
            case "Pawn": {//Пешка
                if (startl == endl && startn == 2 && endn == 4)//первый ход
                    return true;
                return startl == endl && endn == (startn + 1);
            }
            case "Knight": {//конь
                return (Math.abs(startl - endl) == 2 && Math.abs(startn - endn) == 1) || (Math.abs(startl - endl) == 1 && Math.abs(startn - endn) == 2);
            }
            case "Bishop": {//слол
                return Math.abs(startl - endl) == Math.abs(startn - endn);
            }
            case "Rook": {//ладья
                return (startl == endl && startn != endn) || (startl != endl && startn == endn);
            }
            case "Queen": {
                if ((startl == endl && startn != endn) || (startl != endl && startn == endn))
                    return true;
                if (Math.abs(startl - endl) == Math.abs(startn - endn))
                    return true;
                break;
            }
            case "King": {
                return Math.abs(startl - endl) < 2 && Math.abs(startn - endn) < 2;
            }
            default:
                return false;
        }
        return false;
    }
}
