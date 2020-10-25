package com.company;

import java.util.Scanner;

public class ChipsFastFoodEmporium {

    public static void main(String[] args) {

        //Creating and initializing variables.
        Scanner scan = new Scanner (System.in);

        int totalCalories = 0;
        String burger = "";
        String side = "";
        String drink = "";
        String dessert = "";
        String youSure = "";

        //Printing the greeting.
        System.out.println("Hello and welcome to Chip's Fast Food Emporium! Please type a, b, c, or d to select a food.");
        System.out.println("");

        //Printing the menus and acquiring the user's choice of foods. Also, if statements are used to add up calories
        // and determine whether the user's input is valid or not.
        while (!burger.equalsIgnoreCase("a") && !burger.equalsIgnoreCase("b")
                && !burger.equalsIgnoreCase("c") && !burger.equalsIgnoreCase("d")) {
            System.out.println("Which burger would you like?");
            System.out.println("");
            System.out.println("A. Cheeseburger          461 Calories");
            System.out.println("B. Fish Burger           431 Calories");
            System.out.println("C. Veggie Burger         420 Calories");
            System.out.println("D. No Burger               0 Calories");
            System.out.println("");

            System.out.print("Your choice: "); burger = scan.nextLine();

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

        }

        while (!side.equalsIgnoreCase("a") && !side.equalsIgnoreCase("b")
                && !side.equalsIgnoreCase("c") && !side.equalsIgnoreCase("d")) {
            System.out.println("Which side order would you like?");
            System.out.println("");
            System.out.println("A. Fries                100 Calories");
            System.out.println("B. Baked Potato          57 Calories");
            System.out.println("C. Chef Salad            70 Calories");
            System.out.println("D. No Side Order         0 Calories");
            System.out.println("");

            System.out.print("Your choice: "); side = scan.nextLine();

            if (side.equalsIgnoreCase("a"))
                totalCalories += 100;
            else if (side.equalsIgnoreCase("b"))
                totalCalories += 57;
            else if (side.equalsIgnoreCase("c"))
                totalCalories += 70;
            else if (side.equalsIgnoreCase("d"))
                totalCalories += 0;
            else
                System.out.println("Not a valid option. ");

        }

        while (!drink.equalsIgnoreCase("a") && !drink.equalsIgnoreCase("b")
                && !drink.equalsIgnoreCase("c") && !drink.equalsIgnoreCase("d")) {
            System.out.println("Which drink would you like?");
            System.out.println("");
            System.out.println("A. Soft Drink          130 Calories");
            System.out.println("B. Orange Juice        160 Calories");
            System.out.println("C. Milk                118 Calories");
            System.out.println("D. No Drink              0 Calories");
            System.out.println("");

            System.out.print("Your choice: "); drink = scan.nextLine();

            if (drink.equalsIgnoreCase("a"))
                totalCalories += 130;
            else if (drink.equalsIgnoreCase("b"))
                totalCalories += 160;
            else if (drink.equalsIgnoreCase("c"))
                totalCalories += 118;
            else if (drink.equalsIgnoreCase("d"))
                totalCalories += 0;
            else
                System.out.println("Not a valid option. ");

        }

        while (!dessert.equalsIgnoreCase("a") && !dessert.equalsIgnoreCase("b")
                && !dessert.equalsIgnoreCase("c") && !dessert.equalsIgnoreCase("d")) {
            System.out.println("Which dessert would you like?");
            System.out.println("");
            System.out.println("A. Apple Pie            167 Calories");
            System.out.println("B. Sundae                266 Calories");
            System.out.println("C. Fruit Cup             75 Calories");
            System.out.println("D. No Dessert             0 Calories");
            System.out.println("");

            System.out.print("Your choice: "); dessert = scan.nextLine();

            if (dessert.equalsIgnoreCase("a"))
                totalCalories += 167;
            else if (dessert.equalsIgnoreCase("b"))
                totalCalories += 266;
            else if (dessert.equalsIgnoreCase("c"))
                totalCalories += 75;
            else if (dessert.equalsIgnoreCase("d"))
                totalCalories += 0;
            else
                System.out.println("Not a valid option. ");

        }

        //Determining whether the user's selected meal is healthy or not using a if statement.
        System.out.print("The total calorie count of your meal is " + totalCalories + "; it is ");

        if (totalCalories < 600 && totalCalories >= 1) {
            System.out.println("healthy.");
        }
        if (totalCalories >= 600 && totalCalories < 900) {
            System.out.println("moderately healthy.");
        }
        if (totalCalories >= 900) {
            System.out.println("unhealthy.");
        }
        if (totalCalories == 0) {
            System.out.println("healthy, I guess.");
        }

        //Displaying the user's final order.
        System.out.println("Your order of...");
        if (burger.equalsIgnoreCase("a"))
            System.out.println("-a cheeseburger");
        else if (burger.equalsIgnoreCase("b"))
            System.out.println("-a fish burger");
        else if (burger.equalsIgnoreCase("c"))
            System.out.println("-a veggie burger");

        if (side.equalsIgnoreCase("a"))
            System.out.println("-fries");
        else if (side.equalsIgnoreCase("b"))
            System.out.println("-a baked potato");
        else if (side.equalsIgnoreCase("c"))
            System.out.println("-a chef's salad");

        if (drink.equalsIgnoreCase("a"))
            System.out.println("-a soft drink");
        else if (drink.equalsIgnoreCase("b"))
            System.out.println("-orange juice");
        else if (drink.equalsIgnoreCase("c"))
            System.out.println("-milk");

        if (dessert.equalsIgnoreCase("a"))
            System.out.println("-apple pie ");
        else if (dessert.equalsIgnoreCase("b"))
            System.out.println("-a sundae ");
        else if (dessert.equalsIgnoreCase("c"))
            System.out.println("-a fruit cup ");

        if (burger.equalsIgnoreCase("d") && side.equalsIgnoreCase("d")
                && drink.equalsIgnoreCase("d") && dessert.equalsIgnoreCase("d")) {
            System.out.println("-freshly-made nothing");
        }

        System.out.print("...is ready! Thanks and come again.");

    }
}
