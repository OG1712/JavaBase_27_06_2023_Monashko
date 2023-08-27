package ua.hillel.monashko.homeworks.homework14;

import java.time.LocalDate;

public class ConsoleRun {
    public static void main(String[] args) {

        LocalDate birthday1 = LocalDate.of(2000, 6, 23);

        User user1 = new User("Tracey", birthday1, "tracey2306@example.com", "135764",
                "De Santa", 55, 80, 5000);

        LocalDate birthday2 = LocalDate.of(1998, 10, 12);

        User user2 = new User(" Franklin", birthday2, "franklonclinton@example.com", "634562",
                "Clinton", 80, 90, 9500);

        LocalDate birthday3 = LocalDate.of(1996, 11, 4);

        User user3 = new User("Lamar ", birthday2, "lamarbigdog@example.com", "873456",
                "Davis", 75, 112, 12000);

        user1.printAccountInfo();

        user2.printAccountInfo();

        user3.printAccountInfo();



        user1.setSurname("Michael");

        user1.setWeight(85);

        user1.setPressure(105);

        user1.setSteps(10000);

        user2.setSurname("De Santa");

        user2.setWeight(67);

        user2.setPressure(100);

        user2.setSteps(12000);



        user1.printAccountInfo();

        user2.printAccountInfo();

        user3.printAccountInfo();

    }
}
