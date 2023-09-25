package engineering;
import hr.Employee;

public class Engineer extends Employee
{
    public Engineer(String name,int employeeId,float salary)
    {
        super(name,employeeId,salary);
    }
    
    public void calculateSalary()
    {
        int overtime = 1000;
        System.out.println("Annual salary :"+((salary+overtime)*12));
    }
}