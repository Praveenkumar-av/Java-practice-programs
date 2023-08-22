// Check if a list of integers contains only odd numbers in Java, if so print yes else no

import java.util.Scanner;
class Ex1_Q3
{
    public static void main(String args[])
    {
        int arr[], i, n, flag=0;
        arr = new int[20];
        System.out.println("Enter no. of values :");
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        System.out.println("Enter the values :");
        for(i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        scan.close();
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
    }
}