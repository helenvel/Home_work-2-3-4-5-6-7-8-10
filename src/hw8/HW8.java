package hw8;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {

    public static int[] Task7(int a, int b, int c, int d, int f) {

        int[] array;
        array = new int[5];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        array[4] = f;


        for (int i = 0; i < array.length; i++) {

        }
        return array;
    }

    public static double[] Task8(double a, double b, double c, double d, double f) {

        double[] array;
        array = new double[5];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        array[4] = f;


        for (int i = 0; i < array.length; i++) {

        }
        return array;
    }

    public static String[] Task9(String a, String b, String c, String d, String f) {

        String[] array;
        array = new String[5];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;
        array[4] = f;


        for (int i = 0; i < array.length; i++) {

        }
        return array;
    }

    public static double[] Task10(int[] arr) {

        /**
         * Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив тех же чисел, умноженных на 2.5
         */

        double[] a = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i] * 2.5;

        }
        return a;
    }

    public static int Task11(int[] arr) {

        /**
         *Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает количество четных чисел в этом массиве
         */

        int[] a = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] % 2 == 0) {
                sum = sum+1;
            }
        }
        return sum;
    }


    public static int[] Task12(int[] arr) {

        /**
         *Написать метод, который принимает на вход массив целых положительных чисел,
         * и возвращает количество четных чисел в этом массиве
         */

        for(int i =0; i<arr.length; i++){
            if (arr[i]%2!=0) {
                System.out.println(arr[i]);

            }
        }
       return arr;
    }
    public static boolean[] Task13(int[] arr, int number) {

        /**
         * Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив значений true или false, если числа больше 10
         */

        boolean[] a = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            a[i]=(arr[i]>number);

        }
       return a;
    }

    public static String[] Task14(String[] arr) {
        /**
         * Написать метод, который принимает на вход массив слов,
         * и возвращает строку, состоящую из этих слов
         */
        for (int i = 0; i < arr.length; i++) {
        }
        return arr;
    }

    public static int Task15(int[] arr) {
        /**
         * Написать метод, который принимает массив целых чисел и считает сумму чисел во второй половине массива
         */
        int sumsecond=0;
        int n=0;
        for (int i=0; i<n; i++){
            if (i<n/2) {
                sumsecond += arr[i];
            }
        }
        return sumsecond;
    }

    public static void main (String [] args) {

         printTask("", 6);

         Integer a = 10;
         Double b = 2.2;
         String c = "Привет!";

         printIntLine();
         printEmptyLine();
         System.out.println("HW8" + "|" + " are Equals" + "|" + "HW8_1");
         printIntLine();
         printEmptyLine();
         System.out.println("|" + a + "     " + a + "       " + a.equals(HW8_1.a) + "  |");
         printIntLine();
         printEmptyLine();
         System.out.println("|" + b + "    " + b + "      " + b.equals(HW8_1.b) + "  |");
         printIntLine();
         printEmptyLine();
         System.out.println("|" + c + " " + c + " " + c.equals(HW8_1.c) + "  |");
         printIntLine();
         printEmptyLine();


         printTask("", 7);
         System.out.println(Arrays.toString(Task7(1,2,8,4,5)));
         printEmptyLine();

         printTask("", 8);
         System.out.println(Arrays.toString(Task8(1.4,2.4,-8.7,4,5.1)));

         printEmptyLine();
         printTask("", 9);
         System.out.println(Arrays.toString(Task9("Мир","Дружба","Жвачка","Елена","Величко")));

         printEmptyLine();
         printTask("", 10);
         System.out.println(Arrays.toString(Task10(new int[]{4,2,4})));

         printEmptyLine();
         printTask("", 11);
         System.out.println(Task11(new int[]{4,2,4,3,5,2,8,10,-2,-4}));

         printEmptyLine();
         printTask("", 12);
         Task12(new int[]{4,2,4,3,5,2,8,10,-2,-4});

        printEmptyLine();
        printTask("", 13);
        System.out.println(Arrays.toString(Task13(new int[]{10,7,9,4,20}, 10)));

        printEmptyLine();
        printTask("", 14);
        System.out.println(Arrays.toString(Task14(new String[]{"Привет медвед, мы не виделись сто лет"})));

        printEmptyLine();
        printTask("", 15);
        System.out.println(Task15(new int[]{4,2,4,3}));












    }


}
