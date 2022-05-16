package school;

public class Person {

    public static void main(String[] args) {

        int yOB = 1990;
        String message = ("Если человек родился в " + yOB + ", то его возраст - разница между 2000 и "
                + yOB);
        int yOB1 = 1989;
        String message1 = ("Если человек родился в " + yOB1 + ", то его возраст - разница между 2000 и " + yOB1);
        int a = 2000;
        int b = a - yOB;
        String message2 = ("Если человек родился в " + yOB + ", то его возраст - разница между 2000 и " + yOB + " равна "
                + b);

        System.out.println(message);
        System.out.println(message1);
        System.out.println(message2);
    }
}
