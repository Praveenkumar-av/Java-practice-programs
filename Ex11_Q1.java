// File Word Counter
// Write a Java program that reads a text file and counts the occurrences of each word in the 
// file. Utilize streams to read the file and perform the word counting. You can ignore 
// punctuation and consider case insensitive matching (e.g., 'Word' and 'word' should be 
// considered the same). Output the word frequency in ascending order.

import java.io.*;
import java.util.HashSet;
class Ex11_Q1
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis=null;
        try
        {
            fis = new FileInputStream("text1.txt");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        
        StreamTokenizer input = new StreamTokenizer(fis);
        
        HashSet<String> hs = new HashSet<>();
        int tok;
        while((tok = input.nextToken()) != StreamTokenizer.TT_EOF)
        {
            if(tok == StreamTokenizer.TT_WORD)
            {
                hs.add(input.sval.toLowerCase());
            }
        }

        System.out.println("No. of words :"+hs.size());
        for(String s : hs)
            System.out.println(s);
    }
}