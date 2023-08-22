// Check if a given number is armstrong number

import java.util.Scanner;
import java.lang.Math;
public class Ex1_Q7 
{
    public static void main(String args[])
    {
        int num, nd=0, copy, i, sum=0, rem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = scan.nextInt();
        scan.close();
        copy=num;
        while(copy!=0)
        {
            nd++;
            copy/=10;
        }
        copy=num;
        for(i=0;i<nd;i++)
        {
            rem=copy%10;
            sum += Math.pow(rem,nd);
            copy/=10;
        }
        if(num == sum)
        {
            System.out.println("Armstrong number");
        }
        else 
        {
            System.out.println("Not a armstrong number");
        }
    }   
}
