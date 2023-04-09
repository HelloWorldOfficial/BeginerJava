public class LogicalOperatorsSolution {

    public static void main(String[] args) {
        /* Step 3: Using the following Operators (&&, ||) and <num2>,<num3>,<num4> and <comparison> determine whether the following statements are true or false */

        double num1 = 100;
        double num2 = 110;
        double num3 = 120;
        Boolean comparison = true;
        //SET <comparison> EQUAL TO <num3> GREATER THAN <num2> AND <num3> LESS THAN <num4>

        comparison = ((num2 > num1) && (num2 < num3));

        System.out.println("Is num3 greater than num2 and less than num4? " + comparison);

        //SET <comparison> EQUAL TO <num3> GREATER THAN <num2> OR <num3> GREATER THAN <num4>

        comparison = ((num3 > num1) || (num2 > num3));

        System.out.println("Is num3 greater than num2 or greater than num4? " + comparison);

    }
}
