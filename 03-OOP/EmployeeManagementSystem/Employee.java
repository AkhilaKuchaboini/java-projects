public class Employee
{
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        if(salary <= 0)
        {
            System.out.println("Please enter valid salary");
            return ;
        }
        this.salary = salary;
    }
    public void displayDetails()
    {
        System.out.println(" ===== EMPLOYEE DETAILS =====");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Name:        " + name);
        System.out.println("Salary:      " + salary);
    }
    
}
