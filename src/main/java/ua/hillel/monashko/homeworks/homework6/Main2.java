package ua.hillel.monashko.homeworks.homework6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1st Team name");
         String firstTeamName = scanner.nextLine();

        System.out.println("1st Team- " + firstTeamName);
        System.out.println("Please input frags for each player for the team- " + firstTeamName + " (5 players)");

        //a1-a5 players for First Team

        double a1 = 1;
        if (scanner.hasNextDouble()){
            a1 = scanner.nextInt();
        }else {
            System.out.println("Please input integer");
            System.exit(0);
        }

        double a2 = 1;
        if (scanner.hasNextDouble()){
            a2 = scanner.nextInt();
        }else {
            System.out.println("Please input integer");
            System.exit(0);
        }

        double a3 = 1;
        if (scanner.hasNextDouble()){
            a3 = scanner.nextInt();
        }else {
            System.out.println("Please input integer");
            System.exit(0);

        }

        double a4 = 1;
        if (scanner.hasNextDouble()){
            a4 = scanner.nextInt();
        }else {
            System.out.println("Please input integer");
            System.exit(0);
        }

        double a5 = 1;
        if (scanner.hasNextDouble()){
            a5 = scanner.nextDouble();
        }else {
            System.out.println("Please input integer");
            System.exit(0);
        }

        double firstTeamAVG = (double) ((a1+a2+a3+a4+a5) / 5);


        scanner.nextLine();


        System.out.println("Please input 2nd Team name");
        String secondTeamName = scanner.nextLine();


         System.out.println("2nd Team- " + secondTeamName);
        System.out.println("Please input frags for each player for the team- " + secondTeamName + " (5 players)");

        //b1-b5 players for Second Team

        double b1 = 1;
        if (scanner.hasNextDouble()){
            b1 = scanner.nextInt();
        }else {
            System.out.println("Please input integer");
            System.exit(0);
        }

        double b2 = 1;
        if (scanner.hasNextDouble()){
            b2 = scanner.nextInt();
        }else {
            System.out.println("Please input integer");
            System.exit(0);
        }

        double b3 = 1;
        if (scanner.hasNextDouble()){
            b3 = scanner.nextInt();
        }else {
            System.out.println("Please input integer");
            System.exit(0);
        }

        double b4 = 1;
        if (scanner.hasNextDouble()){
            b4 = scanner.nextInt();
        }else {
            System.out.println("Please input integer");
            System.exit(0);
        }

        double b5 = 1;
        if (scanner.hasNextDouble()){
            b5 = scanner.nextDouble();
        }else {
            System.out.println("Please input integer");
            System.exit(0);
        }

        double secondTeamAVG =(double) ((b1+b2+b3+b4+b5) / 5);

        System.out.println("AVG for team- " +firstTeamName+ "=" + firstTeamAVG);
        System.out.println("AVG for team- " +secondTeamName+ "=" + secondTeamAVG);
        double a = firstTeamAVG;
        double b = secondTeamAVG;

        if (a>b) {
            System.out.println("Team " + firstTeamName + " Wins" + "," + "Average Frags- " + a);

        }
        else if (a<b) {
            System.out.println("Team " + secondTeamName + " Wins" + "," + "Average Frags- " + b);

        }
        else {
            System.out.println("Draw");
            System.out.println("The Average is equal- " + a);

        }


    }
}






