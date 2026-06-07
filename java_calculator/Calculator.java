package java_calculator;
import java.util.Scanner;
import java.util.Scanner;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {

        // Step 1: Scanner object banaya input lene ke liye

        Scanner sc = new Scanner(System.in);

        // Step 2: User se first number lo

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Step 3: User se second number lo

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Step 4: Operation choose karne ko bolo

        System.out.println("Choose operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        // Step 5: Switch case se calculation
        
        switch (choice) {

            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close(); // Scanner close
    }
}

