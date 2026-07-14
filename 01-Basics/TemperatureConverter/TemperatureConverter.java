/*
 * ==========================================================
 * Project    : Temperature Converter
 * Topic      : Java Basics
 * Author     : Akhila Kuchaboini
 *
 * Description:
 * A menu-driven Java console application that converts
 * temperatures between Celsius, Fahrenheit, and Kelvin.
 * The program repeatedly displays a menu, performs the
 * selected conversion, and exits only when the user chooses
 * the Exit option.
 * ==========================================================
 */
import java.util.Scanner;
public class TemperatureConverter 
{
    public static void convertTemp()
    {
        double temperature =0;
        double result = 0;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println(" ======  TEMPERATURE CONVERTER  ======");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Exit");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter temperature in Celsius: ");
                    temperature = sc.nextDouble();
                    result = (temperature * 9 / 5) + 32;
                    System.out.println("Temperature in Fahrenheit: " + result + " °F");
                    break;

                case 2:
                    System.out.println("Enter temperature in Fahrenheit :");
                    temperature = sc.nextDouble();
                    result = (temperature - 32) * 5 / 9;
                    System.out.println("Temperature in Celsius : " + result + " °C");
                    break;

                case 3:
                    System.out.println("Enter temperature in Celsius :");
                    temperature = sc.nextDouble();
                    result = temperature + 273.15;
                    System.out.println("Temperature in Kelvin : " + result + " K");
                    break;

                case 4:
                    System.out.println("Enter temperature in Kelvin :");
                    temperature = sc.nextDouble();
                    result = temperature - 273.15;
                    System.out.println("Temperature in Celsius : " + result + " °C");
                    break;
                
                case 5:
                    System.out.println("Thank you for using the Temperature Converter!");
                    break;

                default :
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
            System.out.println();

        }while(choice != 5);
        sc.close();
    }
    public static void main(String[] args)
    {
        convertTemp();
    }
    
}
