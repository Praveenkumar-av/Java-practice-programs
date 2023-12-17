// CSV Data Processing
// Develop a Java program to process a CSV file containing student records. Read the CSV
// file using streams, parse its content to extract student data (e.g., name, ID, grades),
// perform calculations such as finding the average grade for each student, and then output
// this information into a new CSV file.

import java.io.*;
import java.util.*;
class Ex11_Q3
{
    public static void main(String args[])
    {
        Scanner scan = null;
        try
        {
            scan = new Scanner(new File("C:\\Users\\Admin\\Documents\\python\\csv1.csv"));
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found");
        }

        scan.useDelimiter(",");
        scan.nextLine();
        StringTokenizer st;
        double sum=0;
        while(scan.hasNextLine())
        {
            sum=0;
            st = new StringTokenizer(scan.nextLine(),",");
            st.nextToken();
            while(st.hasMoreTokens())
                sum += Integer.parseInt(st.nextToken());
            System.out.println("Average :"+sum/3);
        }

        scan.close();
    }
}