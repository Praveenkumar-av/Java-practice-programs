// Without synchronization, the expected output to the file is a random mixture of "hi" and
// "bye" messages depending upon the sequence in which the two threads are scheduled to
// run by the scheduler (a part of the operating system). Synchronize the code that writes to
// the file using competitive synchronization such that each thread would complete all of its
// writing to the file before the other thread would be allowed to write to the file.
// Accomplish this by putting the whole writing loop in a synchronized block

import java.io.*;

class MyThread extends Thread 
{
    String str;

    MyThread(String str)
    {
        this.str = str;
    }

    public void run()
    {
        synchronized(this)
        {
            for(int i=0;i<10;i++)
            {
                try(FileWriter fw = new FileWriter("text1.txt",true))
                {
                    fw.write(str+"\n");
                    try
                    {
                        Thread.sleep(100);
                    } catch(InterruptedException ie) {}
                }
                catch(IOException e)
                {
                    System.out.println("An error ocurred "+e.getMessage());
                }
            }
        }
    }
}

class Ex6_Q2
{
    public static void main(String args[])
    {
        MyThread t1 = new MyThread("hi");
        MyThread t2 = new MyThread("bye");

        try(FileWriter fw = new FileWriter("text1.txt"))
        {
            fw.write("This is created by Ex5_Q2.java file\n");
        }
        catch(IOException e)
        {
            System.out.println("An error ocurred : "+e.getMessage());
        }

        t1.start();
        t2.start();
    }
}