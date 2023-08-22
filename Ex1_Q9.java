// Print Fibonacci series

import java.util.Scanner;
public class Ex1_Q9 
{
    public static void main(String args[])
    {
        int num1 = -1, num2 = 1 ,n, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of terms :");
        n = scan.nextInt();
        scan.close();
        for(int i=0;i<n;i++)
        {
            sum=num1+num2;
            System.out.println(sum);
            num1=num2;
            num2=sum;
        }
    }   
}
