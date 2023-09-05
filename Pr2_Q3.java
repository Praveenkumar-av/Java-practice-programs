// Write a Java method that reverses an Array without using extra space.

import java.util.Scanner;
class MyArray
{
    void reverse(int arr[],int n)
    {
        int i, j, temp;
        for(i=0,j=n-1;i<n/2;i++,j--)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

class Pr2_Q3
{
    public static void main(String args[])
    {
        int arr[], n, i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the no. of elements :");
        n = scan.nextInt();
        arr = new int[n];

        System.out.print("Enter the elements :");
        for(i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }

        MyArray obj = new MyArray();
        obj.reverse(arr,n);

        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}