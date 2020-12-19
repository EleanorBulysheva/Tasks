package Task5;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Number8 {
       /*8. Хеш-алгоритмы легко сделать одним способом, но по существу невозможно
    сделать наоборот. Например, если вы хешируете что-то простое, например,
    password123, это даст вам длинный код, уникальный для этого слова или фразы. В
    идеале, нет способа сделать это в обратном порядке. Вы не можете взять хеш-код и
    вернуться к слову или фразе, с которых вы начали.*/

    public static void main(String[] args) throws NoSuchAlgorithmException {
           System.out.println(getSha256Hash("password123"));
       }

    private static String getSha256Hash(String s) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        //вычисление дайджеста сообщения из одного блока данных
        byte[] hashInBytes = md.digest(s.getBytes(StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder(); //строка с кодом
        for (byte b : hashInBytes) {
            //append () используется для добавления строкового представления
            // некоторого аргумента в последовательность
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
