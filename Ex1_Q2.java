// Program to check if the given number is a prime number or not

import java.util.Scanner;
public class Ex1_Q2 
{
    public static void main(String args[])
    {
        int num, i, flag=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        num=scan.nextInt();
        scan.close();
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime number");
        }
        else 
        {
            System.out.println("Not a prime number");
        }
    }
}
