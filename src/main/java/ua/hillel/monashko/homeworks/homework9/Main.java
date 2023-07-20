package ua.hillel.monashko.homeworks.homework9;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] team1 = new int[25];

        for (int i = 0; i < team1.length; i++) {
            team1 [i] = i;
            int min = 18;
            int max = 40;

            team1[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print("Team 1 age- " + team1[i]);
        }
        System.out.println();


        int[] team2 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            team2 [i] = i;
            int min = 18;
            int max = 40;

            team2[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print("Team 2 age- " + team2[i]);
        }


        // среднее арифметическое - сумма всех чисел деленная на их количество
        int[] numbers = {5, 8, 12, -18, -54, 84, -35, 17, 37};

        double average = 0;
        if (numbers.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            average = sum / numbers.length;

        }
        System.out.println(average);








    }
}
