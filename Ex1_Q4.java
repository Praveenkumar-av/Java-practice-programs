// Program to find the factorial of a given number

import java.util.Scanner;
public class Ex1_Q4 
{
    public static void main(String args[])
    {
        int num, i, result=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = scan.nextInt();
        scan.close();
        for(i=1;i<=num;i++)
        {
            result*=i;
        }
        System.out.println("Factorial :"+result);
    }
}
