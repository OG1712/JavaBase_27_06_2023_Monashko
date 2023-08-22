package ua.hillel.monashko.homeworks.homework13;

public class BurgerMain {
    public static void main(String[] args) {



        Burger classic = new Burger("Classic", "м'ясо, ", "булочка, ", "сир, ",
                "зелень, ", "майонез");

        Burger dietetic = new Burger("Dietetic","м'ясо, ", "булочка, ", "сир, ", "зелень");

        Burger doubleMeat = new Burger("Double Meat", "м'ясо, ", "булочка, ", "сир, ",
                "зелень, ", "майонез, ", "друга порція м'яса");

    }

}
