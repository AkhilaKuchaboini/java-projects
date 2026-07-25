

public class Account
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private String accountBranch;
    
    
    public Account(int accountNumber,String accountHolderName,String accountType,String accountBranch)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
        this.accountType = accountType;
        this.accountBranch = accountBranch;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public double getBalance()
    {
        return balance;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public String getAccountBranch()
    {
        return accountBranch;
    }
    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName = accountHolderName;
    }
    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }
    public void setAccountBranch(String accountBranch)
    {
        this.accountBranch = accountBranch;
    }
    public void deposit(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Amount cannot be deposited");
            return ;
        }
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
        System.out.println("Current Balance: ₹" + balance);
    }
    public void withdraw(double amount)
    {
        if(amount <= 0 )
        {
            System.out.println("Invalid withdrawal amount.");
            return ;
        }
        if(amount > balance)
        {
            System.out.println("Insufficient Balance");
            return ;
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
        System.out.println("Current Balance: ₹" + balance);
    }
    public void displayAccount()
    {
        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Branch         : " + accountBranch);
        System.out.println("Balance        : ₹" + balance);
    }
}
