package com.pluralsight;
import java.util.Scanner;

// SandwichShop class - A simple program to calculate sandwich prices with age-based discounts
public class SandwichShop {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner in = new Scanner(System.in);

        // Set base prices as constants
        float REGULAR_PRICE = 5.45f;    // Base price for regular sandwich
        float LARGE_PRICE = 8.95f;      // Base price for large sandwich

        // Variables to store final prices after discounts
        float studentPrice = 0;         // Price after student discount (10%)
        float seniorPrice = 0;          // Price after senior discount (20%)

        // Variables for user input
        int customerAge;               // Customer's age to determine discount
        int sandwichSize;             // Size selection (1=Regular, 2=Large)

        // Display menu options
        System.out.print("Please enter the size of the sandwich\n");
        System.out.print("Press 1 for Regular or 2 for Large: ");
        sandwichSize = in.nextInt();

        // Process order for Regular sandwich
        if(sandwichSize == 1) {
            // Get customer age
            System.out.print("Please enter an age: ");
            customerAge = in.nextInt();

            // Apply student discount if 17 or younger
            if(customerAge <= 17) {
                studentPrice = REGULAR_PRICE - (REGULAR_PRICE * 0.10f);
                System.out.printf("Cost of Sandwich: $%.2f ", studentPrice);
            }
            // Apply senior discount if 65 or older
            else if(customerAge >= 65) {
                seniorPrice = REGULAR_PRICE - (REGULAR_PRICE * 0.20f);
                System.out.printf("Cost of Sandwich: $%.2f ", seniorPrice);
            }
        }
        // Process order for Large sandwich
        else if(sandwichSize == 2) {
            // Get customer age
            System.out.print("Please enter an age: ");
            customerAge = in.nextInt();

            // Apply student discount if 17 or younger
            if(customerAge <= 17) {
                studentPrice = LARGE_PRICE - (LARGE_PRICE * 0.10f);
                System.out.printf("Cost of Sandwich: $%.2f ", studentPrice);
            }
            // Apply senior discount if 65 or older
            else if(customerAge >= 65) {
                seniorPrice = LARGE_PRICE - (LARGE_PRICE * 0.20f);
                System.out.printf("Cost of Sandwich: $%.2f ", seniorPrice);
            }
        }


    }
}