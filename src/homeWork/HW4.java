package homeWork;


public class HW4 {

    public static void printIntLine() {
        System.out.print(" --------------------------------- ");
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

    public static void printSpaces() {
        printIntLine();
        printEmptyLine();
    }


    public static void printTask(String text, int num ) {
        String text1 = "Ответ задание №  ";
        System.out.println(text1 + num + " ");


    }

    public static void printApple( int a, int b) {
        int a1 = 42;
        String text1 = "ка";
        System.out.println(a1 + text1);
        int b2 = 55;
        String text2 = "к";
        System.out.println(b2 + text2);


    }
    public static void printM(String text, int k , int l, String text1) {
    int dev = k/l;
    int remainder = dev % 2;
    String tex = "Результат деления k на l = ";
        String tex2 = "а остаток от деления  =  ";

        System.out.print("Результат деления k на l = ");
        System.out.print(dev + " ");
        System.out.print("а остаток от деления  =  ");
        System.out.print(remainder);

        printEmptyLine();

    }


    public static void main(String[] args) {

        printTaskNumber(3);

        /**
         * Записать в виде кода следующие логические выражения:
         * 	1) (2 = 2) И (7 = 7);
         */

        int a = 2;
        int b = 2;
        int c = 7;
        int d = 7;
        printTask("Ответ №", 3);
        System.out.print(a == b && c == d);
        printEmptyLine();
        printIntLine();
        printEmptyLine();


        /**
         * 2)Не(15 < 3);
         */


        int f = 15;
        int g = 3;
        System.out.println(!(15 < 3));

        printIntLine();
        printEmptyLine();

        /**
         * 3) ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
         */
        String treePine = "Cосна";
        String treeOak = "ДУб";
        String treeCherry = "Вишня";
        String treeMaple = "Клён";

        // ("Сосна" == "Дуб") || ("Вишня" == "Клён"). Ответ: flase различные породы дерева

        printIntLine();
        printEmptyLine();

        /**
         * 4) Не("Сосна" = "Дуб");
         */
        String treePine1 = "Сосна";
        String treeOak1 = "Дуб";
        System.out.println(!(treePine1 == treeOak1));

        printIntLine();
        printEmptyLine();

        /**
         * 5) (Не(15 < 3)) И (10 > 20);
         */
        System.out.println(!(15 < 3) && !(10 > 20));

        printIntLine();
        printEmptyLine();

        /**
         * 6) ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
         */
        String eyes = "Глаза даны, чтобы видеть";
        String level = "Под третьим этажом находится второй этаж";

        if (eyes == "Глаза даны, чтобы видеть" && level == "Под третьим этажом находится второй этаж") {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // (eyes) && (level); Ответ: true

        printIntLine();
        printEmptyLine();

        /**
         * 7) (6/2 = 3) ИЛИ (7*5 = 20).
         */
        int dev = 6 / 2;

        System.out.println((6 / 2 == 3) || (7 * 5 == 20));

        printIntLine();
        printEmptyLine();

        printTaskNumber(4);

        /**
         * ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
         */
        String min = "В минуте !70 секунд";
        String min2 = "Работающие часы показывают время";
        //("В минуте 70 секунд") || ("Работающие часы показывают время") Ответ: true

        /**
         * 2) !(28 > 7) И !(300/5 = 60);
         */
        System.out.println(!(28 > 7) && !(300 / 5 == 60));

        printIntLine();
        printEmptyLine();

        /**
         * 3) ("Телевизор - электрический прибор") И ("Стекло - дерево");
         */

        String st = "Телевизор - электрический прибор";
        String tree = "Стекло - дерево";
        //("Телевизор - электрический прибор") && ("Стекло - дерево"); Ответ: false

        printIntLine();
        printEmptyLine();

        /**
         * 4) Не((300 < 100))  → ("Жажду можно утолить водой");
         */

        if (!(300 < 100)) {
            System.out.println("Жажду можно утолить водой");
        }
        printIntLine();
        printEmptyLine();

        /**
         * 5) (75 < 81) → (88 = 88).
         */
        int aa = 75;
        int bb = 81;
        if (aa < bb) {
            System.out.println(88 == 88);
        } else {
            System.out.println("\u001B[31m" + "Fail");
        }
        printIntLine();
        printEmptyLine();

        printTaskNumber(5);

        /**
         * 5) Записать в виде кода следующие выражения:
         * 	а) Андрей старше Светы. Наташа старше Светы.
         * б) На полке стоят учебники, а на столе лежат справочники.
         * в) БОльшая детей — девочки. Остальные - мальчики.
         */
        //	а) Андрей > Светы. Наташа < Светы.
        // б) На полке стоят учебники, а на столе лежат справочники.
        // в) БОльшая часть детей девочки. Остальные - мальчики.

        /**
         * 6)“Водительские права можно получить, только когда исполнится 16 лет.”
         * 7)”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
         * 8)“Если с другом ты, это хорошо, а когда наоборот - плохо”
         */

        printTaskNumber(9);
        /**
         * Записать выражения в виде условий if-else:
         * Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
         Иначе вчера был не четверг, а завтра - не воскресенье
         * Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
         * Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
         */

        /**
         * Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
         */
        int age = 18;
        int age1 = 32;

        if (age < age1) {
            System.out.println("ты взрослый");
        } else {
            System.out.println("ты ребенок");
        }
        printIntLine();
        printEmptyLine();

        /**
         * Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
         */
        String zz = "Если земля сухая";
        String zz1 = "значит, нет дождя.";

        if (zz == "Если земля сухая") {
            System.out.println(zz1);
        }

        String zz2 = "Если земля мокрая,";
        String zz3 = "то идет дождь.";

        if (zz2 == "Если земля мокрая,") {
            System.out.println(zz3);
        }

        printIntLine();
        printEmptyLine();

        /**
         *Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
         */
        String ss = "Если земля сухая";
        String ss1 = "значит, нет дождя.";

        if (ss == "Если земля сухая") {
            System.out.println(ss1);
        }

        String ss2 = "Если земля мокрая,";
        String ss3 = "то идет дождь.";
        String ss4 = "идет снег";

        if (ss2 == "Если земля мокрая,") {
            System.out.println(ss3);
        } else {
            System.out.println(ss4);
        }
        printIntLine();
        printEmptyLine();

        /**
         *  Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
         */
        String t = "Если на небе тучи";
        String t1 = "идет дождь";
        String t2 = "идет слепой дождь";

        if (t == "Если на небе тучи") {
            System.out.println(t1);
        } else {
            System.out.println(t2);
        }

        printIntLine();
        printEmptyLine();

        /**
         *  Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
         *  Иначе вчера был не четверг, а завтра - не воскресенье
         */
        String today = "Если сегодня суббота, значит, завтра";
        String tomorrow = "Воскресенье";
        String today1 = "Если сегодня пятница, значит, вчера был";
        String yesterday = "Четверг";

        if (today == "Если сегодня суббота, значит, завтра") {
            if (today1 == "Если сегодня пятница, значит, вчера был")
                System.out.println(tomorrow);
            System.out.println(yesterday);
        } else {
            System.out.println("вчера был не четверг, а завтра - не воскресенье");
        }
        printIntLine();
        printEmptyLine();

        /**
         * Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
         */

        String cancer = "Если на горе свистнул рак,";
        if (cancer == cancer) {
            System.out.println("прошла вечность");
        } else {
            System.out.println("ждите дальше");
        }

        printIntLine();
        printEmptyLine();

        /**
         * Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
         */
        String school = "Если тебе 18";
        String school1 = "ты закончил школу";
        if (school == "Если тебе 18" || school1 == "ты закончил школу") {
            System.out.println("то ты можешь не жить с родителям");
        } else {
            System.out.println("иначе живи с родителями");
        }

        printTaskNumber(10);
        /**
         * Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
         * Выведите результат работы алгоритма на печать.
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */

//        int h = 10;
//        if (h % 2 == 0) {
//            h = h * 2;
//        } else {
//            h = h * h;
//        }
//        System.out.println("n = " + h);

        printTaskNumber(11);

        /**
         * Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         *
         * Выведите результат работы алгоритма на печать.
         *
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */

        /**
         * Голосовать можно с 18 лет
         */

//        int ege1 = 18;
//        String ege2 = "Голосовать можно с 18 лет";
//
//        if (17 < ege1) {
//            System.out.println(ege2);
//        }
//        if (17 >= ege1) {
//            System.out.println("\u001B[31m" + "Fail");
//        }

        printIntLine();
        printEmptyLine();

        /**
         * Машину можно водить с 16 лет
         */

        String car1 = "Машину можно водить с 16 лет";
        int car2 = 16;


        if (15 < car2) {
            System.out.println(car1);
        }
        if (15 >= car2) {
            System.out.println("\u001B[31m" + "Fail");
        }

        printIntLine();
        printEmptyLine();
        /**
         * В школу можно идти с 5 лет
         */
        int school11 = 10;
        String school12 = "В школу можно идти с 5 лет";
        if (school11 > 4) {
            System.out.println(school12);
        }
        if (school11 <= 4) {
            System.out.println("\u001B[31m" + "Fail");
        }
        printIntLine();
        printEmptyLine();
        printTaskNumber(12);

        /**
         *    Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
         *         a)5 - выдать похвальную грамоту и перевести в следующий класс
         *         b)4 - перевести в следующий класс
         *         c)3 - дать задание на лето и перевести в следующий класс
         *         d)2 - вызвать родителей и оставить в текущем классе на второй год
         */
        int o = 5;
        int o1 = 4;
        int o2 = 3;
        int o3 = 2;

        if (o >= o1) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
            if (o1 == o1) {
                System.out.println("перевести в следующий класс");
                if (o2 >= o3) {
                    System.out.println("дать задание на лето и перевести в следующий класс");
                    if (o3 == o3) {
                        System.out.println("вызвать родителей и оставить в текущем классе на второй год");
                    }

                }
            }
        }

        printIntLine();
        printEmptyLine();
        printTaskNumber(13);

        /**
         * Напишите алгоритм программы, которая проверяет 2 числа.
         * Программа складывает числа, которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка.
         * Программа умножает числа, которые делятся на 2 без остатка, но если хотя бы одно число отрицательное,
         * программа умножает результат предыдущего действия на (-1).
         * Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
         */
        int m = 2;
        int p = 1;

        if (m % 3 == 0) {
            m = m + m;
            System.out.println(m);
        }
        if (m % 5 == 0) {
            m = m - m;
            System.out.println(m);
        }
        if (p % 2 == 0) {
            p = p * p;
            System.out.println(p);
        }

            if (p < 0) {
                p = p * -1;
                System.out.println(p);
            } else {
                System.out.println("error");
            }

            printIntLine();
            printEmptyLine();

            printTaskNumber(14);

            /**
             * Распечатать следующие выражения, используя метод и параметры:
             * Результат деления k на l = …, а остаток от деления  = …
             * Результат деления k на m = …, а остаток от деления  = …
             * Результат деления l на m = …, а остаток от деления  = …
             * Результат деления m на k = …, а остаток от деления  = …
             * И так далее все возможные варианты.
             * Сравнить код из HW2 с кодом из HW4. Что для вас легче?
             */


            printM("Результат деления k на l = ", 7, 2, "а остаток от деления  =");
            printM("Результат деления k на l = ", 15, 2, "а остаток от деления  =");

            printTaskNumber(16);
            /**
             * Выполнить задание 18 из HW2 с помощью метода и параметров:
             * Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока) печатались автоматически в зависимости от значений параметров.
             * Распечатать выражение с параметрами:
             * apple = 42, 55, 1
             * student = 42, 5, 2
             */
            printApple(55, 42);

            printEmptyLine();

            printTaskNumber(19);

            /**
             *Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
             * Тестовые данные - 2, 5, 0.
             */
            int h = 0;
            int expectedResult = 0;
            if (h % 2 == 0) {
                h = h * 2;
            } else {
                h = h * h;
            }
            System.out.println("h = " + h);

            if (expectedResult == 0) {
                System.out.println("\u001B[32m" + "Pass");
            } else {
                System.out.println("\u001B[31m" + "Fail");
            }

            printEmptyLine();

            printTaskNumber(20);

            /**
             * Напишите тест, который валидирует ваш код из задания №11.
             * Придумайте тестовые данные. Выведите результат проверки на печать.
             */

            int ege1 = 20;
            String ege2 = "Голосовать можно с 18 лет";
            int expectedResult1 = 20;

            if (17 < ege1) {
            } else {
                System.out.println("\u001B[31m" + "Fail");

            }

            if (expectedResult1 == ege1) {
                System.out.println("\u001B[32m" + "Голосовать можно с 18 лет");
            } else {
                System.out.println("\u001B[31m" + "Fail");
            }


            printEmptyLine();

            printTaskNumber(21);

            /**
             * Напишите алгоритм программы, которая проверяет число типа short на количество разрядов, и выводит результат проверки.
             * ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
             * Выведите результат проверки на печать.
             */

            short Digit = 888;
            int expectedResult2 = 22;

            if (Digit >= 99) {

            } else {
                System.out.println(Digit >= 999);
            }

            if (expectedResult2 == Digit) {
                System.out.println("“Это двузначное число.”");
            } else {
                System.out.println(" “Это трехзначное число.”");
            }
        }
    }









