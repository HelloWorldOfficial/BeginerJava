//***************************************************************************
//*
//* 					Logical Operators Solution
//*
//* 			April 14th, 2023            HelloWorldOfficial
//*
//* Description: This program goes over the logical operators AND,OR,NOT {&&,||,!} respectively.
//*
//*
//* Edited: April 14th, 2023    Edited:HelloWorldOfficial     Version:1
//*
//*
//*
//***************************************************************************
public class LogicalOperatorsSolution {

    public static void main(String[] args) {

        double num1 = 100;
        double num2 = 110;
        double num3 = 120;
        Boolean comparison = true;

         /* Step 1: Using the following variables <num1>,<num2>, <num3> and <comparison> determine whether <num2> is greater than <num1> AND <num2> is greater than <num3> */

        comparison = ((num2 > num1) && (num2 < num3)); // COMPARE WHETHER <num2> IS GREATER THAN <num1> AND <num2> IS LESS THAN <num3>

        System.out.println("Is num3 greater than num2 and less than num4? " + comparison);


        /* Step 2: Using the same variables as before determine if <num3> is greater than num1 OR if <num2> is greater than <num3> print out your answer */

        comparison = ((num3 > num1) || (num2 > num3)); // COMPARE WHETHER <num3> IS GREATER THAN <num1> OR IF <num2> IS GREATER THAN <num3> 

        System.out.println("Is num3 greater than num2 or greater than num4? " + comparison);

        /* Step 3: Using the same variables as before determine the inverse of if <num2> is greater than <num1> print your result */
        
        comparison = !(num2 > num1); // EVALUATE THE INVERSE OF THE STATEMENT <num2> IS GREATER THAN <num1>
        
        System.out.println("This is the inverse of num2 being greater than num1 " + comparison);
    }

}
