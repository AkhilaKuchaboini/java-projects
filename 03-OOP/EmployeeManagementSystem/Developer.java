

public class Developer extends Employee
{
    private String programmingLanguage;

    public Developer(int employeeId, String name, double salary,String programmingLanguage)
    {
        super(employeeId,name,salary);
        this.programmingLanguage = programmingLanguage;
    }
     
    public String getProgrammingLanguage()
    {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage)
    {
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
