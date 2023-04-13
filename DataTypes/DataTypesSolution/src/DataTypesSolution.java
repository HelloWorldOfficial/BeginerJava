//***************************************************************************
//*
//* 					Data Types Solution
//*
//* 			April 12th, 2023          HelloWorldOfficial
//*
//* Description: This program covers data types as well as how to use the System.out.println method
//*
//*
//* Edited: April 12th, 2023	    Edited: HelloWorldOfficial     Version: 1
//*
//*
//*
//***************************************************************************
public class DataTypesSolution {
    public static void main(String[] args) {


        //Step 1. Declare your variables
        String name = "<YOUR NAME>";// ADD YOUR <name> HERE
        double age = 0.0; //ADD YOUR <age> AS A DECIMAL EX. 22.5
        int month = 0; //ADD TODAY'S <month> HERE
        int day = 0; //ADD TODAY'S <day> HERE
        int year = 0; // ADD THE <year> OF TODAY HERE
        boolean yearlyGoal = true;//ADD A <boolean> WITH TYPE TRUE

        //Step 2. Print your variables
        System.out.println("Hello my name is " + name);
        System.out.println("Today I am " + age + " year's old.");
        System.out.println("On today's date of " + month +'/' + day + '/' + year);
        System.out.println("I am learning how to code!");
        System.out.println("I will learn how to code this year! This statement is: " + yearlyGoal);

        //Step 3 : Add a goal for how long you will spend going through the material from this program every week
        final int hoursToComplete = 20; //ADD <hoursToComplete> AS A FINAL INTEGER WITH THE VALUE SET TO 1000
        double hours = 0; //ADD THE AMOUNT OF HOURS YOU ARE GOING TO SPEND ON THIS PROGRAM

        System.out.println("If I spend " + hours + " every week it will take " + (hoursToComplete / hours)
                + " weeks to complete this course"); //ADD A {System.out.println} STATEMENT THAT DIVIDES HOURS TO COMPLETE BY HOURS



    }
}