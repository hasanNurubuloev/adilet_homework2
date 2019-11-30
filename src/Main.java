

import java.util.Random;

public class Main {
    static String name = " Aдилет";
    static int age = generateRandomAge();
    static int temperature = 10;

    public static void main(String[] args) {


        System.out.println(name);


        System.out.println("на улице " + temperature + " градусов");

        if (age > 20 && age < 45 && temperature > +30 && temperature > -20) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно гулять");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println(" Можно");
        } else {
            System.out.println("Нельзя вызодить");
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        age = random.nextInt(107);
        System.out.println(age);
        //
        return age;
    }

}









