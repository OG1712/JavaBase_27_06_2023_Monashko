package ua.hillel.monashko.homeworks.homework2;

public class Main {

    // Big Ben
    // standard
    //51.500626° N,   0.124623° W
    // DMS
    // N51°30.043' W0°7.4775'


    public static void main(String[] args) {

       double Lat =  51.500626;
       double Long = 0.124623;
       String LatDMS = "51°30.043N";
       String LongDMS = "0°7.4775W";


        System.out.println("Big Ben Coordinates");

        System.out.println("Decimal");

        System.out.println("Longitude: " + Long + " Latitude: " + Lat);

        System.out.println("DMS");

        System.out.println(LongDMS + "-Longitude DMS"+ " " + LatDMS + "-Latitude DMS");









    }
}
