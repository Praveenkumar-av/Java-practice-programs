// Given a sentence, check if it has vowels in it.

import java.util.Scanner;
public class Ex1_Q10 
{
    public static void main(String args[])
    {
        String s;
        char ch;
        int i=0, flag=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        s = scan.nextLine();
        scan.close();
        int n = s.length();
        for(i=0;i<n;i++)
        {
            ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Vowels found");
        }
        else 
        {
            System.out.println("Vowels not found");
        }
    }
}
