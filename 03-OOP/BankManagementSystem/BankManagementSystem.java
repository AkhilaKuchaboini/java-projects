
/*
 * ==========================================================
 * Project    : Bank Management System
 * Topic      : Object-Oriented Programming (OOP)
 * Author     : Akhila Kuchaboini
 *
 * Description:
 * A menu-driven Java console application that simulates
 * a basic banking system using object-oriented programming
 * principles. The application allows users to create bank
 * accounts, search accounts by account number, deposit
 * money, withdraw money, and view all account details.
 *
 * The project demonstrates classes, objects, constructors,
 * encapsulation, arrays of objects, validation, and
 * menu-driven programming.
 * ==========================================================
 */
import java.util.Scanner;
public class BankManagementSystem 
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println(" ===== BANK MANAGEMENT SYSTEM ===== ");
            System.out.println(" 1. Create Account ");
            System.out.println(" 2. View All Accounts ");
            System.out.println(" 3. Search Account ");
            System.out.println(" 4. Deposit Money ");
            System.out.println(" 5. Withdraw Money ");
            System.out.println(" 6. Exit ");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    bank.createAccount();
                    break;
                case 2:
                    bank.viewAccounts();
                    break;
                case 3:
                    bank.searchAccount();
                    break;
                case 4:
                    bank.depositMoney();
                    break;
                case 5:
                    bank.withdrawMoney();
                    break;
                case 6:
                    System.out.println("Thank you for using Bank Management System! ");
                    break;
                default :
                   System.out.println(" Invalid choice! Please enter a number between 1 and 6 ");

            }
            System.out.println();
        }while(choice != 6);
        sc.close();
    }
}
