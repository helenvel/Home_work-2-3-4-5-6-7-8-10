package utils;

public class Utils {

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

    public static void printIntLine() {
        System.out.print(" ----------------------- ");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void printTask(String text, int num) {
        String text1 = "Ответ задание №  ";
        System.out.println(text1 + num + " ");

    }

}

