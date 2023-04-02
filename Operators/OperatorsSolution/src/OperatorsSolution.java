public class OperatorsSolution {
    public static void main(String[] args) {

        // Background: We will be doing some simple operations in order to teach you about how to use the logical & math operators.
        /* Step 1: using the following math operators add <add>, subtract <subtract>, divide <divide>, and multiply <multiply>; the <num1> variable */

        double num1 = 100;
        int add = 20;
        int subtract = 100;
        double divide = 50;
        int multiply =  500;

        num1 = num1 + add; //ADD <add> TO <num1>
        System.out.println(num1);

        num1 = num1 - subtract; //SUBTRACT <subtract> FROM <num1>
        System.out.println(num1);

        num1 = num1 / divide; //DIVIDE <num1> BY <divide>
        System.out.println(num1);

        num1 = num1 * multiply; //MULTIPLY <num1> BY <multiply>
        System.out.println(num1);

        /* Step 2: Using the following logical operators compare <num1> to <num2>, and print out the results(==, !=, <, <=, >, >=) */
        double num2 = 100;
        boolean comparison = true;

        //SET <comparison> EQUAL TO <num1> EQUALS <num2>

        comparison = (num1 == num2);

        System.out.println("Is num1 equal to num2? " + comparison);

        //SET <comparison> EQUAL TO <num1> NOT EQUAL TO <num2>

        comparison = (num1 != num2);

        System.out.println("Is num1 not equal to num2? " + comparison);

        //SET <comparison> EQUAL TO <num1> LESS THAN <num2>

        comparison = (num1 < num2);

        System.out.println("Is num1 less than num2? " + comparison);

        //SET <comparison> EQUAL TO < num1> LESS THAN OR EQUAL TO <num2>

        comparison = (num1 <= num2);

        System.out.println("Is num1 less than or equal to num2? " + comparison);

        //SET <comparison> EQUAL TO <num1> GREATER THAN <num2>

        comparison = (num1 > num2);

        System.out.println("Is num1 greater than num2? " + comparison);

        //SET <comparison> EQUAL TO <num1> GREATER OR EQUAL TO <num2>

        comparison = (num1 >= num2);

        System.out.println("Is num1 greater or equal to num2? " + comparison);

        /* Step 3: Using the following Operators (&&, ||) and <num2>,<num3>,<num4> and <comparison> determine whether the following statements are true or false */

        double num3 = 110;
        double num4 = 120;

        //SET <comparison> EQUAL TO <num3> GREATER THAN <num2> AND <num3> LESS THAN <num4>

        comparison = ((num3 > num2) && (num3 < num4));

        System.out.println("Is num3 greater than num2 and less than num4? " + comparison);

        //SET <comparison> EQUAL TO <num3> GREATER THAN <num2> OR <num3> GREATER THAN <num4>

        comparison = ((num3 > num2) || (num3 > num4));

        System.out.println("Is num3 greater than num2 or greater than num4? " + comparison);


    }
}