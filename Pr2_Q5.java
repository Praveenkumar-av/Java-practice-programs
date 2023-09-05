/* Define a Person class with attributes like name and age. Implement methods to compare
 two Person objects based on their ages.
 Input
    Person 1 - Jane
    Age - 20
    Person 2 - Jack
    Age - 25
 Output
    Jack is elder than Jane by 5 years  */

import java.util.Scanner;
class Person
{
    String name;
    int age;

    void compare(Person obj1,Person obj2)
    {
        if(obj1.age > obj2.age)
        {
            System.out.println(obj1.name+" is elder than "+obj2.name+" by "+(obj1.age - obj2.age));
        }
        else
        {
            System.out.println(obj2.name+" is elder than "+obj1.name+" by "+(obj2.age - obj1.age));
        }
    }
}

class Pr2_Q5
{
    public static void main(String args[])
    {
        Person p1 = new Person();
        Person p2 = new Person();
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the name of person 1 :");
        p1.name = scan.nextLine();
        System.out.print("Enter the age of person 1 :");
        p1.age = scan.nextInt();
        
        scan.nextLine();
        System.out.print("Enter the name of person 2 :");
        p2.name = scan.nextLine();
        System.out.print("Enter the age of person 2 :");
        p2.age = scan.nextInt();

        p1.compare(p1,p2);
    }
}