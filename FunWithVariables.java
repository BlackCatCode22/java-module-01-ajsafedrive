    // FunWithVariables.java
    // aj 8/14/25
    // References:
    // https://www.w3schools.com/java/java_user_input.asp
    // import statements are at the top of the program

import java.util.Scanner;
public class FunWithVariables {
    public static void main(String[] args) {
        System.out.println("\n\n *** Welcome to my Fun With Variables Program! \n\n");
        // create some int vars named num 1 and num 2
        int num1 = 0;
        int num2 = 0;

        // create a Scanner object named scanner.
        Scanner scanner = new Scanner(System.in);

        // get a value from the user and store it in num 1
        System.out.println("\n Please enter a whole number for num1:");
        num1 = scanner.nextInt();
        // Provide that you got an int from the user
        System.out.println(" num1 = " + num1);
    }
}