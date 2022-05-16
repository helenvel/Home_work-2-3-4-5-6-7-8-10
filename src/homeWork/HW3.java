package homeWork;

public class HW3 {
    public static void printIntLine() {
        System.out.print(" ----------------------- ");
    }
    public static void printEmptyLine() {
        System.out.println();
    }

    public static void print(int number) {
        System.out.print(number);
    }

    public static void printTaskNumber(int num) {
        printIntLine();
        print(num);
        printIntLine();
        printEmptyLine();
    }
    public static void printSpaces () {
        printIntLine();
        printEmptyLine();

    }
        public static void main (String [] args) {

            printTaskNumber(1);
        /**
         * Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
         * Диапазон -128 … 127
         */

        byte a = 127;
        byte b = -128;
        System.out.println  (a);
        System.out.println  (b);

            printTaskNumber(2);

        /**
         * Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.
         * Здесь будет ошибка, так как выходит число за диапазон -32,768 … 32,767
         */
        int x = 1;
        x++;
        short s = -6000;
        short t = 6000;
        System.out.println  (s);
        System.out.println  (t);

            printTaskNumber(3);
        /**
         * Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         * Затем присвоить максимально возможное значение этого типа. Распечатать оба значения в виде таблицы:
         * Диапазон -2,147,483,648 … 2,147,483,647
         */
        int i = -2147483648;
        int i1 = 2147483647;
        System.out.println ("______________________________");
        System.out.println ("|" + "int min" + "|" + "Значение" + "|" + i + "|");
        System.out.println ("------------------------------");
        System.out.println ("|" + "int max" + "|" + "Значение" + "|" + i1 + " |");
        System.out.println ("------------------------------");

            printTaskNumber(4);

        /**
         * Создать переменную phoneNumber и присвоить ей значение номера телефона с кодом страны и города
         * (можно ненастоящий номер телефона, например, 18009998877)
         */
        long phoneNumber = 79172118377L;
        System.out.println  (phoneNumber);

            printTaskNumber(5);
        /**
         * Создать переменную f типа float и присвоить ей значение 100.101101.
         * Создать переменную d типа double и присвоить ей значение 1000.101101.
         */
        float f = 100.101101F;
        double d = 1000.101101;
        System.out.println ("____________________________________");
        System.out.println  ( "|" + "float f = 100.101101" + "  |" + f + " |");
        System.out.println ("------------------------------------");
        System.out.println  ( "|" + "double d = 1000.101101" + "|" + d + "|");
        System.out.println ("------------------------------------");


            printTaskNumber(6);

        /**
         * a) Создать переменную типа Double с именем dd
         * и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         */
        System.out.println  ("*** a ***");
        double dd = 10.09999 + 20.099999;
        System.out.println (dd);

        /**
         * b) Создать переменную типа Float с именем ff  и инициализировать
         * её результатом суммы чисел 10.09999 и 20.099999.
         */
        System.out.println  ("*** b ***");
        float ff = 10.09999F + 20.099999F;
        System.out.println (ff);
        System.out.println ("______________________________________________________");
        System.out.println  ( "|" + "double dd = 10.09999 + 20.099999 " + "|" + dd + "|");
        System.out.println ("------------------------------------------------------");
        System.out.println  ( "|" + "float ff = 10.09999 + 20.099999" + "  |" + ff + "          |");
        System.out.println ("------------------------------------------------------");

            printTaskNumber(7);

        /**
         * Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)
         */
        double result = 10/3d;
        System.out.println  (result);

            printTaskNumber(8);

        /**
         * Создать переменные sum, product, quotient и reminder, и  присвоить им значения вычислений переменных f и d
         * f 100.101101
         * d 1000.101101
         */
        double sum = f+d;
        double product = f*d;
        double quotient = f/d;
        double reminder = f%d;
        System.out.println (sum + "\n\n" + product + "\n\n" + quotient + "\n\n" + reminder );

            printTaskNumber(9);

        /** Распечатать слово HELLO точками
         *
         */

       System.out.println ("." + "\t" + "." + "\t" + "....." + "\t" + "." + "\t\t " + "." + "\t\t" + ".....");
       System.out.println ("." + "\t" + "." + "\t" + "."  + "\t\t" + "." + "\t\t" + " ." + "\t\t" + "." + "\t" + ".");
       System.out.println ("....." + "\t" + "....." + "\t" + "." + "\t\t" + " ." + "\t\t" + "." + "\t" + ".");
       System.out.println ("." + "\t" + "." + "\t" + "."  + "\t\t" + "." + "\t\t" + " ." + "\t\t" + "." + "\t" + ".");
       System.out.println ("." + "\t" + "." + "\t" + "....." + "\t" + "....." + "\t " + "....." + "\t" + ".....");

            printTaskNumber(10);

        /**
         * Создать переменные подходящего ссылочного типа данных(выбирать минимально достаточный диапазон значений):
         * t1 = 0;
         * t2 = 150;
         * t3 = -120;
         * t4 = - 505.505;
         * t5 = 100100;
         * t6 = 100010001000;
         * t7 = 2.66666666666666;
         * t8 = - 1000000.001;
         * t9 = 1010;
         */

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = - 505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;

        System.out.println (t1 + "\n" + t2 + "\n" + t3 + "\n" + t4 + "\n" + t5
                + "\n" + t6 + "\n" + t7 + "\n" + t8 + "\n" + t9);

            printTaskNumber(11);

        int  b1 = Byte.SIZE;
        byte b2 = Byte.MIN_VALUE;
        byte b3 = Byte.MAX_VALUE;

        int   s1 = Short.SIZE;
        short s2 = Short.MIN_VALUE;
        short s3 = Short.MAX_VALUE;

        int in1 = Integer.SIZE;
        int in2 = Integer.MIN_VALUE;
        int in3 = Integer.MAX_VALUE;

        int  l1 = Long.SIZE;
        long l2 = Long.MIN_VALUE;
        long l3 = Long.MAX_VALUE;

        int   f1 = Float.SIZE;
        float f2 = Float.MIN_VALUE;
        float f3 = Float.MAX_VALUE;

        int    d1 = Double.SIZE;
        double d2 = Double.MIN_VALUE;
        double d3 = Double.MAX_VALUE;

        System.out.println ( "--------------------------------------------------------------------");
        System.out.println ( "|" + "Type   "+ "|" +"Size in bits" + " |"
                + "min" + "                  |" + "max" + "                   |");
        System.out.println ( "--------------------------------------------------------------------");
        System.out.println ( "|" + "byte" + "   |" + b1 + "\t" + "          |"
                + b2 + "\t" +"                |" + b3 + "                   |");
        System.out.println ( "--------------------------------------------------------------------");
        System.out.println ( "|" + "short" + "  |" +s1 + "\t" + "          |"
                + s2 + "\t" + "            |" + s3 + "                 |");
        System.out.println ( "--------------------------------------------------------------------");
        System.out.println ( "|" + "int  " + "  |" +in1 + "\t" + "          |"
                + in2 + "\t" + "        |" + in3 + "            |");
        System.out.println ( "--------------------------------------------------------------------");
        System.out.println ( "|" + "long  " + " |" +l1 + "\t" + "          |" + l2 + "\t" + "|" + l3 + "   |");
        System.out.println ( "--------------------------------------------------------------------");
        System.out.println ( "|" + "float  " + "|" +f1 + "\t" + "          |"
                + f2 + "\t" + "            |" + f3 + "          |");
        System.out.println ( "--------------------------------------------------------------------");
        System.out.println ( "|" + "double " + "|" +d1 + "\t" + "          |" + d2 + "\t" + "            |" + d3 + "|");
        System.out.println ( "--------------------------------------------------------------------");

            printTaskNumber(12);
        /**
         * Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
         * сравнить 2 переменные друг с другом с помощью метода .equal. Вывести результат сравнения на печать в виде выражения:
         * “Если num1 = num2, то результат сравнения методом .equal = …”
         * Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
         * “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */
        Integer num1 = 10;
        Integer num2 = 10;
        boolean equals = num1.equals(num2);
        System.out.println (equals);
        System.out.println ("Если num1 = num2 = " + equals);

            printSpaces ();


        Integer num3 = 7;
        Integer num4 = 5;
        boolean equals1 = num3.equals(num4);
        System.out.println ("Если num3 != num4 = " + equals1);

            printTaskNumber(13);

        /**
         * Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
         * а) одинаковыми значениями
         * b) number1 < number2
         * c) number1 > number2
         * сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
         * и вывести результаты сравнения на печать в виде выражений:
         * “Если number1 = number2, то результат сравнения методом … = …”
         * “Если number1 < number2, то результат сравнения методом … = …”
         * “Если number1 > number2, то результат сравнения методом … = …”
         */

        int number1 = 5;
        int number2 = 5;
        int compare1 = Integer.compare  (number1, number2);
        System.out.println  ("Если number1 = number2 = " + compare1);
            printSpaces ();
        int number3 = 5;
        int number4 = 10;
        int compare2 = Integer.compare  (number3, number4);
        System.out.println  ("Если number3 = number4 = " + compare2);
            printSpaces ();
        int number5 = 20;
        int number6 = 8;
        int compare3 = Integer.compare  (number5, number6);
        System.out.println  ("Если number3 = number4 = " + compare3);


            printTaskNumber(14);

        /**
         * Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int
         */
        Float w = 234.9999F;
        w.intValue ();
        System.out.println  (w.intValue ());

            printTaskNumber(15);

        /**
         * С помощью метода sum() класса Double посчитать сумму двух переменных типа double.
         */
        double m1 = 5;
        double m2 = 10;
        double sum1 = Double.sum (m1, m2);
        System.out.println (sum1);

            printTaskNumber(16);

        /**
         * С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
         */
        Float ff1 = 12356F;
        Float ff2 = 13389F;
        System.out.println  (Integer.sum (ff1.intValue(), ff2.intValue ()));

            printTaskNumber(17);

        /**
         * Создать 2 переменные типа Short:
         * short1 = 12000
         * short2 = 12300
         * Распечатать фразу:
         * “12000 - 12300 = -300”
         * где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
         * Присвоить переменной short1 значение 12500, вывести фразу:
         * “12500 - 12300 = 200”
         * где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */
       Short short1 = 12000;
       Short short2 = 12300;
       System.out.println  ("12000 - 12300 = " + Short.valueOf(short1).compareTo(Short.valueOf(short2)));

            printTaskNumber(18);

            Short short3 = 12500;

       System.out.println  ("12500 - 12300 = " + Short.valueOf(short3).compareTo(Short.valueOf(short2)));

       System.out.println  (Short.compare (short3, short2));

            printTaskNumber(19);

        /**
         * Создать переменные:
         * String str1 = "123.56";
         * String str2 = "123.55";
         * Double doub1 = 123.56;
         * Double doub2 = 123.55;
         * Распечатать результат doub1 - doub2
         * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         */
          String str1 = "123.56";
          String str2 = "-123.55";
          Double doub1 = 123.56;
          Double doub2 = - 123.55;
          System.out.println  (Double.sum (doub1, doub2));

            printSpaces ();

          System.out.println  (doub1- doub2);

            printSpaces ();

          Double.valueOf (str1);
          Double.valueOf (str2);
          System.out.println (Double.valueOf (str1));
          System.out.println (Double.valueOf (str2));
            printSpaces ();
          System.out.println (Double.sum (Double.valueOf (str1), Double.valueOf (str2)));

            printTaskNumber(20);

        /**
         * Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
         * (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение, затем минимальное значение.
         * Посчитать и распечатать среднее значение, округленное с помощью метода класса Math. Распечатать результат среднего значения температуры тела кота.
         */
        double cat;
        cat = 36.6;
        cat = 40.0;
        double catS = cat/2;
        Math.round (catS);
        System.out.println (catS);

            printTaskNumber(21);

        /**
         * Создать переменную n типа Number, присвоить ей максимально возможное значение.
         * Присвоить n значение 10,
         * затем присвоить n значение 10.999999999.
         * Распечатать результаты в виде выражения:
         * “Переменная n может приниматьт значения:
         *  n =  …
         *  n =  …
         *  n =  …
         *  Это возможно, потому что …”
         */

        Number n;
        n =  9223372036854775807L;
        System.out.println (n);
        n = 10.999999999;
        System.out.println (n);
        n = 10;
        System.out.println (n);

            printTaskNumber(22);

        /**
         * Создать переменную Integer numberInteger = 100.
         * Доказать, что numberInteger имеет тип Integer,
         * а numberInteger.toString() имеет тип String.
         */
        Integer numberInteger = 100;
        System.out.println (numberInteger.equals(numberInteger));
        System.out.println (numberInteger.toString() + numberInteger );

            printTaskNumber(23);


        /**
         * Вывести на экран следующие выражения, используя для печати только переменные:
         * “36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту должно быть вычислено по формуле
         * “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
         */

        double far = 36.6 * 9/5 + 32;
        System.out.println ("36.6 градусов по Цельсию  = " + far + " градусов по Фаренгейту");

            printSpaces ();

        double lbs = 50 * 2.204623;
        double kg = 50 * 0.45359237;

        System.out.println  ("50 kilogram = "+ lbs + "lbs" + ", 50 lb = " + kg + "kg");













































































    }
}
