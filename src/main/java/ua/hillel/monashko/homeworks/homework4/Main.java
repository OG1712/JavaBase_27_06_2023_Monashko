package ua.hillel.monashko.homeworks.homework4;
//Паралелепіпед:

      //  Створити у новому класі main-метод;
       // Створити три змінні для зберігання сторін паралелепіпеда;
      //  Порахувати обсяг у змінній volume;
      //  Вивести на екран змінну volume у вигляді:
        //  System.out.println("Об'єм паралелепіпеда = " + volume);
     //   Порахувати сумарну довжину всіх сторін у змінній length та вивести її на екран;
     //   Прикріпити до LMS файл .java з вашою роботою;
     //   Файл .java лежить за таким шляхом:
      //  папка проекту -> src -> your_package_name -> MyApp.java
     //   де MyApp - назва вашого класу/файлу

public class Main {

    public static void main(String[] args) {

        // volume = abc

        // a length 1st side
        // b length 2nd side
        // c length 3rd side
        // a,b,c value in cm

        int a = 14;
        double b = 15.4;
        int c = 20;

        int volume = (int)  (a * b * c);
        System.out.println("Об'єм паралелепіпеда = " + volume + " куб см");

        int valueForLengthCalculation = 4;

        double length =  (a + b + c) * valueForLengthCalculation ;

        System.out.println("Сумарна довжина всіх сторін= " + length+" см");

    }

}
