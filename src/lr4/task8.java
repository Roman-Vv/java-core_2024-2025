package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String value = scanner.nextLine();
        System.out.println("Введите ключ для шифрования:");
        int key = scanner.nextInt();

        char[] chars = value.toCharArray();
        int [] ints = new int[value.length()];

        for (int i = 0; i < chars.length; i ++){
            ints[i] = chars[i] + key;
        }
        for (int i = 0; i < chars.length; i++ ){
            chars[i] = (char) ints[i];
        }
        System.out.println("Текст после преобразования " + Arrays.toString(chars));
        System.out.println("Произвести дешифровку? y/n");
        boolean cool = false;
        while (!cool) {
            String reply = scanner.next();
            // если пользователь вводит «y», тогда выполнить обратное преобразование.
            if (reply.toLowerCase().equals("y")) {
                for (int i = 0; i < chars.length; i ++){
                    ints[i] = chars[i] - key;
                }
                for (int i = 0; i < chars.length; i++ ){
                    chars[i] = (char) ints[i];
                }
                System.out.println("Текст после преобразования " + Arrays.toString(chars));
                cool = true;
            }
            // Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            }
            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }
    }

}
