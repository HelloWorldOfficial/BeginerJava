//***************************************************************************
//*
//* 						Comparison Operators Exercise
//*
//* 			April 12th, 2023            HelloWorldOfficial
//*
//* Description: This exercise shows you how to do simple mathematical operations (*,-,+,/,%)
//               and then also explains the basics of comparison operators (==,<=,>=,!=)
//*
//*
//* Edited: April 12th, 2023	    Edited:HelloWorldOfficial     Version:1
//*
//*
//*
//***************************************************************************

public class ComparisonOperatorsExercise {
    public static void main(String[] args) {

        // Background: We will be doing some simple operations in order to teach you about how to use the logical & math operators.
        /* Step 1: using the following math operators add <add>, subtract <subtract>, divide <divide>, and multiply <multiply>; the <num1> variable */

        double num1 = 100;
        int add = 20;
        int subtract = 100;
        double divide = 50;
        int multiply =  500;

        //ADD <add> TO <num1>
        System.out.println(num1);

        //SUBTRACT <subtract> FROM <num1>
        System.out.println(num1);

        //DIVIDE <num1> BY <divide>
        System.out.println(num1);

        //MULTIPLY <num1> BY <multiply>
        System.out.println(num1);

        /* Step 2: Using the following logical operators compare <num1> to <num2>, and print out the results(==, !=, <, <=, >, >=) */
        double num2 = 100;
        boolean comparison = true;

        //SET <comparison> EQUAL TO <num1> EQUALS <num2>

        System.out.println("Is num1 equal to num2? " + comparison);

        //SET <comparison> EQUAL TO <num1> NOT EQUAL TO <num2>

        System.out.println("Is num1 not equal to num2? " + comparison);

        //SET <comparison> EQUAL TO <num1> LESS THAN <num2>

        System.out.println("Is num1 less than num2? " + comparison);

        //SET <comparison> EQUAL TO < num1> LESS THAN OR EQUAL TO <num2>

        System.out.println("Is num1 less than or equal to num2? " + comparison);

        //SET <comparison> EQUAL TO <num1> GREATER THAN <num2>

        System.out.println("Is num1 greater than num2? " + comparison);

        //SET <comparison> EQUAL TO <num1> GREATER OR EQUAL TO <num2>

        System.out.println("Is num1 greater or equal to num2? " + comparison);

    }
}