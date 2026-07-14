/*
 * Project : Calculator
 * Topic : Java Basics
 * Author : Akhila Kuchaboini
 * Description: A menu-driven calculator that performs basic arithmetic operations.
 */
import java.util.Scanner;

public class Calculator
 {

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int choice;
        double num1 = 0, num2 = 0, result;

        do 
        {

            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            //Take numbers only if the user selected an operation
            if(choice>=1 && choice<=5)
            {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
            }

            switch (choice) {

                case 1:
                   
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                    }
                     else {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    }
                    break;

                case 5:
                    
                    if (num2 == 0) {
                        System.out.println("Modulo by zero is not allowed.");
                    }
                     else {
                        result = num1 % num2;
                        System.out.println("Result = " + result);
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Calculator!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
