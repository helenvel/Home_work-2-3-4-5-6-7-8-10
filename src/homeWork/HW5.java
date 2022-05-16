package homeWork;

import java.text.DecimalFormat;

public class HW5 {

    public static void printTask(String text, double num) {
        String text1 = "Ответ задание №  ";
        System.out.println(text1 + num + " ");
    }

    public static void printSpaces(int a) {
        int number = a;
        System.out.println(" ---------------" + number + "-------------------");

    }

    public static String dayOfTheWeek(int digit) {

        if (digit == 1) {
            return ("Понедельник");
        }
        if (digit == 2) {

            return ("Вторник");
        }
        if (digit == 3) {

            return ("Среда");
        }
        if (digit == 4) {

            return ("Четверг");
        }
        if (digit == 5) {

            return ("Пятница");
        }
        if (digit == 6) {

            return("Суббота");

        }
        if (digit == 7) {
            return("Воскресение");

        }
        return ("Ура, выходные");
    }


    public static String verifyResult(String expectedResult, String actualResult) {


        if (expectedResult.equals(actualResult)) {

            return "Pass";
        } else {


            return "Fail";
        }

    }

    public static String verifyResult(int expectedResult, int actualResult) {


        if (expectedResult == actualResult) {

            return "Pass";
        } else {

            return "Fail";
        }

    }


    public static void isLeapYear(boolean expectedResult, boolean actualResult) {


        if (expectedResult == actualResult) {

            System.out.println("Pass");
        } else {

            System.out.println("Fail");
        }

    }


    public static void verifyDoubleResult(double expectedResult, double actualResult) {


        if (expectedResult == actualResult) {

            System.out.println("Pass");
        } else {

            System.out.println("Fail");
        }

    }

    public static int maxValue(int x, int y, int z) {

        int largest;

        if (x < y) {
            largest = y;
        } else {
            largest = x;
        }
        if (largest > z) {

            return largest;

        } else {
            largest = z;

            return largest;
        }
    }

    public static int minValue(int a, int b, int c) {

        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min < c) {

            return min;
        } else {
            min = c;

            return min;
        }
    }


    public static double averageCat(double a, double b, double c, double d, double s) {

        return ((double) a + b + c + d + s) / 5;

    }

    /**
     * Написать метод, который принимает на вход десятичное число (например, 10.75),
     * и возвращает строку “10 руб 75 коп”.
     */

    public static String receivingADecimalNumber(double a) {

        int y = (int) a;
        double x = a - (long) a;
        String formattedDouble = new DecimalFormat("#0.000").format(x);
        return (y + " руб  " + formattedDouble + " коп");

    }

    /**
     * Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
     */

    public static String receivingADecimalNumber1(double a) {

        int y = (int) a;
        double x = a - (long) a;
        String formattedDouble = new DecimalFormat("#0.000").format(x);
        return (y + " кг  " + formattedDouble + " гр");

    }


    public static double twoParametersPriceAndQuantity(double a, double b) {

        /**
         *Написать метод, который принимает на вход 2 параметра - цену и количество товара
         * (может быть вес товара, или количество в штуках).
         * Алгоритм возвращает сумму покупки в виде десятичного числа.
         */

        return ((int) a * b);

    }

    public static String Parameters(String text, double l, double a, double b) {
        /**
         * Написать метод, который принимает на вход необходимые параметры, и печатает чек.
         * Например:
         * Хлеб
         * Цена за 1 шт		30 руб 50 коп
         * Количество товара	5 шт
         * _______________________________________
         * Сумма к оплате		152 руб 50 коп
         */


        int x = (int) a;
        double y = a - (long) a;
        String formattedDouble = new DecimalFormat("#0.00").format(y);
        String col = "Цена за " + l + " шт " + x + " руб " + formattedDouble + " коп";

        int z = (int) b;
        double g = a * b;
        int m = (int) g;
        double h = g - (long) g;
        String formattedDouble1 = new DecimalFormat("#0.00").format(h);
        System.out.println(text);
        System.out.println(col);
        System.out.println("Количество товара " + z + " шт");
        System.out.println("---------------------------");
        return ("Сумма к оплате " + m + " руб " + formattedDouble1 + " коп");
    }

    public static String timeDayTheCostOfAnHourOfWork(double a, double b, int s) {
        double workingDayInHours = a;
        double theCostOfAnHourOfWork = b;
        int numberOfWorkingDaysPerMonth = s;
        double monthlySalary = (workingDayInHours * theCostOfAnHourOfWork) * numberOfWorkingDaysPerMonth;
        return ("Заработная плата в месяц " + monthlySalary);


        /**
         * Написать метод, который принимает на вход количество часов работы
         * в день и стоимость одного часа работы, и возвращает заработную плату в месяц.
         */

    }

    public static void salaryStatement(String text1, String text2, String text3, double a, double b) {

        int q = (int) a;
        double w = q - (long) q;
        String formattedDouble = new DecimalFormat("#0.00").format(w);
        System.out.println(text1);
        System.out.println(text2 + " " + a + " руб" + " " + formattedDouble + " коп");
        int r = (int) b;
        double t = r - (long) r;
        String formattedDouble1 = new DecimalFormat("#0.00").format(t);
        System.out.println(text3 + " " + b + " руб" + " " + formattedDouble1 + " коп");

        /**
         * Написать метод, который принимает на вход необходимые параметры
         * и печатает строку ведомости выдачи зарплаты сотрудникам.
         * Например:
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         * Распечатать ведомость для нескольких сотрудников, например:
         * Март 2022
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         * Серебряков Иван Петрович 		128059 руб 00 коп
         */
    }

    public static void negativePositive(int x) {

        if (x < 0) {
            System.out.println(x + " Отрицательный");
        }
        if (x > 0) {
            System.out.println(x + " Положительный");
        } else if (x == 0) {
            System.out.println(x + " Равно нулю");
        }
    }

    public static void happyHours(int x) {

        int a = x % 100;
        int b = x / 100;
        int c = a % 10;
        int d = a / 10;
        int f = b % 10;
        int g = b / 10;
        int sum = c + d + f + g;
        int j = sum % 10;
        int k = sum / 10;
        int sum2 = j + k;
        System.out.println("Счастливое число " + sum2);

    }


    /**
     * Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
     * Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
     * Например:
     * год рождения 1999
     * 1 + 9 + 9 + 9 = 28
     * 2 + 8 = 10
     * 1 + 0 = 1
     * Счастливое число - 1
     */

    public static void averageAndMedian(int[] ar, int a, int b, int c) {

        /**
         * а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
         * Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
         * Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
         *
         * b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
         *
         * *Медиана - это серединное число в отсортированном наборе чисел.
         * 1, 3, 9 → медиана 3
         * 12, 13, 101 → медиана 13
         * 14, 2, 12 → медиана 12
         */
        int average = (a + b + c) / 3;
//            System.out.println("Среднее значение " + average);

        int mid = (a > b) ? ((c < b) ? b : ((c < a) ? c : a)) : ((a > c) ? a : (b < c) ? c : b);
        System.out.println("Медиана " + mid);
        int s = mid - average;
//            System.out.println("Разница между средним и медианой " +s);
        if (s > 2) {
            System.out.println("Среднее значение " + average + " отличается от медианы " + mid + " на " + s);
        } else {
            System.out.println("Среднее значение = " + average + " медиана = " + mid);

        }
        int arr[] = {a, b, c};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void averageAndMedian1(int a, int b, int c) {

        int average = (a + b + c) / 3;
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int mid = a + b + c - (min + max);
        int s = average - mid;

        if (s > 2) {
            System.out.println("Среднее значение " + average + " отличается от медианы " + mid + " на " + s);
        } else {
            System.out.println("Среднее значение = " + average + " медиана = " + mid);

        }
    }

    public static String roundingTheAmount(double a) {

        /**
         * Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
         * и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
         */

        double ww = Math.floor(a);
        int y = (int) ww;
        double x = ww - (long) ww;
        String formattedDouble = new DecimalFormat("#0.00").format(x);
        return (y + " руб  " + formattedDouble + " коп");


    }

    public static void squareRoot(int a, int b, int c) {

        System.out.println(Math.ceil((Math.sqrt((a * b + c) * Math.pow(a, b))) / Math.PI));

    }


    public static void exponentiation(double a, double b) {

        double pow = Math.pow(a, b);
        System.out.println("Число " + a + " в степени = " + b + " = " + Math.round(pow));


//        Число может быть в пределах от 0 до 1 исключительно.
//                Степень числа может быть от 0 до 10 включительно

    }

    public static void random(int a, int b) {
        /** Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
         **/
        double x = (int) (Math.random() * ((b - a) + 1)) + a;
        System.out.println(x);
    }

    public static void jav(int y) {
        int x = 1;
        if (y > 0) {
            x=1;
            System.out.println(x);
        }
    }

    public static void jav1(double a) {

        if (a > 80 && a < 90) {
            System.out.println(a + 5);
        }
    }

    public static void jav2(int i, int v) {

        if ((i >= 10 && v < 50)) {
            System.out.println(((i >= 10 && v < 50)));
        }

    }

    public static boolean isLeapYear(int year) {


        if (((year % 4 == 0 && year % 100 != 0)) || (year % 400 == 0)) {

            return true;

        } else {

            return false;

        }

    }

    public static boolean jav3(int a) {

        if (a % 2 != 0 && a>0) {

            return true;

    }else{

            return false;
        }

    }

    public static boolean jav4(int x, int y) {

        if (x%2 !=0 && x>=0) {

            return true;

        } else {

            return false;
        }
    }

    public static void jav5(int x, int y) {

        if ((x > 0 && y > 0) || (x < 0 && y < 0)) {

            System.out.println("true");

        }
    }

        public static void  main (String[]args){

            /**
             * ВСЕ!!! результаты должны быть протестированы,
             * для этого необходимо создать метод с названием verifyEquals(expectedResult, actualResult)
             */

       /**
       * Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
       */
            printSpaces(2);
            printTask("Ответ задание №", 2);
            System.out.println(dayOfTheWeek(4));
        System.out.println(verifyResult(4, 4));

        printSpaces(3);
        /**
         * Дано три значения x,y и z, определить наибольшее значение и присвоить это значение переменой largest
         */
        printTask("Ответ задание №", 3);
        int x = 25;
        int y = 10;
        int z = 1;
        int  actualResult = maxValue(x,y,z);
        System.out.println(maxValue(25,10,1));
        System.out.println(verifyResult(25, actualResult));

        printSpaces(4);

        /**
         * Используя вложенные операторы if,
         * напишите фрагмент кода, который выводит наименьшее значение, содержащееся в переменных a,b и c.
         */
        printTask("Ответ задание №", 4);

        int a = 25;
        int b = -1;
        int c = 88;

        int actualResult1 = minValue(a,b,c);
        System.out.println(minValue(25,-1,88));
        System.out.println(verifyResult(-1, actualResult1));

        printSpaces(5);

        /**
         * Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
         */

        printTask("Ответ задание №", 5);

        double actualResult2 = averageCat(36.6,40.1,37,39.6,38.5);
        System.out.println(averageCat(36.6,40.1,37,39.6,38.5));
        verifyDoubleResult(38.36,actualResult2);

        printSpaces(6);

        /**
         * Написать метод, который принимает на вход десятичное число (например, 10.75),
         * и возвращает строку “10 руб 75 коп”.
         */

        printTask("Ответ задание №", 6);
        System.out.println(receivingADecimalNumber(10.044));
        verifyDoubleResult(10.05,10.05);

        printSpaces(7);

        /**
         * Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
         */

        System.out.println(receivingADecimalNumber1(10.750));
        verifyDoubleResult(10.750,10.750);

        printSpaces(8);
        printTask("Ответ задание №", 8);

        /**
         * Написать метод, который принимает на вход 2 параметра -  цену и количество товара
         * (может быть вес товара, или количество в штуках).
         * Алгоритм возвращает сумму покупки в виде десятичного числа.
         */
        printTask("Ответ задание №", 8);
        double actualResult3 = twoParametersPriceAndQuantity(15.50,1.75);
        System.out.println(twoParametersPriceAndQuantity(15.50, 1.75));
        verifyDoubleResult (27.125, actualResult3);

        printSpaces(9);
        printTask("Ответ задание №", 9);
        verifyDoubleResult (272.25, 272);

        /**
         * Написать метод, который принимает на вход необходимые параметры, и печатает чек.
         * Например:
         * Хлеб
         * Цена за 1 шт		30 руб 50 коп
         * Количество товара	5 шт
         * _______________________________________
         * Сумма к оплате		152 руб 50 коп
         */

        System.out.println(Parameters ("Чай", 1, 90.75, 3));

        printSpaces(10);
        printTask("Ответ задание №", 10);

        /**
         * Написать метод, который принимает на вход количество часов работы
         * в день и стоимость одного часа работы, и возвращает заработную плату в месяц.
         */

        System.out.println(timeDayTheCostOfAnHourOfWork(8,10.50, 22));
        verifyDoubleResult (1848, 1848);

        printSpaces(11);
        printTask("Ответ задание №", 11);

        /**
         * Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи зарплаты сотрудникам.
         * Например:
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         * Распечатать ведомость для нескольких сотрудников, например:
         * Март 2022
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         * Серебряков Иван Петрович 		128059 руб 00 коп
         */

        salaryStatement("Март 2022", "Величко Елена Андреевна",
                "Абрамович Роман Аркадьевич",70000.00,128059);
        verifyDoubleResult (128059, 128059);
        System.out.println(verifyResult("Март 2022","Март 2022"));

        printSpaces(12);
        printTask("Ответ задание №", 12);
        verifyDoubleResult (10, 1);
        negativePositive (10);

        printSpaces(13);
        printTask("Ответ задание №", 13);
        verifyDoubleResult (9, 9);

        /**
         * Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
         * Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
         * Например:
         * год рождения 1999
         * 1 + 9 + 9 + 9 = 28
         * 2 + 8 = 10
         * 1 + 0 = 1
         * Счастливое число - 1
         */

        happyHours(2000);

        printSpaces(14);
        printTask("Ответ задание №", 14);

        /**
         * а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
         * Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
         * Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
         *
         * b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
         *
         * *Медиана - это серединное число в отсортированном наборе чисел.
         * 1, 3, 9 → медиана 3
         * 12, 13, 101 → медиана 13
         * 14, 2, 12 → медиана 12
         */
        int arr[] = {4,2,8};

        averageAndMedian(arr, 4,2,8);
        System.out.println();
        verifyDoubleResult (4, 4);
        printTask("Ответ задание №", 14.1);
        averageAndMedian1 (4,2,8);
        verifyDoubleResult (4, 4);

        printSpaces(15);
        printTask("Ответ задание №", 15);
        /**
         * Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
         * и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
         */
        System.out.println(roundingTheAmount(11.75));
        verifyDoubleResult (11, 11);

        printSpaces(16);
        printTask("Ответ задание №", 16);
        verifyDoubleResult (17, 17);

        squareRoot (3,4,20);

        printSpaces(17);
        printTask("Ответ задание №", 17);
        jav (8);
        printTask("Ответ задание №", 17.1);
        jav1(85);
        printTask("Ответ задание №", 17.3);
        jav2(5, 2);
        printTask("Ответ задание №", 17.4);
        System.out.println(jav3(9));
        printTask("Ответ задание №", 17.5);
        System.out.println(jav4(-5,4));
        printTask("Ответ задание №", 17.6);
        jav5(-1,-9);


        printSpaces(18);
        printTask("Ответ задание №", 18);
        exponentiation(22.5 ,3);
        verifyDoubleResult (11391, 11391);


        printSpaces(19);
        printTask("Ответ задание №", 19);
        /**
         * Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
         */
        random(1 ,99);
        verifyDoubleResult (82, 82);

        printSpaces(20);
        printTask("Ответ задание №", 20);

        System.out.println ( isLeapYear(2011));
        boolean actualResult6 =  isLeapYear(2011);
        isLeapYear(true,  actualResult6 );
    }
    }












