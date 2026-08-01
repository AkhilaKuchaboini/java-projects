/*
 * Project Name : Online Exam Management System
 *
 * Description:
 * This project demonstrates the concepts of Exception Handling in Java
 * using a real-world Online Exam Management System.
 *
 * Features:
 * - Start Exam
 * - Submit Exam
 * - View Result
 * - Custom Exception Handling
 *
 * Custom Exceptions Used:
 * - ExamAlreadyStartedException
 * - ExamNotStartedException
 * - ExamAlreadySubmittedException
 * - ResultNotAvailableException
 * - InvalidScoreException
 *
 * Concepts Covered:
 * - Classes & Objects
 * - Encapsulation
 * - Custom Exceptions
 * - throw
 * - throws
 * - try-catch
 * - do-while loop
 * - switch-case
 * - Object State Management
 *
 * Author : Kuchaboini Akhila
 */
import java.util.Scanner;

public class OnlineExamManagementSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE EXAM MANAGEMENT SYSTEM =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        Student student = new Student(name);
        int choice;

        do
        {
            System.out.println("\n===== ONLINE EXAM =====");
            System.out.println("1. Start Exam");
            System.out.println("2. Submit Exam");
            System.out.println("3. View Score");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                try
                {
                    student.startExam();
                }
                catch(ExamAlreadyStartedException e)
                {
                    System.out.println(e.getMessage());
                }
                break;

                case 2:
                System.out.print("Enter Score: ");
                int score = sc.nextInt();

                try
                {
                    student.submitExam(score);
                }
                catch(ExamNotStartedException e)
                {
                    System.out.println(e.getMessage());
                }
                catch(ExamAlreadySubmittedException e)
                {
                    System.out.println(e.getMessage());
                }
                catch(InvalidScoreException e)
                {
                    System.out.println(e.getMessage());
                }
                break;

                case 3:
                try
                {
                    student.viewScore();
                }
                catch(ResultNotAvailableException e)
                {
                    System.out.println(e.getMessage());
                }
                break;

                case 4:
                    System.out.println("Thank you for using Online Exam Management System.");
                break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
        }
                    

        }while(choice != 4);
        sc.close();
    }
}