package lr8.task1;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            // Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\MyFile1.txt"), "cp1251"));
            out = new PrintWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("D:\\MyFile2.txt"), "cp1251"));

            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Ошибка закрытия BufferedReader: " + e);
                }
            }
            if (out != null) {
                out.flush();
                out.close();
            }
        }
    }
}
