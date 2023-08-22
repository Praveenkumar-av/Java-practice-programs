/*  Write a program to reverse the order of words in a given string. For example, 
 if the input is "Hello World", the output should be "World Hello".  */

import java.util.Scanner;
public class Ex1_Q11 
{
    public static void main(String args[])
    {
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        s = scan.nextLine();
        scan.close();
        String arr[] = s.split(" ");  // splits the string at space and return array of strings
        int i, n = arr.length;  
        
        for(i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
