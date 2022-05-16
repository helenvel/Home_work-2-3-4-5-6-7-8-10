package homeWork;

import jdk.nashorn.internal.objects.NativeString;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Locale;
import java.util.Scanner;

import static utils.Utils.*;

public class HW10 {

    /**
     * Написать метод, который принимает на вход строку.
     * Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы.
     * Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая, вернуть сообщение “Строка пустая”.
     * <p>
     * Test Data:
     * “    QA4Everyone   “ → “Лишние пробелы удалены”
     * “QA4Everyone“ → “Пробелов не было”
     * “” → “Строка пустая”
     *
     * @return
     */

    public static String Task1(String x) {


        if (x.isEmpty()) {
            System.out.println("Строка пустая");
        } else if (x == x.trim()) {
            System.out.println("Пробелов не было");

        } else {
            x.trim();
            System.out.println("Лишние пробелы удалены");

        }

        return x;
    }

    public static String Task2(String x) {

        /**
         * Написать алгоритм RemoveAlla.
         * С помощью методов из видео1, написать алгоритм, который принимает на вход строку.
         * Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
         * Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA4Everyone   “ →  “QA4Everyone“
         * “panda   “ → “pnd”
         */
        System.out.println(x.replace("a", ""));

        return x;
    }

    public static String Task3(String x) {

        /**
         * Написать алгоритм RemoveAllZeros.
         * С помощью методов из видео1, написать алгоритм, который принимает на вход строку, состоящую из цифр.
         * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
         * Метод возвращает обработанную строку, в которой нет нулей.
         * Test Data:
         *  “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
         * “ 0000000111“ → “111”
         */
        if (x == x) {
            System.out.println(x.replace(" ", ""));
            if (x == x) {
                System.out.println(x.replace("0", ""));

            }
        }

        return x;
    }

    public static String Task4 (String x) {

        /**
         * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
         * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
         * Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA   4  Everyone   “ →  “QA4Everyone“
         * “p a     n d a   “ → “panda”
         */
        System.out.println(x.replace(" ", ""));

        return x;
    }

    public static String Task7 (String x) {
        /**
         * Напишите метод, который принимает на вход строку, и добавляет Кавычки в начале строки,
         * точку и кавычки в конце строки с помощью метода concat()
         */


        System.out.println("''".concat(x).concat("''").concat("."));
        return x;
    }

    public static String Task8 (String x) {

        /**
         * Напишите метод, кторый принимает на вход название города и исправляет написание:
         * Test Data:
         * “ташкент” → “Ташкент”
         * “ЧикаГО” → “Чикаго”
         */

          String result = x.substring(0,1).toUpperCase() +x.substring(1).toLowerCase();

        return result;
    }

    public static String Task9 (String x,String a, int b) {
        /**
         *  Напишите метод, который принимает на вход строку, и возвращает все, что находится между первой и последней буквой-параметром:
         * Test Data:
         * “Abracadabra”, “b” → “bracadab”
         * “Whippersnapper”, “p” → “ppersnapp”
         */

        System.out.println(x.substring(x.indexOf(a), x.indexOf(a)+b));

        return x;
    }

    public static boolean Task10 (String x) {

        /**
         * Напишите метод, который принимает на вход слово, и возвращает true,
         * если слово начинается и заканчивается на одинаковую букву, и faulse иначе
         * Test Data:
         * 	“Abracadabra” → true
         * 	“Whippersnapper” → false
         */

        return  (Character.toLowerCase(x.charAt(0)) == Character.toLowerCase(x.charAt(x.length() -1 )));

    }


    public static void main (String [] args) {
        printTask("Задание №", 1);
        Task1("Java for beginners");
        String expectedResult = "Java for beginners ";
        printEmptyLine();
        System.out.println(verifyResult(expectedResult, Task1("Java for beginners")));
        printIntLine();
        printEmptyLine();

        printTask("Задание №", 2);
        Task2("Java for beginners");

        printIntLine();
        printEmptyLine();
        printTask("Задание №", 3);
        Task3("10 02 89");
        printIntLine();


        printEmptyLine();
        printTask("Задание №", 4);
        Task4("Java for beginners");
        printIntLine();

        printEmptyLine();
        printTask("Задание №", 5);

        /**
         * Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
         * Test Data:
         * “Abracadabra” → 5
         * “Homenum Revelio” → 0
         */
        String x = "JAAAvaaa far beginners";

        char Char = 'a';
        char Char2 = 'A';
        int count = 0;
        int count1 =0;

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == Char) {
                    count++;
                }
            }
        for (int j = 0; j < x.length(); j++) {
            if (x.charAt(j) == Char2) {
                count1++;
            }
        }
            System.out.println("a = " + count +  " A = " +count1);

       printIntLine();
       printEmptyLine();
       printTask("Задание №", 6);

        /**
         * Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя бы одно слово Java.
         */

        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial use, " +
                "although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have " +
                "begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        System.out.println(text.contains("Java" ));

        printIntLine();
        printEmptyLine();
        printTask("Задание №", 7);
        Task7("Java for beginners");

        printIntLine();
        printEmptyLine();
        printTask("Задание №", 8);
        System.out.println(Task8("ЧикаГО"));

        printIntLine();
        printEmptyLine();
        printTask("Задание №", 9);
        Task9("Whippersnapper", "p", 9);

        printIntLine();
        printEmptyLine();
        printTask("Задание №", 10);
        System.out.println(Task10("Whippersnapper"));
        
    }
}





