import engineering.Engineer;
import management.Manager;

class Ex4_Q2
{
    public static void main(String args[])
    {
        // object for Engineer class
        Engineer e1 = new Engineer("Engineer 1",1001,12000f);
        e1.calculateSalary();

        // object for Manager class
        Manager m1 = new Manager("Manager 1",2001,12000f);
        m1.calculateSalary();
    }
}