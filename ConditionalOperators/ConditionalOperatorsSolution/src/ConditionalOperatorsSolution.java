/***************************************************************************************
 // One way that we can use conditional operators is to calculate a score on an exam
 // For this excercise you will create a program that lets a student know what letter grade their scores were equal to
 // You will need to use the conditional if,else if and else statements to determine what grade the student received
 //**********************************************************************************   */
public class ConditionalOperatorsSolution{
    public static void main(String[] args) {
        double student1 = 79.5;
        double student2 = 60;
        double student3 = 100;
        double student4 = 43;
        double student5 = -10;
        double grade = student1;

        // Step 1: Write out the if branch starting here

        //ADD FIRST /if/ STATEMENT HERE THAT EVALUATES IF STUDENT RECEIVED AN "A" PRINT OUT THE RESULT
        if (grade <= 100) {
            System.out.println("Student has received an A in the class");
        }
        // ADD SECOND CONDITIONAL STATEMENT HERE THAT EVALUATES IF STUDENT RECEIVED A "B" PRINT OUT THE RESULT
        else if (grade < 90) {

            System.out.println("Student has received a B in the class");
        }
        // ADD THIRD CONDITIONAL STATEMENT HERE THAT EVALUATES IF STUDENT RECEVED A "C" PRINT OUT THE RESULT
        else if (grade < 80) {
            System.out.println("Student has received a C in the class");
        }
        // ADD FOURTH CONDITIONAL STATEMENT HERE THAT EVALUATES IF STUDENT RECEIVED A "D" PRINT OUT THE RESULT
        else if (grade < 70) {
            System.out.println("Student has received a D in the class");
        }
        // ADD FINAL CONDITIONAL STATEMENT THAT EVALUATES IF STUDENT DID NOT MEET ANY OF THE CRITERIA AND RECEIVED AN "F" PRINT OUT THE RESULT
        else if (grade < 60) {
            System.out.println("Student has received a F in the class");
        }
        // Is there something that you can do to make sure that this result doesn't get evaluated ?
        else {
            System.out.println("Student has received an invalid grade make sure that the number is not a negative");
        }
        /* The next few steps require you to change the value of <grade> to the different students, in the future we will learn how to be able to use the
         * same variables and not have to change the value of <grade>
         */

        // Step 2: Change the value of <grade> to be that of <student1> write the results here :


        // Step 3: Change the value of <grade> to be that of <student2> write the results here :

        // Step 4: Change the value of <grade> to be that of <student3> write the results here :

        // Step 5: Change the value of <grade> to be that of <student4> write the results here :

        // Step 6: Change the value of <grade> to be that of <student5> write the results here :
        // Is there something that you can do to make sure that this result doesn't get evaluated ?
    }
}
