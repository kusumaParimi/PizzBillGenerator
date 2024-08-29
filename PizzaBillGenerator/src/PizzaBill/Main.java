package PizzaBill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza basePizza = new Pizza(false);

        boolean continueOrder = true;
        while (continueOrder) {
            System.out.println("*********************************************************");
            System.out.println("Select an option:");
            System.out.println("1 - Add Extra Cheese");
            System.out.println("2 - Add Extra Toppings");
            System.out.println("3 - Opt for Take Away");
            System.out.println("4 - Print Bill");
            System.out.println("5 - Exit");
            int choice = sc.nextInt();
            System.out.println("*********************************************************");

            switch (choice) {
                case 1:
                    basePizza.addExtraCheese();
                    break;
                case 2:
                    basePizza.addExtraToppings();
                    break;
                case 3:
                    basePizza.takeAway();
                    break;
                case 4:
                    basePizza.printBill();
                    break;
                case 5:
                    System.out.println("****************** Thank You *******************");
                    continueOrder = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
        sc.close();
    }
}
