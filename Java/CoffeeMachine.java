package machine;

import java.util.Scanner;

public class CoffeeMachine {
    final static private Scanner scanner = new Scanner(System.in);
    private static int hasWater = 400;
    private static int hasMilk = 540;
    private static int hasBeans = 120;
    private static int hasCups = 9;
    private static int hasMoney = 550;
    private static boolean isOn = true;

    public static void main(String[] args) {
        while (isOn) {
            enterAction();
        }
    }

    static void makeCoffee(int needWater, int needMilk, int needBeans, int cost) {
        String msg;

        if (hasWater < needWater) {
            msg = "Sorry, not enough water!";
        } else if (hasBeans < needBeans) {
            msg = "Sorry, not enough coffee beans!";
        } else if (hasMilk < needMilk) {
            msg = "Sorry, not enough milk!";
        } else {
            hasWater -= needWater;
            hasMilk -= needMilk;
            hasBeans -= needBeans;
            hasMoney += cost;
            hasCups--;
            msg = "I have enough resources, making you a coffee!";
        }

        System.out.println(msg);
    }

    static void printStats() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(hasWater + " ml of water");
        System.out.println(hasMilk + " ml of milk");
        System.out.println(hasBeans + " g of coffee beans");
        System.out.println(hasCups + " disposable cups");
        System.out.println("$" + hasMoney + " of money");
    }

    static void enterAction() {
        String action = "";

        System.out.println("Write action (buy, fill, take, remaining, exit):");

        action = scanner.next();

        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                printStats();
                break;
            case "exit":
                isOn = false;
                break;
            default:
                System.out.println("Error!");
                break;
        }

    }

    static void buy() {
        String choice;

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        choice = scanner.next();

        switch (choice) {
            case "1":
                makeCoffee(250, 0, 16, 4);
                break;
            case "2":
                makeCoffee(350, 75, 20, 7);
                break;
            case "3":
                makeCoffee(200, 100, 12, 6);
                break;
            case "back":
                enterAction();
                break;
            default:
                System.out.println("Error!");
                break;
        }

    }

    static void fill() {
        String s1 = "Write how many ";
        String s2 = " you want to add:";

        System.out.println(s1 + "ml of water" + s2);
        hasWater += scanner.nextInt();
        System.out.println(s1 + "ml of milk" + s2);
        hasMilk += scanner.nextInt();
        System.out.println(s1 + "grams of coffee beans" + s2);
        hasBeans += scanner.nextInt();
        System.out.println(s1 + "disposable cups of coffee" + s2);
        hasCups += scanner.nextInt();
    }

    static void take() {
        System.out.println("I gave you $" + hasMoney);
        hasMoney = 0;
    }
}

