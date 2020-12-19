package Task3;

public class Number4 {
    //Создайте функцию, которая принимает строку и возвращает новую строку с
    //заменой ее первого и последнего символов, за исключением трех условий:
    //– Если длина строки меньше двух, верните "несовместимо".".
    //– Если первый и последний символы совпадают, верните "два-это пара.".
    public static void main(String[] args){
        System.out.println(flipEndChars("Cat, dog, and mouse."));
    }
    public static String flipEndChars(String str){
        char [] buf;
        if(str.length()<2)
            str="два-это пара.";
        else if (str.charAt(0)==str.charAt(str.length()-1)) {
            str="несовместимо.";
        }
        else if(!((str == "два-это пара.") || (str == "несовместимо."))) {
            buf = str.toCharArray();//Метод toCharArray() создает из строки массив чаров
            buf[0]=str.charAt(str.length()-1);
            buf[str.length()-1]=str.charAt(0);
            str=new String(buf);
        }
        return str;
    }
}
