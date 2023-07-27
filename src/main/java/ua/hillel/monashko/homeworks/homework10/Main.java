package ua.hillel.monashko.homeworks.homework10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        int[] ownerArray = new int[7];
        int i = 0;
        int min = 0;
        int max = 9;
        for (; i < ownerArray.length; i++) {
            ownerArray[i] = i;
            ownerArray[i] = (int) ((Math.random()) * (max - min + 1) + min);
            System.out.print("Owner- " + +ownerArray[i] + " ");
        }
        System.out.println();
        System.out.println();
        int[] usersArray = new int[7];

        int j = 0;
        int miN = 0;
        int maX = 9;
        for (; j < usersArray.length; j++) {
            usersArray[j] = i;
            usersArray[j] = (int) ((Math.random()) * (max - min + 1) + min);
            System.out.print("Users- " + usersArray[j] + " ");
        }
        System.out.println();
        System.out.println();

        Arrays.sort(ownerArray);
        System.out.println("Owner - " + (Arrays.toString(ownerArray)));
        Arrays.sort(usersArray);
        System.out.println("User - " + (Arrays.toString(usersArray)));


        if(ownerArray[0]==usersArray[0]) {
            System.out.println("First Element is equal" + "=" + ownerArray[0]);
        }
        else {
            System.out.println("Element 1 not equal"+ "=" + ownerArray[1]);
        } if(ownerArray[1]==usersArray[1]) {
            System.out.println("Second Element is equal"+ "=" + ownerArray[2]);
        }
        else {
            System.out.println("Element 2 not equal");
        } if(ownerArray[2]==usersArray[2]) {
            System.out.println("Third Element is equal"+ "=" + ownerArray[3]);
        }
        else {
            System.out.println("Element 3 not equal");
        } if(ownerArray[3]==usersArray[3]) {
            System.out.println("Forth Element is equal"+ "=" + ownerArray[4]);
        }
        else {
            System.out.println("Element 4 not equal");
        } if(ownerArray[4]==usersArray[4]) {
            System.out.println("Fiefs Element is equal"+ "=" + ownerArray[5]);
        }
        else {
            System.out.println("Element 5 not equal");
        } if(ownerArray[5]==usersArray[5]) {
            System.out.println("Element number 6 is equal"+ "=" + ownerArray[6]);
        }
        else {
            System.out.println("Element 6 not equal");
        } if(ownerArray[6]==usersArray[6]) {
            System.out.println("Element number 7 is equal"+ "=" + ownerArray[7]);
        }
        else {
            System.out.println("Element 7 not equal");{
            }
        }

    }
}



        




