package homeWork;

import java.util.Random;

public class HW7 {

   public static double Task18(int[] catsAges) {
      /**
       * Написать метод, который принимает на вход массив int, и возвращает среднее значение.
       * Проверить работу метода тестом, если параметр - массив catsAges
       */
      int sum = 0;
      double a = 0.0;
      for (int i = 0; i < catsAges.length; i++) {
         sum += catsAges[i];
         a = (double) (sum) / catsAges.length;

      }
      return a;
   }

   public static double Task21(int[] mass) {

      /**
       * Создать метод, который принимает на вход массив int,
       * и возвращает минимальное значение, максимальное значение и среднее значение всех чисел массива.
       * Проверить работу метода на массиве из задания 20.
       */
      int sum = 0;
      double a = mass[0];
//      double min = mass[0];
//      double max = mass[0];
      for (int i = 0; i < mass.length; i++) {
         sum += mass[i];
         a = (double) (sum) / mass.length;


         if (mass[i] < a) {
            a = mass[i];
         }
            if (mass[i] > a) {
               a = mass[i];
            }
         return a;
         }

      return a;
   }






   public static void Test(double[] expectedResult, double[] actualResult) {


      if (expectedResult == actualResult) {

         System.out.println("Pass");
      } else {

         System.out.println("Fail");
      }

   }

   public static void main(String[] args) {
      HW5.printTask("", 1);

      /**
       * Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).
       */
      String[] catsNames;

      catsNames = new String[8];
      catsNames[0] = "Васька";
      catsNames[1] = "Хулиган";
      catsNames[2] = "Малыш";
      catsNames[3] = "Git";
      catsNames[4] = "Цезарь";
      catsNames[5] = "Пушок";
      catsNames[6] = "Бантик";
      catsNames[7] = "Happy";

      for (int i = 0; i < 8; i++) {
         System.out.println("[" + i + "] " + catsNames[i]);
      }

      HW5.printTask("", 2);

      /**
       * В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
       * а значение элемента с индексом 1 на “Черныш”.
       */
      String[] catsNames2;
      catsNames2 = new String[8];
      catsNames2[0] = "Васька";
      catsNames2[1] = "Черныш";
      catsNames2[2] = "Рыжик";
      catsNames2[3] = "Git";
      catsNames2[4] = "Рыжик";
      catsNames2[5] = "Пушок";
      catsNames2[6] = "Бантик";
      catsNames2[7] = "Happy";

      for (int i = 0; i < 8; i++) {
         System.out.println("[" + i + "] " + catsNames2[i]);
      }

      HW5.printTask("", 3);

      /**
       * Создать массив catsColors и заполнить его значениями.
       */
      String[] catsColors;
      catsColors = new String[8];
      catsColors[0] = "Серый";
      catsColors[1] = "Черныш";
      catsColors[2] = "Серый";
      catsColors[3] = "Серый";
      catsColors[4] = "Рыжик";
      catsColors[5] = "Серый";
      catsColors[6] = "Рыжий";
      catsColors[7] = "Голубо-серый";

      for (int i = 0; i < 8; i++) {
         System.out.println("[" + i + "] " + catsColors[i]);
      }

      HW5.printTask("", 4);

      /**
       * Создать массив catsAges и заполнить его любыми значениями.
       */

      double[] catsAge;
      catsAge = new double[8];

      catsAge[0] = 1.5;
      catsAge[1] = 7;
      catsAge[2] = 8;
      catsAge[3] = 1;
      catsAge[4] = 15;
      catsAge[5] = 9;
      catsAge[6] = 0.5;
      catsAge[7] = 4;

      for (int i = 0; i < 8; i++) {
         System.out.println("[" + i + "] " + catsNames[i] + " " + catsAge[i]);
      }

      HW5.printTask("", 5);

      /**
       * Создать массив isCatRed и заполнить его соответствующими значениями
       */

      String[] isCatRed;
      isCatRed = new String[8];
      isCatRed[0] = "Серый";
      isCatRed[1] = "Черныш";
      isCatRed[2] = "Красный";
      isCatRed[3] = "Серый";
      isCatRed[4] = "Красный";
      isCatRed[5] = "Серый";
      isCatRed[6] = "Красный";
      isCatRed[7] = "Голубо-серый";

      for (int i = 0; i < 8; i++) {
         if (isCatRed[i].equals("Красный")) {
            System.out.println("[" + i + "] " + isCatRed[i] + " " + catsAge[i]);

         } else {
            System.out.println("false");

         }
      }
      HW5.printTask("", 6);

      /**
       * Распечатать для массивов catsNames и catsColors:
       * имя кота в коробке с номером 6
       * имена котов из коробок с четными индексами
       * имена котов из коробок, чьи индексы кратны 4
       * цвет котов из коробок с нечетными индексами
       * цвет котов из коробок, чьи индексы кратны 3
       */
      System.out.println(catsNames[6]);
      HW4.printSpaces();

      for (int i = 0; i < 8; i++) {
         if (i % 2 != 0) {
            System.out.println("[" + i + "] " + catsNames[i]);
         }
      }
      HW4.printSpaces();

      for (int i = 0; i < 8; i++) {
         if (i % 4 == 0) {
            System.out.println("[" + i + "] " + catsNames[i]);
         }
      }
      HW4.printSpaces();

      for (int i = 0; i < 8; i++) {
         if (i % 2 != 0) {
            System.out.println("[" + i + "] " + catsColors[i]);
         }
      }
      HW4.printSpaces();

      for (int i = 0; i < 8; i++) {
         if (i % 3 == 0) {
            System.out.println("[" + i + "] " + catsNames[i]);
         }
      }
      HW5.printTask("", 7);

      /**
       * Распечатать “Накорми кота!” для всех серых котов
       */
      for (int i = 0; i < 8; i++) {
         if (catsColors[i].equals("Серый")) {
            System.out.println("[" + i + "] " + catsColors[i] + " ---- " + "Накормить кота!");
         }
      }

      HW5.printTask("", 8);

      /**
       * Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
       */
      for (int i = 0; i < 8; i++) {
         if (catsAge[i] < 2) {
            System.out.println("[" + i + "] " + catsAge[i] + "----" + "Отнеси кота на прививку!");
         }
      }

      HW5.printTask("", 9);

      /**
       * Для кота в последней коробке распечатать имя, цвет, возраст
       */
      for (int i = 0; i < 8; i++) {
         if (i == 7) {
            System.out.println(catsNames2[i] + " " + catsColors[i] + " " + catsAge[i]);

         }
      }
      HW5.printTask("", 10);

      /**
       * Распечатать имена всех котов, чей возраст больше 2 лет
       */
      for (int i = 0; i < 8; i++) {
         if (catsAge[i] > 2) {
            System.out.println("[" + i + "] " + catsNames[i]);
         }
      }

      HW5.printTask("", 11);

      /**
       * Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true
       */

      for (int i = 0; i < 8; i++) {
         if (catsNames2[i].equals("Рыжик") && isCatRed[i].equals("Красный")) {

            System.out.println("[" + i + "] " + "Накормить кота!");
         }

      }

      HW5.printTask("", 12);

      /**
       * Распечатать средний возраст котов из массива catsAges
       */

      System.out.println(catsAge[0] + catsAge[1] + catsAge[2] + catsAge[3] + catsAge[4] + catsAge[5] + catsAge[6] + catsAge[7] / 8);

      HW5.printTask("", 13);


      /**
       * Распечатать возраст самого молодого кота
       */
      double min = catsAge[0];

      for (int i = 0; i < 8; i++) {
         if (catsAge[i] < min)
            min = catsAge[i];
      }
      System.out.println(min);


      HW5.printTask("", 14);

      /**
       * Распечатать возраст самого старого кота
       */

      double max = catsAge[0];
      for (int i = 0; i < 8; i++) {
         if (catsAge[i] > max)
            max = catsAge[i];
      }
      System.out.println(max);


      HW5.printTask("", 15);

      /**
       *Распечатать количество серых котов
       */
      int counter = 0;
      for (int i = 0; i < 8; i++) {
         if (catsColors[i].equals("Серый")) {
            counter++;
         }
      }
      System.out.println(counter);

      HW5.printTask("", 16);

      /**
       * Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет
       */

      for (int i = 0; i < 8; i++) {
         if (i % 2 == 0 && catsAge[i] < 3) {

            System.out.println("[" + i + "] " + catsNames2[i]);
         }
      }

         HW5.printTask("", 17);

          /**
           * Создать массив четных положительных чисел,
           * значения которых не больше 10. (заполняем значения с помощью цикла for)
           */
       counter = 0;

       for (int i=0; i<11; i++ ) {
          if (i%2==0) {
             counter ++;
          }
       }
       int [] array=new int[counter];

       for (int i=0, j=0; i<array.length; i++, j+=2){
          array[i]=j;
          System.out.println(array[i] + " ");
       }



      HW5.printTask("", 18);

      /**
       * Написать метод, который принимает на вход массив int, и возвращает среднее значение.
       * Проверить работу метода тестом, если параметр - массив catsAges
       */

      System.out.println(Task18(new int[]{4,5,7,10,7,9}));

      Test(catsAge,catsAge);

      HW5.printTask("", 19);

      /**
       *  Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900
       */

      short[] nums;
      nums= new short[900];

      for (short i = -1000; i<900; i++) {

            if (i%2!= 0) {
               System.out.println(i);

         }
      }
      HW5.printTask("", 20);

      /**
       *Создать массив из 10 случайных положительных целых чисел
       */

      Random rand = new Random();

      int mass[] = new int [10];

      for (int i=0; i<10; i++) {
         mass[i] = rand.nextInt(30);
         System.out.println(mass[i]);
      }

      HW5.printTask("", 21);

      /**
       * Создать метод, который принимает на вход массив int,
       * и возвращает минимальное значение, максимальное значение и среднее значение всех чисел массива.
       * Проверить работу метода на массиве из задания 20.
       */


      System.out.println( Task21(new int[]{3,6,2,7,4}));






   }
}










