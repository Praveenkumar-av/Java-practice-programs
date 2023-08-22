// Find the second largest number in an array

import java.util.Scanner;
public class Ex1_Q5
{   
    public static void main(String args[])
    {
        int arr[], i, n, j, temp;
        arr = new int[50];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no. of values :");
        n = scan.nextInt();
        System.out.println("Enter the values :");
        for(i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        scan.close();
        for(i=0;i<2;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[j] > arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second largest element :"+arr[1]);
    }
}
