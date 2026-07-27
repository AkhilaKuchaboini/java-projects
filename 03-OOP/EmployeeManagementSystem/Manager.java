public class Manager extends Employee
{
    private int teamSize;

    public Manager(int employeeId, String name, double salary,int teamSize)
    {
        super(employeeId,name,salary);
        this.teamSize = teamSize;
    }
    public int getTeamSize()
    {
        return teamSize;
    }
    public void setTeamSize(int teamSize)
    {
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Team size:    " + teamSize);
    }
    
}
