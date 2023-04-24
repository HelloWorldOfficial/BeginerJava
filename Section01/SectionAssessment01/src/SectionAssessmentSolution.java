//***************************************************************************
//*
//* 					Section Assessment 01
//*
//* 			TBD            HelloWorldOfficial
//*
//* Description: This project is going to test the knowledge that you have learned so far. You will be tested on what you have learnt in this section
//*              For this project you will be writing a program that displays a customer their water bill. Please refer to the section 01 assessment document that
//*              is within this directory to figure out requirements. Remember to have fun! If you get stuck look through the solutions exercise
//* Edited: TBD    Edited:HelloWorldOfficial     Version:1
//*
//*
//*
//***************************************************************************
import java.util.Scanner;

public class SectionAssessmentSolution {

    public static void main(String[] args) {
          /* Step 1: Declare your variables for this project. Remember to look at the pdf document to figure out what variables you will need. The base cost of electricity for a
        civilian and enterprise customer are already declared
         */

        final double baseCostCivilian = 100;
        final double baseCostEnterprise = 300;


        String typeOfCustomerStringInput;
        String typeOfCustomerString;
        String hoursOfElectricityString;
        String output = "";
        int typeOfCustomer;
        int hoursOfElectricity;
        double costBeforeDiscount;
        double discount = 0;
        double discountInDollars = 0;
        double totalCost;
        double variance;
        double rate;
        String budgetedToSpendString;
        double budgetedToSpend;

        /* Step 2: Grab the customers info and whether they are a business or civilian customer, also grab how many hours they used electricity for.
        * Use an if else statement to also assign to a variable the type of customer that they are as a string  */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Electricity Bill Calculator !");
        System.out.println("Please type a 1 if you are a Civilian Customer, and a 2 if you are an Enterprise customer");

        typeOfCustomerStringInput = scanner.nextLine();
        typeOfCustomer = Integer.parseInt(typeOfCustomerStringInput);

        if (typeOfCustomer < 1 || typeOfCustomer > 2)
        {
            System.out.println("Sorry this is not a valid type of customer, close the program out and try again. Goodbye!");
            System.exit(0);
        }

        if (typeOfCustomer == 1) {
            typeOfCustomerString = "Civilian";
        } else {
            typeOfCustomerString = "Enterprise";
        }

        //REMEMBER TO CONVERT THAT String DATA INTO A USABLE NUMERICAL VALUE AND TO EVALUATE THAT THE USER HAS NOT PUT IN A UNUSABLE VALUE IN FOR THEIR ANSWER
        //REMEMBER TO ASSIGN THE TYPE OF CUSTOMER TO A ST1RING VALUE

        /* Step 3: Ask the customer how many hours of electricity they used  */

        System.out.println("How many hours of electricity did you use ?");
        hoursOfElectricityString = scanner.nextLine();
        hoursOfElectricity = Integer.parseInt(hoursOfElectricityString);
        if (hoursOfElectricity < 0)
        {
            System.out.println("Please input a non-negative number");
            System.exit(0);
        }

        /* Step 4: Declare your if branch to determine whether the customer is a civilian customer or if they are a business customer */

        if (typeOfCustomer == 1)
        {
            typeOfCustomerString = "Civilian";
            /* Step 5A: Calculate the monthly cost of electricity for a civilian customer with the number of hours that was provided,
            and the rate given in the pdf*/

            rate = 0.05;
            costBeforeDiscount = (rate * hoursOfElectricity) + baseCostCivilian;

            /* Step 6A: Ask the customer what they budgeted to spend and capture that into a variable, afterwards determine whether the customer
             * over spent or came in below what they budgeted.
             * If the civilian customer spent between $140 - $150 or budgeted to only spend $140 to $150 give them a 10% discount on their total price.*/

            System.out.println("What did you budget to spend this month?");
            budgetedToSpendString = scanner.nextLine();
            budgetedToSpend = Integer.parseInt(budgetedToSpendString);

            variance = costBeforeDiscount - budgetedToSpend;

            if (( costBeforeDiscount >= 140 || costBeforeDiscount <= 150) || (budgetedToSpend >= 140 || budgetedToSpend <= 150) )
            {
                discount = 0.10;
              discountInDollars = costBeforeDiscount * discount;

              totalCost = costBeforeDiscount - discountInDollars;
            }
            else
            {
                totalCost = costBeforeDiscount;
            }
        }
        else
        {
            typeOfCustomerString = "Enterprise";
            /* Step 5B: calculate the monthly cost of electricity for an enterprise customer with the number of hours that the customer provided, and the rate given in the pdf*/

            rate = 0.20;
            costBeforeDiscount = (rate * hoursOfElectricity) + baseCostEnterprise;

            /* Step 6B: Ask the customer what they budgeted to spend and capture that into a variable, afterwards determine whether the customer over spent or came in below what they budgeted.
             * If the enterprise customer spent between $400 - $430 or budgeted to only spend between $400 - $430 give them a 5% discount on their total price. */

            System.out.println("What did you budget to spend this month?");
            budgetedToSpendString = scanner.nextLine();
            budgetedToSpend = Integer.parseInt(budgetedToSpendString);

            variance = costBeforeDiscount - budgetedToSpend;

            if ((costBeforeDiscount >= 400 || costBeforeDiscount <= 430 ) || (budgetedToSpend >= 400 || costBeforeDiscount <= 430))
            {
                discount = 0.05;
                discountInDollars = costBeforeDiscount * discount;

                totalCost = costBeforeDiscount - discountInDollars;
            }
            else
            {
                totalCost = costBeforeDiscount;
            }

        }

        /* Step 7: Display the type of customer that they are as well as how much variance there is between
         * their budgeted price, whether you
         * gave them a discount or not, and finally their total price.*/
        output = "Electricity bill for " + typeOfCustomerString + "\n" + "\t You budgeted to spend $" + budgetedToSpend + " and you actually spent $" + costBeforeDiscount;

        //If totalCost == costBeforeDiscount it means that no discount was applied
        if (totalCost == costBeforeDiscount ) {
            output = output +  " the variance of these prices is $" + String.format("%.2f",variance) + "\n" + "\t" + "Your total cost is: $" + String.format("%.2f", totalCost);
        }
        else
        {
            output = output + " the variance of these prices is $" + String.format("%.2f", variance) + "\n"
                    + "\t" + "We therefore gave you a " + (discount * 100) + "% discount. Which lowered your total price by $" + String.format("%.2f", discountInDollars)  + "\n"
                    +"\t" + "Your total cost is now $" + String.format("%.2f", totalCost);
        }

        System.out.print(output);
        //ALL MONETARY VALUES SHOULD BE WRITTEN TO ONLY HAVE 2 DECIMAL PLACES EX:{$500.70}

        /* After you have completed this assignment, and you are happy the results please open up the Assessment 01 after report page */
    }
}
