// Program to swap two numbers without using third variable in Java

import java.lang.Math;
import java.util.Scanner;
class Ex1_Q1
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a :");
        a=scan.nextInt();
        System.out.print("Enter b :");
        b=scan.nextInt();
        b=a+b;
        a=Math.abs(b-a);
        b=Math.abs(a-b);
        System.out.println("a :"+a+"\nb :"+b);
        scan.close();
    }
}