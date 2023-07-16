package ua.hillel.monashko.homeworks.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please input integer from 0 to 10. If You will guess, the WIN! is yours");
        System.out.println("You have 4 attempts, GOOD LUCK :)");


        int random = (int) (Math.random() * 11);
        //System.out.println(random);



        for (int i = 0; i <4; i++) {

        int a = 0;
            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                System.out.println(a);
            } else {
                System.out.println("Input Incorrect");
                System.exit(0);
            }
            if (a == random) {
                System.out.println("You Won ! ! !");
                System.out.println("Congratulations :)");
                System.exit(0);
            } else  {
                System.out.println("Try one more time");
            }
            if (a != random){
                System.out.println("Your answer did not match with the result :(");

            }else {

            }

        }

    }


}












