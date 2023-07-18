package ua.hillel.monashko.homeworks.homework8;

public class Main {
    public static void main(String[] args) {

        int counter = 0;
        int i = 0;
        for (; i <= 100; i++) {


            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 100 == 4 || i / 100 == 9 || i % 100 == 4 || i % 100 == 9) {
                continue;
            }
            System.out.println("Shuttle №- " + i);
            counter++;
            System.out.println("count " + counter);

        }
        i--;


        while (counter < 100) {
            i++;

            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 100 == 4 || i / 100 == 9 || i % 100 == 4 || i % 100 == 9 || i / 10%10==9 || i % 10 ==9|| i / 10%10==4 || i % 10 ==4) {


                continue;

            }
            counter++;
            System.out.println("Shuttle №- " + i);
            System.out.println("count " + counter);


        }
      // System.out.println(counter);
       

    }
}





