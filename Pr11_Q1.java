// Operations in files

import java.io.*;
import java.util.ArrayList;

class Pr11_Q1
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fis;
        try
        {
            fis = new FileInputStream("text1.txt");
        }
        catch(FileNotFoundException fe)
        {
            System.out.println("File not found");
            return;
        }

        ArrayList<String> arl1 = new ArrayList<>();
        ArrayList<Double> arl2 = new ArrayList<>();
        
        StreamTokenizer input = new StreamTokenizer(fis);
        int tok;
        while((tok = input.nextToken()) != StreamTokenizer.TT_EOF)
        {
            if(tok == StreamTokenizer.TT_WORD)
            {
                arl1.add(input.sval);
            }
            else if(tok == StreamTokenizer.TT_NUMBER)
            {
                arl2.add(input.nval);
            }
        }

        System.out.println("Words :");
        for(String s : arl1)
            System.out.print(s+" ");

        System.out.println("Numbers :");
        for(Double f : arl2)
            System.out.print(f+" ");

        fis.close();
    }
}