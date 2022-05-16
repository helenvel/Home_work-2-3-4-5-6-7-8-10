package homeWork;


public class HW2 {

    public static void main (String [] args) {

        int k = 5;
        int l = 8;
        int m = 7;
        int sumKL = k + l;
        int multKM = k * m;
        int subLM = l - m;
        int devKL = k/l;
        int devKM = k/m;
        int devLM = l/m;
        int devMK = m/k;
        int sumKLM = k + l + m;
        int sumLKM = l + k + m;
        int a = 48;
        int b = 8;
        int devAB = a/b;
        int a1 = 47;
        int b1 = 49;
        int x = 2;
        int y = 3;
        int sumXY = x + 3;
        int c = 7;

        System.out.println ();
        System.out.println (k);
        System.out.println (l);
        System.out.println (m);
        System.out.println ("**********");
        System.out.println (k + " " + l + " " + m );
        System.out.println ("**********");
        System.out.println (k + ", " + l + ", " + m + "\nили\n" + k + ", " + l + ", " + m );
        System.out.println ("**********");
        System.out.println ("int k = " + k + ";" +  "\nили\n" + "k = " + k + ";" + "\n\n" + "int l = " + l + ";" +  "\nили\n" + "l = "
                + l + ";" + "\n\n" + "int m = " + m + ";" + "\nили\n" + "m = " + m + ";");

        System.out.println ("**********");
        System.out.println (sumKL);
        System.out.println (multKM);
        System.out.println (subLM);

        System.out.println ("**********");
        System.out.println (devKL);
        System.out.println (k % l);
        System.out.println ("**********");
        System.out.println (devKM);
        System.out.println (k % m);
        System.out.println ("**********");
        System.out.println (devLM);
        System.out.println (l % m);
        System.out.println ("**********");
        System.out.println (devMK);
        System.out.println (m % k);
        System.out.println ("**********");

        int apple = 40;
        int student = 6;
        int dev = apple/student;
        int ost = apple%student;
        String text1 = "Если ";
        String text2 = " яблок поделить на " ;
        String text3 = " учеников, то каждый ученик получит ";
        String text4 = " яблок, и ";
        String text5 = " яблок останется учителю.";
        String text = text1 + apple + text2 + student + text3 + dev + text4 + ost + text5;
        System.out.println (text);

        int apple1 = 100;
        int student1 = 21;
        int dev1 = apple1/student1;
        int ost1 = apple1%student1;
        String text6 = text1 + apple1 + text2 + student1 + text3 + dev1 + text4 + ost1 + text5; ;
        System.out.println (text6);
        System.out.println ("**********");

//   System.out.println ("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит"
//               + " " +  dev + " яблок, и " + ost + " яблок останется учителю." );
//
// System.out.println ("Если " + apple1 + " яблок поделить на  " + student1 + " ученика, то каждый ученик получит"
//                + " " +  dev+ " яблока, и " + ost + " яблок останется учителю." );
//        System.out.println ("**********");

        m++;
        sumKLM--;
        System.out.println (sumKLM+sumKL+m);
        System.out.println (m - sumLKM);
        System.out.println ("**********");

        System.out.println (devAB);
        System.out.println (a % b);
        System.out.println (a/2 + " и " + b/2);
        System.out.println (a % 2 + " и " + b % 2);
        System.out.println (a1/2+ " и " +b1/2);
        System.out.println (a1 % 2+ " и " +b1 % 2);

        System.out.println ("**********");
        System.out.println (sumXY);
        System.out.println (Math.pow(sumXY, x));

        int d = y-x;
        System.out.println ( "_____________________________ " );
        System.out.println ( "|" + "Задача" + "|" + "    Результат" + "       |"  );
        System.out.println ( "-----------------------------" );
        System.out.println ( "|" + "21" + "    |" + Math.pow(sumXY, x)  + "                |"  );
        System.out.println ( "-----------------------------" );
        double x1 = 2;
        double y1 = 3;
        double k1 = 5;
        double l1 = 8;
        double c1 = 7;
        System.out.println ( "|" + "22" + "    |" +  (((3+4*x1)/5) - (10 *(y1-5) * (k1 + l1 + c1)/x1) + 9 * ((4/x1) + ( 9+ x1)/y1))
                + "                 |"  );
        System.out.println ( "-----------------------------" );
        System.out.println ( "|" + "23" + "    |" + (((5*x+7*y)/(8*x+10*y))/((3*x-y)/(x+y))/((k+l)
                +(c/d)+(k+l)/(c+d)+(k*l)))  + "|"  );
        System.out.println ( "-----------------------------" );
    }

    public static class HW1 {

        public static void main (String []args) {

            int a = 10;
            int b = 20;
            int s = 100;
            int t = s;
            String myNameInSlack = "Helen";
        }
    }
}


