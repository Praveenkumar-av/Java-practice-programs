// Employee Management System
// Design a class Employee with attributes like name, id, and salary. Create an array of Employee
// objects to manage employee information. Implement methods to add employees, find an
// employee by ID, and display all employees.

import java.util.Scanner;
class Employee
{
    String name;
    int id, salary;

    Employee(String name,int id,int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void addEmployee(String name,int id,int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    static void findEmployee(Employee e[],int n,int id)
    {
        int i;
        boolean flag = false;
        for(i=0;i<n;i++)
        {
            if(e[i].id == id)
            {
                System.out.println("Employee name :"+e[i].name);
                System.out.println("Employee id :"+e[i].id);
                System.out.println("Employee salary :"+e[i].salary);
                flag = true;
            }
        }
        if(!flag)  
            System.out.println("Employee not found");
    }

    static void display(Employee e[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println((i+1)+" .Employee name :"+e[i].name);
            System.out.println((i+1)+" .Employee id :"+e[i].id);
            System.out.println((i+1)+" .Employee salary :"+e[i].salary);
        }
    }
}

class Ex2_Q3
{
    public static void main(String args[])
    {
        Employee e[] = new Employee[20];

        e[0] = new Employee("Raju",301,15000);
        e[1] = new Employee("Ram",302,13000);
        e[2] = new Employee("Raju",303,19000);
        
        int n = 3, id, sal, choice = 1;

        Employee.display(e,n);
        String name;
        Scanner scan = new Scanner(System.in);

        while(choice != 0)
        {
            System.out.print("Enter the choice 1 to add employee, 2 to find by id, 3 to display, 0 to exit :");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    scan.nextLine();
                    System.out.println("Enter the name of the Employee :");
                    name = scan.nextLine();
                    System.out.println("Enter the id of the Employee :");
                    id = scan.nextInt();
                    System.out.println("Enter the salary of the Employee :");
                    sal = scan.nextInt();
                    e[n] = new Employee(name,id,sal);
                    n++;
                    Employee.display(e,n);
                    break;
                
                case 2:
                    scan.nextLine();
                    System.out.println("Enter the id of employee :");
                    id = scan.nextInt();
                    Employee.findEmployee(e,n,id);
                    break;

                case 3:
                    Employee.display(e,n);
                    break;

                case 4:
                    if(choice != 0)
                        System.out.println("Invalid");
            }
        }
    }
}