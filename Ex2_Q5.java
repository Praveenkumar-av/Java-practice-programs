//  Student Information System
// Design a class Student with attributes like name, roll number, and grades. Create an array of
// Student objects to manage student information. Implement methods to add students, find a
// student by roll number, calculate the average grade, and display student details.

import java.util.Scanner;
class Student
{
    String name, rollNo;
    int grade;
    static float sum = 0f;

    void addStudent(String name,String rollNo,int grade)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
        sum += grade;
    }

    static void findStudent(Student s[],int n,String rollNo)
    {
        int i;
        boolean flag = false;
        for(i=0;i<n;i++)
        {
            if(rollNo.equals(s[i].rollNo))
            {
                System.out.println("Name :" + s[i].name);
                System.out.println("Roll No :" + s[i].rollNo);
                System.out.println("Grade :" + s[i].grade);
                flag = true;
            }
        }
        if(!flag)
            System.out.println("Student not found");
    }

    static void display(Student s[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println((i+1)+". Name :" + s[i].name);
            System.out.println((i+1)+". Roll No :" + s[i].rollNo);
            System.out.println((i+1)+". Grade :" + s[i].grade);  
            System.out.println((i+1)+". Average Grade :" + (sum/n));  
        }
    }
}

class Ex2_Q5
{
    public static void main(String args[])
    {
        Student s[] = new Student[30];

        int n = 0;
        Scanner scan = new Scanner(System.in);
        String name, roll;
        int grade, choice = 1;

        while(choice != 0)
        {
            System.out.print("Enter the choice 1 to add, 2 to find, 3 to display and 0 to exit :");
            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                    scan.nextLine();
                    System.out.println("Enter the name :");
                    name = scan.nextLine();
                    System.out.println("Enter the Roll number :");
                    roll = scan.next();
                    System.out.println("Enter the Grade :");
                    grade = scan.nextInt();
                    s[n] = new Student();
                    s[n].addStudent(name,roll,grade);
                    n++;
                    break;    

                case 2 :
                    scan.nextLine();
                    System.out.println("Enter the roll number of student to find :");
                    roll = scan.next();
                    Student.findStudent(s,n,roll);
                    break;

                case 3:
                    Student.display(s,n);
                    break;

                default :
                    if(choice != 0)
                        System.out.println("Invalid!");
            }
        }
    }
}