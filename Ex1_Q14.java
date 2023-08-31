// Check if two strings are anagrams (contain the same characters but in a different order).

import java.util.Arrays;
import java.util.Scanner;
class Ex1_Q14
{
    public static void main(String args[])
    {
        String s1, s2;
        int flag=0, i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string :");
        s1 = scan.nextLine();
        System.out.println("Enter second string :");
        s2 = scan.nextLine();

        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr2);

        int n1 = arr1.length;
        int n2 = arr2.length;

        if(n1!=n2)
        {
            flag=1;
        }
        else 
        {
            for(i=0;i<n1;i++)
            {
                if(arr1[i] != arr2[i])
                {
                    flag=1;
                    break;
                }
            }
        }

        if(flag==0)
        {
            System.out.println("The given strings are anagram");
        }
        else
        {
            System.out.println("The given strings are not anagram");
        }
    }
}