// 1. Create a base interface called SalaryCalculator with a method calculateSalary().
// Then, create a base class called Employee that implements the SalaryCalculator
// interface with attributes like name, employeeId, and salary.
// In the Employee class, implement the calculateSalary() method to calculate the annual
// salary based on the provided salary.
// Next, create subclasses like Manager and Engineer, which also implement the
// SalaryCalculator interface, and inherit from the Employee class.
// Override the calculateSalary() method in each subclass to include specific calculations:
// Constraints:
// 1. Manager should include a bonus calculation based on the base salary.
// 2. Engineer could have an overtime pay calculation based on the base salary and
// overtime hours worked.
// Demonstrate how you can create instances of these subclasses and calculate their salaries
// using the calculateSalary() method from the SalaryCalculator interface.

interface SalaryCalculator
{
    void calculateSalary();
}

class Employee implements SalaryCalculator
{
    String name;
    int employeeId;
    float salary;

    Employee(String name,int employeeId,float salary)
    {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void calculateSalary()
    {
        System.out.println("Annual salary is "+(salary*12));
    }
}

class Manager extends Employee implements SalaryCalculator
{
    Manager(String name,int employeeId,float salary)
    {
        super(name,employeeId,salary);
    }

    public void calculateSalary()
    {
        int bonus = 1000;
        System.out.println("Annual salary is "+((salary+bonus)*12));
    }
}

class Engineer extends Employee implements SalaryCalculator
{
    Engineer(String name,int employeeId,float salary)
    {
        super(name,employeeId,salary);
    }

    public void calculateSalary()
    {
        int overtime = 1500;
        System.out.println("Annual salary is "+((salary+overtime)*12));
    }
}

class Ex4_Q1
{
    public static void main(String args[])
    {
        Manager m1 = new Manager("Praveen",1201,12000f);
        m1.calculateSalary();

        Engineer e1 = new Engineer("Joe",1202,12000f);
        e1.calculateSalary();
    }
}