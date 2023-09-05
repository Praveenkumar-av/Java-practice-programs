// Create a Java class that represents a calculator. Implement methods for basic arithmetic 
// operations such as addition, subtraction, multiplication, and division.

import java.util.Scanner;
class Calculator
{
    float add(float x,float y)
    {
        return (x+y);
    }

    float subtract(float x,float y)
    {
        return (x-y);
    }

    float multiple(float x,float y)
    {
        return (x*y);
    }

    float divide(float x,float y)
    {
        return (x/y);
    }
}

class Pr2_Q4
{
    public static void main(String args[])
    {
        Calculator obj = new Calculator();
        Scanner scan = new Scanner(System.in);

        float a, b;
        int choice;

        System.out.print("Enter 1 to add, 2 to subtract, 3 to multiply, 4 to divide and 0 to exit :");
        choice = scan.nextInt();
        while(choice != 0)
        {
            System.out.print("Enter first number :");
            a = scan.nextFloat();
            System.out.print("Enter second number :");
            b = scan.nextFloat();

            switch(choice)
            {
                case 1:
                    System.out.println("Addition of "+a+" and "+b+" :"+obj.add(a,b));
                    break;
                case 2:
                    System.out.println("Subtraction of "+a+" and "+b+" :"+obj.subtract(a,b));
                    break;
                case 3:
                    System.out.println("Multiplication of "+a+" and "+b+" :"+obj.multiple(a,b));
                    break;
                case 4:
                    System.out.println("Division of "+a+" and "+b+" :"+obj.divide(a,b));
                    break;
                default :
                    System.out.println("Invalid option!");
            }
            System.out.print("\nEnter 1 to add, 2 to subtract, 3 to multiply, 4 to divide and 0 to exit :");
            choice = scan.nextInt();
        }
    }
}