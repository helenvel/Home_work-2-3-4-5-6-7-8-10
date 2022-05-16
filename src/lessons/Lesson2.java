package lessons;

public class Lesson2 {

    public static void main (String [] args) {

        int a = 5;
        int b = 13;
        int c = 113;
        int d = - 5;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;

        System.out.println ("a = " + a);
        System.out.println ("b = " + b);
        System.out.println ("c = " + c);

        System.out.println ("a = " + (a + b));
        System.out.println ("a = " + sumAB);
        System.out.println (a + b);
        System.out.println (sumAB);
        System.out.println (sumABC);
        System.out.println(a + b + "" + c);

        System.out.println("" + a + " " + b + " " + c);
        System.out.print ( "Сегодня  " );
        System.out.println ("Воскресенье");

        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a / d);
    }
}
