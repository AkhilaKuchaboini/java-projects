/*
 * ==========================================================
 * Project    : Student Grade Calculator
 * Topic      : Java Basics
 * Author     : Akhila Kuchaboini
 *
 * Description:
 * A Java console application that calculates a student's
 * total marks, percentage, grade, and pass/fail result
 * based on marks entered for five subjects. The program
 * also validates that marks are between 0 and 100.
 * ==========================================================
 */
import java.util.Scanner;
public class StudentGradeCalculator
{
    public static void calculateGrade()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== STUDENT GRADE CALCULATOR ====");
        System.out.print("Enter marks for Subject 1 :");
        int s1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2 :");
        int s2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3 :");
        int s3 = sc.nextInt();
        System.out.print("Enter marks for Subject 4 :");
        int s4 = sc.nextInt();
        System.out.print("Enter marks for Subject 5 :");
        int s5 = sc.nextInt();
        if((s1 < 0 || s1 > 100) ||
           (s2 < 0 || s2 > 100) ||
           (s3 < 0 || s3 > 100) || 
           (s4 < 0 || s4 > 100) || 
           (s5 < 0 || s5 > 100))
        {
            System.out.println("Invalid marks! Marks should be between 0 and 100");
            sc.close();
            return;
        }
        int total = s1 + s2 + s3 + s4 + s5;
        double percentage = total / 5.0;
        if(percentage <= 100 && percentage >=90)
        {
            System.out.println("====== Result ======");
            System.out.println("Total Marks : " + total);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade : A");
            System.out.println("Result : PASS");
        }
        else if(percentage <= 89 && percentage >=80)
        {
            System.out.println("====== Result ======");
            System.out.println("Total Marks : " + total);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade : B");
            System.out.println("Result : PASS");
        }
        else if(percentage <= 79 && percentage >=70)
        {
            System.out.println("====== Result ======");
            System.out.println("Total Marks : " + total);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade : C");
            System.out.println("Result : PASS");
        }
        else if(percentage <= 69 && percentage >=60)
        {
            System.out.println("====== Result ======");
            System.out.println("Total Marks : "  + total);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade : D");
            System.out.println("Result : PASS");
        }
        else if(percentage <= 59 && percentage >=40)
        {
            System.out.println("====== Result ======");
            System.out.println("Total Marks : " + total);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade : E");
            System.out.println("Result : PASS");
        }
        else
            
        {
            System.out.println("====== Result ======");
            System.out.println("Total Marks : "+ total);
            System.out.println("Percentage : " + percentage + "%");
            System.out.println("Grade : F");
            System.out.println("Result : FAIL");
        }
        sc.close();
    }
    public static void main(String[] args)
    {
        calculateGrade();
    }
}
