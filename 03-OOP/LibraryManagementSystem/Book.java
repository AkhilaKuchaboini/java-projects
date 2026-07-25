
public class Book
{
    private String title;
    private String author;
    private double price;
    private boolean isIssued;

    public Book(String title,String author,double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isIssued = false;
    }
     
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }
    public boolean isIssued()
    {
        return isIssued;
    }
    public void setPrice(double price)
    {
        if(price > 0)
        {
            this.price = price;
        }
        else
        {
            System.out.println("Invalid price");
        }
    }
    public void setIsIssued(boolean isIssued)
    {
        this.isIssued = isIssued;
    }
    public void displayBook()
    {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price " + price);
        System.out.println("Status : " + (isIssued ? "Issued" : "Available"));
    }
}
