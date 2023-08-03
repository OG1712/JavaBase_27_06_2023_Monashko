package ua.hillel.monashko.homeworks.homework11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a1 = 1;
        if (scanner.hasNextDouble()) {
            a1 = scanner.nextInt();
        } else {
            System.out.println("Please input integer(from 1)");
            System.exit(0);
        }

        Scanner scanner2 = new Scanner(System.in);

        int a2 = 1;
        if (scanner.hasNextDouble()) {
            a2 = (int) scanner.nextInt();
        } else {
            System.out.println("Please input integer(from 1)");
            System.exit(0);
        }

        int[][] Array = new int[a1][a2];
        int[][] Array2 = new int[a2][a1];




///////// Array fill

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = (int) (Math.random() * 101);
            }

        }
        for (int i = 0; i < Array2.length; i++) {
            for (int j = 0; j < Array2[j].length; j++) {
                Array2[i][j] = Array[j][i];
            }

        }


/////////      OUTPUT

//      for first Array
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

//      for second Array
        for (int i = 0; i < Array2.length; i++) {
            for (int j = 0; j < Array2[i].length; j++) {
                System.out.print(Array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}











//
//    Scanner scanner = new Scanner(System.in);
//    int n = getNumber(scanner);
//    int m = getNumber(scanner);
//
//    int[][] array1 = new int[n][m];
//    int[][] array2 = new int[m][n];
//
//        for (int i = 0; i < array1.length; i++) {
//        for (int j = 0; j < array1[i].length; j++) {
//            array1[i][j] = (int) (Math.random() * 101);
//        }
//    }
//        System.out.println("First array:");
//    printArray(array1);
//
//        for (int i = 0; i < array2.length; i++) {
//        for (int j = 0; j < array2[i].length; j++) {
//            array2[i][j] = array1[j][i];
//        }
//    }
//        System.out.println("Second array:");
//    printArray(array2);
//
//        scanner.close();
//}
//
//    static void printArray(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//
//    static int getNumber(Scanner scanner) {
//        int temp = 0;
//        System.out.println("Please enter array length");
//        while (true) {
//            if (scanner.hasNextInt()) {
//                temp = scanner.nextInt();
//                if (temp < 0) {
//                    System.out.println("Please enter positive number");
//                } else {
//                    break;
//                }
//                scanner.nextLine();
//            } else {
//                System.out.println("Wrong data, try again");
//                scanner.nextLine();
//            }
//        }
//        return temp;}
//
//}



