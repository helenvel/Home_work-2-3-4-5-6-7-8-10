package homeWork;

import sun.usagetracker.UsageTrackerClient;

import java.math.BigDecimal;
import java.math.BigInteger;

import static homeWork.HW5.*;

public class HW6 {

    public static void Task10(double start, double end, double step) {

        for (start = start; start < end; start += step) {
            System.out.println(start);
        }

        /**
         * Написать метод, который принимает на вход параметры start,  end, step,
         * и печатает последовательность десятичных  чисел, начиная с числа start,
         * с шагом step. Точка выхода из цикла - число end.
         */

    }

    public static void irinaTask10(double start, double end, double step) {

        //increasing start < end, step > 0
        //decreasing start > end, step < 0
        if (start < end && step >0) {
            for (start =  start; start < end; start+= step ) {
                System.out.println(start);
            }
         } else if (start>end && step<0) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        }else {
            System.out.println("Invalid data");

        }

        /**
         * Написать метод, который принимает на вход параметры start,  end, step,
         * и печатает последовательность десятичных  чисел, начиная с числа start,
         * с шагом step. Точка выхода из цикла - число end.
         */

    }

    public static void Task11(int l) {

        /**
         * Написать метод, который принимает параметр l
         * и печатает  последовательность четных чисел от нуля. Длина последовательности = l.
         */

        for (int i = 0; i < l; i += 2) {
            System.out.println(i);

        }
    }

    public static void Task12(int n) {
        /**
         *Напишите метод, который принимает целое число n,
         * и выводит все степени числа 2 от 1 до n включительно
         */

        for (double i = 1; i <=n; i++) {

            System.out.println(Math.pow(2, i));
        }
    }

    public static void Task16(int n, int l, int m) {

        /**
         * Написать метод, который принимает параметры n, m, l, и печатает
         * последовательность нечетных чисел начиная с числа n,
         * с шагом m, длина последовательности l.
         */

        for (int i = n; i < l; i += m) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }
    }

        public static void Task18 ( int l, int n) {

            /**
             * Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
             * начиная с числа n, по формуле для n + 1 члена последовательности:
             * n + 1 = 2n
             */
            for (int i = n ; i<l; i=i+1 ){

                    System.out.println(i*2);


            }
        }

        public static void Task20 ( double x) {

            /**
             * Написать метод, который вычислит значение функции:
             */
            double a;
            if (x > 1.5) {
                a = 2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30;
                System.out.println(a);
            } else if (0 <= x && x <= 1.5) {
                a = x + 1;
                System.out.println(a);
            } else  {
                a = x;
                System.out.println(a);
            }
        }
            public static void song99BottlesOfBeer (){

                String bottles = " bottles of beer";
                String bottle = " bottle of beer";
                String wall = " on the wall";
                String take = "Take one down and pass it around";
                String commaSpace = ", ";
                String dot = ".";
                String go = "Go to the store and buy some more";
                String noMoreC = "No more";
                String noMoreL = "no more";
                String ln = "\n";

                for(int i = 99; i > -1; i--) {
                    if(i == 2) {
                        System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                        System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot + ln);
                    } else if(i == 1) {
                        System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
                        System.out.println(take + commaSpace + noMoreL + bottles + wall + dot + ln);
                    } else if(i == 0) {
                        System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
                        System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot);
                    } else {
                        System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                        System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);
                    }
                }
            }


    public static void main(String[] args) {

        /**
         *  Распечатать последовательность чисел от 0 до 9 включительно.
         */
        HW5.printSpaces(1);
        HW5.printTask("Ответ задание №", 1);


        for (int i = 0; i < 10; i++) {

            System.out.println(i);

        }

        /**
         * Распечатать последовательность чисел от 10 исключительно до 0 включительно.
         */
        HW5.printSpaces(2);
        HW5.printTask("Ответ задание №", 2);

        for (int i = 9; i > 0; i--) {
            System.out.println(i);

        }

        /**
         *   Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
         */
        HW5.printSpaces(3);
        HW5.printTask("Ответ задание №", 3);

        for (int i = 50; i < 56; i += 2) {
            System.out.println(i);

        }

        /**
         * Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
         */

        HW5.printSpaces(4);
        HW5.printTask("Ответ задание №", 4);

        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);

            }
        }

        HW5.printSpaces(5);
        HW5.printTask("Ответ задание №", 5);

        /**
         * Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
         */

        for (double i = 12; i < 14; i += 0.1) {
            System.out.println(i);

        }

        HW5.printSpaces(6);
        HW5.printTask("Ответ задание №", 6);

        /**
         * Распечатать последовательность четных чисел от 215 до 237 включительно
         */
        for (int i = 215; i < 238; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }

        HW5.printSpaces(7);
        HW5.printTask("Ответ задание №", 7);

        /**
         * Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
         */

        for (int i = 8; i < 13; i++) {
            if (i % 7 == 0)
                System.out.println(i);

        }

        HW5.printSpaces(8);
        HW5.printTask("Ответ задание №", 8);

        /**
         * Распечатать последовательность которая начинается
         * с минимального значения типа данных short и заканчивается максимальным значением
         * Числа в последовательности должны быть кратны 15001.
         */


        for (short i = -32768; i < 32767; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }

        HW5.printSpaces(9);
        HW5.printTask("Ответ задание №", 9);

        /**
         * Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
         * Числа, кратные 11, должны быть распечатаны синим цветом.
         * Числа, кратные 12, должны быть распечатаны красным цветом.
         * А ноль необходимо распечатать словом ZERO.
         */


        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.println("Zero");
            } else if (i % 11 == 00) {
                System.out.println("\u001B[34m" + i);

            } else if (i % 12 == 00) {
                System.out.println("\u001B[31m" + i);
            }
        }
        System.out.println("\u001B[0m" );


        HW5.printSpaces(10);
        HW5.printTask("Ответ задание №", 10);
        /**
         *Написать метод, который принимает на вход параметры start,  end, step,
         * и печатает последовательность десятичных  чисел, начиная с числа start,
         * с шагом step. Точка выхода из цикла - число end.
         */
        Task10(20.20, 30.20, 1);

        HW5.printTask("Ответ задание №", 10.1);

        irinaTask10(10.5,20.75,1.29);

        HW5.printSpaces(11);
        HW5.printTask("Ответ задание №", 11);



        /**
         * Написать метод, который принимает параметр l
         * и печатает  последовательность четных чисел от нуля. Длина последовательности = l .
         */

        Task11(20);

        HW5.printSpaces(12);
        HW5.printTask("Ответ задание №", 12);


        /**
         *Напишите метод, который принимает целое число n,
         * и выводит все степени числа 2 от 1 до n включительно
         */

        Task12(7);

        HW5.printSpaces(13);
        HW5.printTask("Ответ задание №", 13);

        /**
         * Вывести последовательность 0123456789 00112233445566778899 0 0 0…
         * до числа 9999 включительно.
         */


        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        for (int i1 = 0; i1 < 1; i1++) {
            System.out.print(i1);
            System.out.print(i1);

        }
        for (int i1 = 11; i1 < 100; i1 += 11) {
            System.out.print(i1);
        }
        for (int i1 = 0; i1 < 1; i1++) {
            System.out.print(i1);
            System.out.print(i1);
            System.out.print(i1);
        }
        for (int i1 = 9999; i1 < 10000; i1 += 1) {
            System.out.print(i1);

            System.out.println();


        }


        HW5.printSpaces(14);
        HW5.printTask("Ответ задание №", 14);

        /**
         * Распечатайте последовательность чисел:
         * 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         */
        int a=1;
        for (int i = 0; i <= 5; i++, a=i*(-1)) {
            if (i==0) {
                System.out.print(i + ", ");
            }else{
                System.out.print(i+ ", " + a + ", ");
            }
        }

            System.out.println();
            HW5.printSpaces(15);
            HW5.printTask("Ответ задание №", 15);

            /**
             *Распечатать последовательность чисел:
             * 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
             */

        for (int i = 0; i<=25; i++){
            if (i%3==0 || i%5==0)
                System.out.print(i+",");

        }

        System.out.println();
        HW5.printSpaces(16);
        HW5.printTask("Ответ задание №", 16);

            /**
             * Написать метод, который принимает параметры n, m, ,
             * и печатает последовательность нечетных чисел начиная
             * с числа n, с шагом m,  длина последовательности  .
             */
            Task16(1, 100, 3);

            HW5.printSpaces(17);
            HW5.printTask("Ответ задание №", 17);
            /**
             * Сгенерируйте и распечатайте последовательность по формуле:
             * n + 1 = n + 2
             */

            for (int i =1; i <10; i+=1) {
                System.out.println(i+=2);

            }

        HW5.printSpaces(18);
        HW5.printTask("Ответ задание №", 18);
        Task18(8,2);

        HW5.printSpaces(19);
        HW5.printTask("Ответ задание №", 19);

        /**
         * Сгенерируйте последовательность целых положительных двузначных чисел,
         * в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.
         */
        for (int i =10; i <= 99; i++) {
            if (Math.abs(i / 10 - i % 10) <= 3) {
                System.out.println(i);
            }
        }


        HW5.printSpaces(20);
        HW5.printTask("Ответ задание №", 20);

        /**
         * Написать метод, который вычислит значение функции:
         */
        Task20(3);

        /**
         *Песенка http://www.99-bottles-of-beer.net/lyrics.html
         */

        HW5.printSpaces(21);
        HW5.printTask("", 21);
        song99BottlesOfBeer ();



    }
//     for ( int i = 0; i < 10 ; i++)
//    Всё равно что
//    int i = 0;
//    while ( i <10 ){
//        i++;
//    }





}
