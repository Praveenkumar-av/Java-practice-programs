// Sort an array of integers in ascending order

import java.util.Scanner;
class Ex1_Q13
{
    public static void main(String args[])
    {
        int arr[], i, j, n, temp;
        arr = new int[50];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements :");
        n=scan.nextInt();
        System.out.println("Enter the array elements :");
        for(i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[j] < arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}