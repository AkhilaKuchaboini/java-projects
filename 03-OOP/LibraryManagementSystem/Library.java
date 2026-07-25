
import java.util.Scanner;
public class Library
{
    private Book[] books;
    private int count;
    private Scanner sc = new Scanner(System.in);
    public Library()
    {
        count = 0;
        books = new Book[10];
    }
    public void addBook()
    {
        if(count == books.length)
        {
            System.out.println("Library is full,cannot add books");
            return;
        }
        
            System.out.println("Enter book title");
            String title = sc.nextLine();
            System.out.println("Enter book author"); 
            String author = sc.nextLine();
            System.out.println("enter book price");
            double price = sc.nextDouble();
            while(price <= 0)
            {
                 System.out.print("Invalid price! Enter a positive price: ");
                 price = sc.nextDouble();
            }
            sc.nextLine();
            Book book = new Book(title, author, price) ;
            books[count] = book;
            count++;
            System.out.println("Book added successfully");

        
    }

    public void viewBooks()
    {
        if(count == 0)
        {
            System.out.println("No books available in the library.");
            return;
        }

         System.out.println("===== BOOKS IN THE LIBRARY =====");

         for(int i = 0; i < count; i++)
         {
             books[i].displayBook();
             System.out.println("----------------------------------------");
         }
    }
    public void searchBook()
    {
        if(count  == 0)
        {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("Enter book title to search ");
        String searchTitle = sc.nextLine();
        for(int i = 0;i < count; i++)
        {
            if(books[i].getTitle().equalsIgnoreCase(searchTitle))
            {
                 books[i].displayBook();
                 return ;
            }
        }
        System.out.println("Book not found");
        return ;
    }
    public void issueBook()
    {
        if(count  == 0)
        {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("Enter book title to issue");
        String bookTitle = sc.nextLine();
        for(int i = 0;i < count; i++)
        {
            if(books[i].getTitle().equalsIgnoreCase(bookTitle))
            {
                 if(books[i].isIssued())
                 {
                    System.out.println("Book is already issued");
                    return ;
                 }
                 books[i].setIsIssued(true);
                 System.out.println("Book issued successfully");
                 return ;
            }
        }
        System.out.println("Book not found");
        return ;


    }
    public void returnBook()
    {
        if(count == 0)
        {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("Enter the book to return");
        String bookReturn = sc.nextLine();
        for(int i = 0;i < count; i++)
        {
            if(books[i].getTitle().equalsIgnoreCase(bookReturn))
            {
                 if(books[i].isIssued())
                 {
                    System.out.println("Book is returned succesfully ");
                    books[i].setIsIssued(false);
                    return ;
                 }
                 else
                 {
                    System.out.println("Book is already available in the library.");
                 }
                return;
            }
            
        }
        System.out.println("Book not found");
        return ;
    }

}
