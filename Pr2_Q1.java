// Write a program in Java to calculate the number of times a Single digit ‘D’ appears in a
// number N. You have to take N and D as inputs from the user

import java.util.Scanner;
class Calculate
{
    int digitRepeat(int N,int D)
    {
        int count = 0;
        while(N != 0)
        {
            if((N%10) == D)
                count++;
            
            N /= 10;
        }
        return count;
    }
}

class Pr2_Q1
{
    public static void main(String args[])
    {
        int N, D, count;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Number :");
        N = scan.nextInt();
        System.out.print("Enter the Digit :");
        D = scan.nextInt();

        Calculate obj = new Calculate();
        count = obj.digitRepeat(N,D);
        System.out.println("Count is "+count);
    }
}