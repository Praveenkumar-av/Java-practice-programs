// Calculate sum of digits of a given number

import java.util.Scanner;
public class Ex1_Q8 
{
    public static void main(String args[])
    {
        int num, sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = scan.nextInt();
        while(num!=0)
        {
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of digits :"+sum);
        scan.close();
    }    
}
