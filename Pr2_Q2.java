// Write a Java method that changes the case of every character in a given string,
// demonstrating the transformation from "ORAngE" to "oraNGe" when provided as input 

import java.util.Scanner;
import java.lang.Character;
class Change
{
    static String changeCase(String str)
    {
        int i, n = str.length();
        StringBuffer s = new StringBuffer();
        char ch;
        for(i=0;i<n;i++)
        {
            ch = str.charAt(i);
            if(Character.isLetter(ch))
            {
                if(Character.isLowerCase(ch))
                {
                    s.append(Character.toUpperCase(ch));
                }
                else
                {
                    s.append(Character.toLowerCase(ch));
                }
            }
            else
                s.append(ch);
        }
        return s.toString();
    }
}

class Pr2_Q2
{
    public static void main(String args[])
    {
        String str;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String :");
        str = scan.nextLine();
        System.out.println("String :"+str);

        str = Change.changeCase(str);
        System.out.println("String case changed :"+str);
    }
}