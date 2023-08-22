import java.util.Arrays;
import java.util.Scanner;
public class temp 
{
    public static void main(String args[])
    {
        String s = "praveen";
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String s2 = new String(arr);
        System.out.println(s2);
    }
}
