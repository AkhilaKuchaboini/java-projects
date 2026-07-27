import java.util.Scanner;

public class EmployeeManagement 
{
    private Employee[] employees;
    private int count;
    private Scanner sc = new Scanner(System.in);

    public EmployeeManagement()
    {
        employees = new Employee[100];
    }
    public void addEmployee()
    {
        if(count == employees.length)
        {
            System.out.println("Employee list is full.Cannot create a new employee! ");
            return ;
        }
        System.out.println("==== EMPLOYEE TYPE ==== ");
        System.out.println("1. Manager ");
        System.out.println("2. Developer ");
        System.out.print("Enter employee type :");
        int empType = sc.nextInt();
        System.out.print("Enter employee Id:");
        int employeeId = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i < count ; i++)
        {
            if(employees[i].getEmployeeId() == employeeId)
            {
                 System.out.println("Employee Id already exists.Cannot create a employee with this id ");
                return ;
            }
        }
        System.out.print("Enter Employee name: ");
        String name = sc.nextLine();
        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();
        Employee emp ;
        if(empType == 1)
        {
            System.out.println("Enter Team size: ");
            int teamSize = sc.nextInt();
            emp = new Manager(employeeId,name,salary,teamSize);
        }
        else if(empType == 2)
        {
            sc.nextLine();
            System.out.println("Enter Programming Language: ");
            String programmingLanguage = sc.nextLine();
            emp = new Developer(employeeId,name,salary,programmingLanguage);
        }
        else
        {
            System.out.println("Invalid employee type. ");
            return ;
        }
        employees[count] = emp;
        count++;
        System.out.println("Employee added successfully!");
    }
    
    public void viewEmployees()
    {
        if(count == 0)
        {
            System.out.println("Employees list is empty! ");
            return ;
        }
        for(int i = 0;i < count ; i++)
        {
            employees[i].displayDetails();
            System.out.println("------------------------------------------------");
        }
    }
    public void searchEmployee()
    {
        System.out.println("Enter employee id to search: ");
        int empId = sc.nextInt();
        for(int i = 0; i < count ;i++)
        {
            if(employees[i].getEmployeeId() == empId)
            {
                employees[i].displayDetails();
                return ;
            }
        }
        System.out.println("Employee not found! ");
    }

}
