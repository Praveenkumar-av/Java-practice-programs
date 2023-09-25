package management;
import hr.Employee;

public class Manager extends Employee
{
    public Manager(String name,int employeeId,float salary)
    {
        super(name,employeeId,salary);
    }

    public void calculateSalary()
    {
        int bonus = 500;
        System.out.println("Annual salary :"+((salary+bonus)*12));
    }
}