package hr;

public class Employee
{
    protected String name;
    protected int employeeId;
    protected float salary;

    public Employee(String name,int employeeId,float salary)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void calculateSalary()
    {
        System.out.println("Annual salary :"+(12*salary));
    }
}