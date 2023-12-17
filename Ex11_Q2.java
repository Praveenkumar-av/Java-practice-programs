// File Merger using Streams
// Create a program that merges the contents of multiple text files into a single file 
// using Java streams. The program should accept a list of file names as input, read the
// contents of each file using streams, and then write these contents into a new merged 
// output file. Ensure proper exception handling and file closing mechanisms.

import java.io.*;
import java.util.Scanner;

class Ex11_Q2
{
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        FileInputStream fis;

        FileOutputStream fos = new FileOutputStream("mergedFile.txt");

        int n, i;
        System.out.println("Enter the no. of files :");
        n = scan.nextInt();

        String fnames[] = new String[n];

        System.out.println("Enter the file names :");
        for(i=0;i<n;i++)
        {
            fnames[i] = scan.next().trim();
        }

        int ch;
        for(i=0;i<n;i++)
        {
            try
            {
                fis = new FileInputStream(fnames[i]);
            }
            catch(FileNotFoundException fe)
            {
                System.out.println("File not found");
                continue;
            }
            while(fis.available() != 0)
            {
                ch = (char)fis.read();
                fos.write(ch);
            }
            fis.close();
        }

        fos.close();
    }
}