 // STEP 1: import java.util.Scanner to bring in scanner to grab user input
import java.util.Scanner;
 public class UserInputSolution {
    public static void main(String[] args) {

        /* STEP 1: Declare a new scanner class */

        Scanner scanner = new Scanner(System.in);// ADD SCANNER CLASS NAMED <scanner> HERE

        /* STEP 2: Declare a variable called <input> that is equal to the scanner */

        System.out.println("Say whatever you want and I will display it to the console: ");

        String input = scanner.nextLine(); // ADD A VARIABLE NAMED <input> OF TYPE STRING AND SET TO SCANNER CLASS HERE

        /* STEP 3: Print your <input> variable to the console */
        System.out.println(input);

        /* STEP 4: Capture a users numerical input */

        System.out.println("Enter a number: "); //ADD A {System.out.println} STATEMENT ASKING USER TO INPUT THEIR NUMBER
        int integerInput = scanner.nextInt(); //ADD A VARIABLE <integerInput> AND SET IT EQUAL TO YOUR {scanner.NextInt()} TO GRAB THE INT

        /* STEP 5: Use the modulo operator to, so you can see if the number is odd or even */

        boolean oddOrEven; //ADD A <oddOrEven> VARIABLE OF TYPE BOOLEAN
        oddOrEven = ((integerInput % 2) == 0); //COMPUTE <oddOrEven> MODULO 2 AND USING EQUALITY OPERATOR DETERMINE IF THAT NUMBER IS ODD OR EVEN

        /* STEP 6: Print out whether your number is odd or even */

        System.out.println("Your number is even is this true or false? " + oddOrEven);

    }

}
