package ua.hillel.monashko.homeworks.homework6;

public class Main {
    public static void main(String[] args) {

        String FirstTeamName = "Counter-Terrorist ";
        String SecondTeamName = "Terrorist ";

        // a1-a5 - Counter-Terrorist Team players

        int a1 = 18;
        int a2 = 21;
        int a3 = 19;
        int a4 = 13;
        int a5 = 16;

        // b1-b5 - Terrorist Team players

        int b1 = 18;
        int b2 = 21;
        int b3 = 15;
        int b4 = 13;
        int b5 = 16;

        double avgForFirstTeam = (double) (a1+a2+a3+a4+a5) / 5;
        double avgForSecondTeam = (double) (b1+b2+b3+b4+b5) / 5;

        System.out.println(FirstTeamName + "=" + avgForFirstTeam + " Average Frags");
        System.out.println(SecondTeamName + "=" + avgForSecondTeam +" Average Frags");

       double a = avgForFirstTeam;
       double b = avgForSecondTeam;

       if (a>b) {
           System.out.println("Team " + FirstTeamName + " Wins" + "," + "Average Frags- " + avgForFirstTeam);

           }
           else if (a<b) {
               System.out.println("Team " + SecondTeamName + " Wins" + "," + "Average Frags- " + avgForSecondTeam);

           }
           else {
           System.out.println("Draw");
           System.out.println("The Average is equal- " + avgForFirstTeam);


       }







    }
}
