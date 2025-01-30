package com.pluralsight;
import java.util.Scanner;

/**
 * SandwichShop - A program to calculate sandwich prices with age-based discounts
 * and optional toppings. Offers different prices for regular and large sandwiches
 * with special discounts for students and seniors.
 */
public class SandwichShop {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Base prices for sandwiches
        float REGULAR_PRICE = 5.45f;
        float LARGE_PRICE = 8.95f;

        // Variables for pricing calculations
        float studentPrice = 0;    // Price after 10% student discount
        float seniorPrice = 0;     // Price after 20% senior discount

        // User input variables
        int customerAge;           // Used to determine discount eligibility
        int sandwichSize;         // 1 for Regular, 2 for Large
        String wantsToppings;     // Yes/No for additional toppings

        // Get sandwich size from user
        System.out.println("Please enter the size of the sandwich");
        System.out.print("Press 1 for Regular or 2 for Large: ");
        sandwichSize = scanner.nextInt();

        // Ask about additional toppings
        System.out.println("Would you like a loaded sandwich? ");
        System.out.print("Please Enter yes or no: ");
        wantsToppings = scanner.next();

        // Process orders with toppings
        if(wantsToppings.equalsIgnoreCase("yes")) {
            // Handle Regular sandwich with toppings
            if(sandwichSize == 1) {
                System.out.print("Please enter an age: ");
                customerAge = scanner.nextInt();

                if(customerAge <= 17) {
                    studentPrice = (REGULAR_PRICE - (REGULAR_PRICE * 0.10f)) + 1.00f;
                    System.out.printf("Cost of Sandwich w/ toppings: $%.2f ", studentPrice);
                }
                else if(customerAge >= 65) {
                    seniorPrice = (REGULAR_PRICE - (REGULAR_PRICE * 0.20f)) + 1.00f;
                    System.out.printf("Cost of Sandwich w/ toppings: $%.2f ", seniorPrice);
                }
            }
            // Handle Large sandwich with toppings
            else if(sandwichSize == 2) {
                System.out.print("Please enter an age: ");
                customerAge = scanner.nextInt();

                if(customerAge <= 17) {
                    studentPrice = (LARGE_PRICE - (LARGE_PRICE * 0.10f)) + 1.75f;
                    System.out.printf("Cost of Sandwich: $%.2f ", studentPrice);
                }
                else if(customerAge >= 65) {
                    seniorPrice = (LARGE_PRICE - (LARGE_PRICE * 0.20f)) + 1.75f;
                    System.out.printf("Cost of Sandwich: $%.2f ", seniorPrice);
                }
            }
        }
        // Process orders without toppings
        else if(wantsToppings.equalsIgnoreCase("no")) {
            // Handle Regular sandwich without toppings
            if(sandwichSize == 1) {
                System.out.print("Please enter an age: ");
                customerAge = scanner.nextInt();

                if(customerAge <= 17) {
                    studentPrice = (REGULAR_PRICE - (REGULAR_PRICE * 0.10f));
                    System.out.printf("Cost of Sandwich: $%.2f ", studentPrice);
                }
                else if(customerAge >= 65) {
                    seniorPrice = (REGULAR_PRICE - (REGULAR_PRICE * 0.20f));
                    System.out.printf("Cost of Sandwich: $%.2f ", seniorPrice);
                }
            }
            // Handle Large sandwich without toppings
            else if(sandwichSize == 2) {
                System.out.print("Please enter an age: ");
                customerAge = scanner.nextInt();

                if(customerAge <= 17) {
                    studentPrice = (LARGE_PRICE - (LARGE_PRICE * 0.10f));
                    System.out.printf("Cost of Sandwich: $%.2f ", studentPrice);
                }
                else if(customerAge >= 65) {
                    seniorPrice = (LARGE_PRICE - (LARGE_PRICE * 0.20f));
                    System.out.printf("Cost of Sandwich: $%.2f ", seniorPrice);
                }
            }
        }
    }
}