package ua.hillel.monashko.homeworks.homework5;


//За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.

//З кожного боку боролися 3 типи воїнів з такими показниками атаки:

//Лі:

//воїн - 13
//лучник - 24
//вершник - 46

// (13+24+46) * 860 -загальний показник атаки Li

//Мінь:

//воїн - 9
//лучник - 35
//вершник - 12

// (860 * 1.5) * (9+35+12) - загальний показник атаки Min

//Розрахувати: загальний показник атаки для обох династій, якщо відомо, що воїнів династії Лі кожного типу було 860,
// а кількість воїнів династії Мінь кожного типу в півтора рази більша.

//Вивести в консоль значення загальної атаки кожної армії;


public class Main {

    public static void main(String[] args) {

        int warriorLi  = 13;
        int archerLi = 24;
        int horsemanLi = 46;

        int qtyLi = 860;

        int totalAttackRateLi = (warriorLi + archerLi + horsemanLi) * qtyLi;

        System.out.println("Загальний показник атаки Li = " +totalAttackRateLi );

        int warriorMin = 9;
        int archerMin = 35;
        int horsemanMin = 12;

        double qtyMin = qtyLi * 1.5;

        int totalAttackRateMin =(int) (qtyMin * (warriorMin + archerMin +horsemanMin));

        System.out.println("Загальний показник атаки Min = " +totalAttackRateMin );





    }

}
