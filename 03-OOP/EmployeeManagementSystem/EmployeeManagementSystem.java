/*
 * Project Name : Employee Management System
 *
 * Description:
 * A menu-driven Java application developed using Object-Oriented Programming
 * concepts. The system allows users to add different types of employees,
 * view all employee records, and search employees by their ID.
 *
 * OOP Concepts Used:
 * - Classes and Objects
 * - Encapsulation
 * - Inheritance
 * - Method Overriding
 * - Runtime Polymorphism
 * - Constructors
 * - Arrays of Objects
 *
 * Employee Types:
 * - Manager
 * - Developer
 *
 * Features:
 * - Add Employee
 * - View All Employees
 * - Search Employee by ID
 * - Duplicate Employee ID Validation
 * - Employee Type Selection
 *
 * Developed By: Kuchaboini Akhila
 */
import java.util.Scanner;

public class EmployeeManagementSystem
{
    public static void main(String[] args)
    {
        EmployeeManagement empManagement = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    empManagement.addEmployee();
                    break;

                case 2:
                    empManagement.viewEmployees();
                    break;

                case 3:
                    empManagement.searchEmployee();
                    break;

                case 4:
                    System.out.println("Thank you for using Employee Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while(choice != 4);

        sc.close();
    }
}