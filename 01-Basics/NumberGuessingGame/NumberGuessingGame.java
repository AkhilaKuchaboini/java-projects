/*
 * ==========================================================
 * Project    : Number Guessing Game
 * Topic      : Java Basics
 * Author     : Akhila Kuchaboini
 *
 * Description:
 * A console-based number guessing game where the
 * computer generates a random number between 1 and 100.
 * The player has five chances to guess the correct number.
 * After each incorrect guess, the program provides a hint
 * whether the guessed number is too high or too low.
 * ==========================================================
 */


import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame 
{
    public static void guessNumber()
    {
        Random random = new Random();
        int actualNum = random.nextInt(100) + 1;
        int chances = 5;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Number Guessing Game =====");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have " + chances + " chances.");
        for(int i = 0; i < chances;i++)
        {
            System.out.println("\nChance " + (i + 1) + " of " + chances);
            System.out.print("Enter your guess: ");
            int guessedNum = sc.nextInt();
            if(guessedNum == actualNum)
            {
                System.out.println("Congratulations! You guessed the number correctly.");
                sc.close();
                return;
            }
            else if(guessedNum < actualNum)
            {
                System.out.println("Too low! Try a higher number.");
            }
            else 
            {
                 System.out.println("Too high! Try a lower number.");
            }
            System.out.println("Remaining chances are: "+ (chances-i-1));
        }
         sc.close();
        System.out.println("Game Over! The correct number was: "+ actualNum);
       
        
    }
    public static void main(String[] args)
    {
        guessNumber();
    }
}
