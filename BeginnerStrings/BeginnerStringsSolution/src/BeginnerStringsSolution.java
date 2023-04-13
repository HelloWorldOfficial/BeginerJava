//***************************************************************************
//*
//* 					Beginner Strings Solution
//*
//* 			April 12th, 2023            HelloWorldOfficial
//*
//*  Description: This exercise goes over some basic operations with Strings. Covers converting Strings into usable
//*               numerical values, the length of Strings, concatenating Strings, Tabs and New lines, and using String.Format.
//*
//* Edited: April 12th, 2023        Edited: HelloWorldOfficial      Version: 1
//*
//*
//*
//***************************************************************************
import java.util.Scanner;
public class BeginnerStringsSolution {
    public static void main(String[] args) {

            /* Step 1: We are going to start out by learning how to change a String value into a numerical value.
        * The code below will grab a string from the user. Declare a variable of type double named <inputDouble>
        * and set that equal to the <input> number */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String input = scanner.nextLine();

        double inputDouble = Double.parseDouble(input);// WRITE CODE HERE

        /* As you may have noticed simply setting <input> to <inputDouble> resulted in a type mismatch error, this is because
        * the input was captured as a String. To fix this set <inputDouble> equal to the Double method for {parseDouble} */

        /* Step 2: Finding the length of a string. In this exercise we will be using a String method */

        String lengthExample = "What is the length of this statement ?";

        int lengthOfStatement = lengthExample.length(); // WRITE YOUR CODE HERE

        System.out.println(lengthOfStatement);

        /* Step 3: Concatenating strings. We will go through two different ways that we can concatenate strings */

        String base = "This is the base string ";
        String additionalString = " and I am the additional string";

        System.out.println(base + additionalString); // ADD THE TWO VARIABLES ABOVE TO CONCATENATE THE STRINGS

        /* There is another way in which we can accomplish the format above by using the {concat} method try that in the
        * print statement below */

        System.out.println(base.concat(additionalString)); //USE THE CONCAT STATEMENT ON THIS PRINT STATEMENT

        /* Step 4: Use the /n and /t character to create a newline and a tab character within the <newLineTab> variable */

        String newLineTab = "First line \n \t this one is is tabbed"; // CHANGE THIS STRING;

        System.out.println(newLineTab);

        /* Step 5: Use the {String.format} method to round up the following decimal to two decimal places */

        double decimal = 10.764;

        String decimalRoundUp = String.format("The number rounded up is %.2f", decimal); // ADD THE {String.Format} METHOD TO THIS LINE TO ROUND UP THE DECIMAL

        System.out.println(decimalRoundUp);

    }
}