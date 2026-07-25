
import java.util.Scanner;
public class Bank 
{
    private Account[] accounts;
    private int count = 0;
    private Scanner sc = new Scanner(System.in);

    public Bank()
    {
        accounts = new Account[100];
    }
    public void createAccount()
    {
        if(accounts.length == count)
        {
            System.out.println("Bank is full. Cannot create more accounts");
            return ;
        }
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < count; i++ )
        {
            if(accounts[i].getAccountNumber() == accountNumber)
            {
                System.out.println("Account Number already exists ");
                return ;
            }
        }
        System.out.print("Enter AccountHolder Name :");
        String accountHolderName = sc.nextLine();
        System.out.print("Enter Account Type :");
        String accountType = sc.nextLine();
        if(!accountType.equalsIgnoreCase("Savings") && !accountType.equalsIgnoreCase("Current"))
        {
            System.out.println("Invalid account type");
            return ;
        }
        System.out.print("Enter Branch :");
        String accountBranch = sc.nextLine();
        Account acc = new Account(accountNumber, accountHolderName, accountType, accountBranch);
        accounts[count] = acc;
        count++;
        System.out.println("Account created successfully! ");

        

    }
    public void searchAccount()
    {
        System.out.println("Enter Account Number to Search :");
        int accNoSearch = sc.nextInt();
        for(int i = 0;i < count; i++ )
        {
            if(accounts[i].getAccountNumber() == accNoSearch)
            {
                accounts[i].displayAccount();
                return;
            }
        }
        System.out.println("Account not found");

    }
    public void depositMoney()
    {
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        for(int i = 0 ;i < count ; i ++)
        {
            if(accounts[i].getAccountNumber() == accountNumber)
            {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                accounts[i].deposit(amount);
                return ; 
            }
        }
        System.out.println("Account not found");
    }
    public void withdrawMoney()
    {
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        for(int i = 0 ;i < count ; i ++)
        {
            if(accounts[i].getAccountNumber() == accountNumber)
            {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                accounts[i].withdraw(amount);
                return ; 
            }
        }
        System.out.println("Account not found");
    }
    public void viewAccounts()
    {
        if(count == 0)
        {
            System.out.println("No Accounts to view");
            return ;
        }
        for(int i = 0; i < count; i++)
        {
            accounts[i].displayAccount();
            System.out.println("------------------------------------");
        }
        
    }
}
