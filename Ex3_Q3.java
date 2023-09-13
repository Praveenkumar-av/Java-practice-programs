/* Create a base class called `Employee` with attributes like `name`, `employeeId`, and `salary`.
Implement a method called `calculateSalary()` in the `Employee` class that calculates the annual
salary. Then, create subclasses like `Manager` and `Engineer`, which inherit from the
`Employee` class. Override the `calculateSalary()` method in each subclass to include specific
calculations. For example, `Manager` might include a bonus calculation, and `Engineer` could
have an overtime pay calculation. Demonstrate how you can create instances of these subclasses
and calculate their salaries. */

class Employee
{
    String name, employeeId;
    float salary;
    
    void calculateSalary()
    {
        System.out.println("Salary :"+salary);
    }
}

class Manager extends Employee
{
    Manager(String name,String id,float salary)
    {
        this.name = name;
        this.employeeId = id;
        this.salary = salary;
    }
    
    void calculateSalary()
    {
        System.out.println("Your salary with bonus is :"+(salary+1000));
    }
}

class Engineer extends Employee
{
    Engineer(String name,String id,float salary)
    {
        this.name = name;
        this.employeeId = id;
        this.salary = salary;
    }
    
    void calculateSalary()
    {
        System.out.println("Your salary with extra time is :"+(salary+1500));
    }
}

class Ex3_Q3
{
    public static void main(String args[])
    {
        Manager m1 = new Manager("Manager","12m123",20000);
        m1.calculateSalary();

        Engineer e1 = new Engineer("Engineer","12e123",25000);
        e1.calculateSalary();
    }
}