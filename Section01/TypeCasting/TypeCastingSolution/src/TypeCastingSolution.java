//***************************************************************************
//*                      Type Casting Solution
//*
//*             April, 9th 2023 	HelloWorldOfficial
//*
//*     Description: This exercise covers how to change the type of numerical variables
//*     These principals will become important as we get into doing calculations with variables, and correctly receiving
//*     the desired output.
//*
//* Edited: April, 9th 2023	     Version:1
//*
// Edited:HelloWorldOfficial
//*
//*
//***************************************************************************

public class TypeCastingSolution {

    public static void main(String[] args) {

        /* Step 1: Practice changing a "small" data type into a "bigger" data type
         * This is what is known as Widening Primitive Conversion for this exercise try and change the value of the 0 in <small>
           to a number with a decimal (ex: 12.8, 23.5,0.8)*/

        byte smallest = 10; // LEAVE THIS
        int small = (smallest * 0); // LEAVE THIS


        /* Step 2: You may have noticed that there is an error demonstrating that says "required type int, provided type double"
         this is an example of a type error lets try and fix this by declaring a variable <decimal> with a double type
         and setting that to the value */

        double decimal = (smallest * 0);
        System.out.println(decimal);

        // This is an example of widening primitive as you were able to print out the correct value of the decimal by converting
        // your "small" data type into a bigger data type

        double big = 99.8;

        /*Step 3: We are now going to practice Narrowing Primitive Conversion
         * We will do this by creating a simple algorithm that shows us the closets round number */
        System.out.println((int)big);

    }
}