package ua.hillel.monashko.homeworks.homework9;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        System.out.println();

        int[] team1 = new int[25];

        int i = 0;
        for (; i < team1.length; i++) {
            team1 [i] = i;
            int min = 18;
            int max = 40;

            team1[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print("Team 1 age- " + team1[i]);
        }
        int sum = Arrays.stream(team1).sum(); // int - cause average age is Integer
        System.out.println();

        int avg1 = sum/ team1.length;
        System.out.println("Average age for Team 1- " + avg1);
        System.out.println();
        System.out.println();


        int[] team2 = new int[25];
        for (int j = 0; j < team1.length; j++) {
            team2 [j] = i;
            int min = 18;
            int max = 40;

            team2[j] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print("Team 2 age- " + team2[j]);
        }
        int sum2 = Arrays.stream(team2).sum(); // int - cause average age is Integer
        System.out.println();
        int avg2 = sum2/team2.length;
        System.out.println("Average age for Team 2- " + avg2);

        if(avg1>avg2){
            System.out.println("Average age of Team 1 more than Team 2");
        } else if (avg1<avg2) {
            System.out.println("Average age of Team 2 more than Team 1");
        }else {
            System.out.println("Average age is equal");
        }

    }
}
