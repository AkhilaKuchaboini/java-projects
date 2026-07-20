
/*
 * ==========================================================
 * Project    : Student Record Management System
 * Topic      : Arrays
 * Author     : Akhila Kuchaboini
 *
 * Description:
 * A menu-driven Java console application that manages
 * student records using arrays. The program allows users
 * to add students, view all student records, search for
 * a student by name, and display class statistics such as
 * total students, highest marks, lowest marks, and average
 * marks. It also validates user input to ensure reliable
 * execution.
 * ==========================================================
 */
import java.util.Scanner;
public class StudentRecordManagementSystem 
{
    static  Scanner sc = new Scanner(System.in);
    static String[] names ;
    static int[] marks ;
    
    public static void addStudents(int noOfStudents) 
    {
        sc.nextLine();
        for(int i = 0 ;i < noOfStudents; i++)
        {
            System.out.println("Student " + (i+1));
            System.out.print("Enter Student name: ");
            names[i] = sc.nextLine();
            System.out.print("Enter Student marks: ");
            marks[i] = sc.nextInt();
            
            while(marks[i] < 0 || marks[i] > 100)
            {
                 System.out.print("Invalid marks! Enter marks between 0 and 100: ");
                marks[i] = sc.nextInt();
            }
            sc.nextLine();
        }
    }   
    public static void viewStudents() 
    {
        if(names == null || marks == null)
        {
             System.out.println("No student records found. Please add students first.");
             return;
        }
        System.out.println("\n ==== Student List ====");
        for(int i = 0;i < names.length;i++)
        {
            System.out.println((i + 1) + ". Name : " + names[i] );
            System.out.println( "   Marks : " + marks[i]);
        }
    }   

    public static void searchStudent() 
    {
        
        if(names == null || marks == null)
        {
             System.out.println("No student records found. Please add students first.");
             return;
        }
        sc.nextLine();
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;
        for(int i = 0;i < names.length;i++)
        {
             
            if(names[i].equalsIgnoreCase(searchName))
            {
                found = true;
                System.out.println("Student Found!");
                System.out.println( " Name : " + names[i] );
                System.out.println( " Marks : " + marks[i]);
                break;
            }
        }
        if(! found)
        {
            System.out.println("Student not found");
        }
        

    }   

    public static void displayClassStatistics() 
    {
        if(names == null || marks == null)
        {
            System.out.println("No student records found. Please add students first.");
            return;
        }
        System.out.println(" ===== CLASS STATISTICS =====");
        System.out.println("Total Students : " + names.length);
        double average;
        int highest = marks[0], lowest = marks[0];
        int sum = 0;
        for(int mark : marks)
        {
            sum += mark;

            if(mark > highest)
            {
                 highest = mark;
            }

            if(mark < lowest)
            {
              lowest = mark;
            }
}
        average  = (double)sum/marks.length;
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks : " + lowest);
        System.out.printf("Average Marks :  %.2f%n " , average);
    }   

    public static void main(String[] args) 
    {
       
        int choice ;
        do
        {
            System.out.println(" ===== STUDENT RECORD MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Students");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Display Class Statistics");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                     System.out.println("Enter number of students to be added");
                     int noOfStudents = sc.nextInt();
                     if(noOfStudents <= 0)
                     {
                         System.out.println("Number of students must be greater than 0.");
                         break;
                     }
                     if(noOfStudents > 100)
                    {
                        System.out.println("Maximum 100 students are allowed.");
                         break;
                    }
                     names = new String[noOfStudents];
                     marks = new int[noOfStudents];
                     addStudents(noOfStudents);
                     break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayClassStatistics();
                    break;
                case 5:
                    System.out.println(" Thank you for using Student Record Management System!");
                    break;
                default :
                  System.out.println("Invalid choice.Please enter valid choice");

            }
        }while(choice != 5);
        sc.close();
    }
}
