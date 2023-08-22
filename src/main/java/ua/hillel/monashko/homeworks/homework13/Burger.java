package ua.hillel.monashko.homeworks.homework13;

public class Burger {

    String type;
    String meat;
    String bread;
    String cheese;
    String greens;
    String mayonnaise;
    String meatPortion2;


    Burger (String type, String meat, String bread, String cheese, String greens, String mayonnaise){
        this.type = type;
        this.meat = meat;
        this.bread = bread;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Burger Type- " + this.type + "," +"contains ingredients: " +this.meat + this.bread +
                this.cheese + this.greens + this.mayonnaise);

    }
    Burger (String type, String meat, String bread, String cheese, String greens){
        this.type = type;
        this.meat = meat;
        this.bread = bread;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Burger Type- " + this.type + "," +"contains ingredients: " +this.meat + this.bread +
                this.cheese + this.greens );

    }
    Burger (String type, String meat, String bread, String cheese, String greens, String mayonnaise, String meatPortion2){
        this.type = type;
        this.meat = meat;
        this.bread = bread;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.meatPortion2 = meatPortion2;
        System.out.println("Burger Type- " + this.type + "," +"contains ingredients: " +this.meat + this.bread +
                this.cheese + this.greens + this.mayonnaise +this.meatPortion2);
    }

}
