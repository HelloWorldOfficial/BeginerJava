 // STEP 1: import java.util.Scanner to bring in scanner to grab user input
import java.util.Scanner;
 public class UserInputSolution {
    public static void main(String[] args) {

        // STEP 2: Declare a new scanner class
        // ADD SCANNER CLASS NAMED <scanner> HERE
        Scanner scanner = new Scanner(System.in);

        // STEP 3: Declare a variable called <input> that is equal to the scanner
        // ADD A VARIABLE NAMED <input> OF TYPE STRING AND SET TO SCANNER CLASS HERE
        String input = scanner.nextLine();

        // STEP 4: Print your <input> variable to the console
        System.out.println(input);

    }

}
