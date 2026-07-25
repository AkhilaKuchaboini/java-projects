
/*
 * ==========================================================
 * Project    : Library Management System
 * Topic      : Object-Oriented Programming (OOP)
 * Author     : Akhila Kuchaboini
 *
 * Description:
 * A menu-driven Java console application that manages a
 * library using object-oriented programming principles.
 * Users can add books, view available books, search by
 * title, issue books, and return books. The project
 * demonstrates classes, objects, constructors,
 * encapsulation, arrays of objects, and menu-driven
 * programming.
 * ==========================================================
 */
import java.util.Scanner;
public class LibraryManagementSystem
{
    public static void main(String[] args)
    {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println(" ===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println(" 1. Add Book ");
            System.out.println(" 2. View Books ");
            System.out.println(" 3. Search Book ");
            System.out.println(" 4. Issue Book ");
            System.out.println(" 5. Return Book ");
            System.out.println(" 6. Exit ");
            System.out.println();
        
            System.out.print(" Enter your choice : ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1 : 
                
                    library.addBook();
                    break;
                
                case 2:
                
                    library.viewBooks();
                    break;
                
                case 3:
                
                    library.searchBook();
                    break;
                
                case 4:
                
                    library.issueBook();
                    break;
                
                case 5:
                
                    library.returnBook();
                    break;
                
                case 6:

                    System.out.println("Thank you for using Library Management System! ");
                    break;

                default :
                System.out.println("Invalid choice.Please enter valid value");
            }

        }while(choice != 6);
        sc.close();
    }
}
