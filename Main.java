package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Creating variables.
        Scanner scan = new Scanner (System.in);

        int totalCalories = 0;
        String burger;
        String side;
        String drink;
        String dessert;

        //Printing the greeting.
        System.out.println("Hello and welcome to Chip's Fast Food Emporium! Please type a, b, c, or d when selecting foods.");
        System.out.println("");

        //Printing the menus and acquiring the user's choice of foods. Also, if statements are used to determine whether the user's input is valid or not.

        System.out.println("Which burger would you like?");
        System.out.println("");
        System.out.println("A. Cheeseburger          461 Calories");
        System.out.println("B. Fish Burger           431 Calories");
        System.out.println("C. Veggie Burger         420 Calories");
        System.out.println("D. No Burger               0 Calories");
        System.out.println("");
        System.out.println("Enter choice below:");

        burger = scan.nextLine();

        if (burger.equalsIgnoreCase("a"))
            totalCalories += 461;
        else if (burger.equalsIgnoreCase("b"))
            totalCalories += 431;
        else if (burger.equalsIgnoreCase("c"))
            totalCalories += 420;
        else if (burger.equalsIgnoreCase("d"))
            totalCalories += 0;
        else
            System.out.println("Not a valid option. ");


        System.out.println("Which side order would you like?");
        System.out.println("");
        System.out.println("A. Fries                100 Calories");
        System.out.println("B. Baked Potato          57 Calories");
        System.out.println("C. Chef Salad            70 Calories");
        System.out.println("D. No Side Order         0 Calories");
        System.out.println("");
        System.out.println("Enter choice below:");

        side = scan.nextLine();

        System.out.println("Which drink would you like?");
        System.out.println("");
        System.out.println("A. Soft Drink          130 Calories");
        System.out.println("B. Orange Juice        160 Calories");
        System.out.println("C. Milk                118 Calories");
        System.out.println("D. No Drink              0 Calories");
        System.out.println("");
        System.out.println("Enter choice below:");

        drink = scan.nextLine();

        System.out.println("Which dessert would you like?");
        System.out.println("");
        System.out.println("A. Apple Pie            167 Calories");
        System.out.println("B. Sundae                266 Calories");
        System.out.println("C. Fruit Cup             75 Calories");
        System.out.println("D. No Dessert             0 Calories");
        System.out.println("");
        System.out.println("Enter choice below:");

        dessert = scan.nextLine();

        System.out.println(totalCalories);




    }
}
