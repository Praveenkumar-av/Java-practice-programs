// Get n digit number from the user and check if the number is a palindrome

import java.util.Scanner;
public class Ex1_Q6 
{
    public static void main(String args[])
    {
        int num, i, revnum=0, copy, n=0, rem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = scan.nextInt();
        scan.close();
        copy=num;
        while(copy!=0)
        {
            n++;
            copy/=10;
        }
        copy=num;
        for(i=0;i<n;i++)
        {
            rem=copy%10;
            revnum = (revnum*10)+rem;
            copy/=10;
        }
        System.out.println("Reversed num :"+revnum);
        if(num==revnum)
        {
            System.out.println("Number is palindrome");
        }
        else 
        {
            System.out.println("Number is nor palindrome");
        }
    } 
}
