// Create a program that runs two threads which write two different messages a specified
// number of times to the same text file in append mode. For example, thread 1 may write
// "hi" 10 times to the file CompSync.txt and thread 2 may write "bye" 10 times to the same
// file in append mode. Each time the thread writes the message to the file, it sleeps 100
// milliseconds to simulate the end of its time slice. Implement this program with and
// without Synchronization, what difference can you see in both.

import java.io.*;

class MyThread implements Runnable
{
    String str;

    MyThread(String str)
    {
        this.str = str;
    }

    public synchronized void run()
    {
        try(FileWriter fw = new FileWriter("CompSync.txt",true))
        {
            for(int i=0;i<10;i++)
            {
                try 
                {
                    fw.write(str+"\n");
                    Thread.sleep(100);
                }
                catch(InterruptedException ie) {}
            }
        }
        catch(IOException e)
        {
            System.out.println("An error ocurred!");
            e.printStackTrace();
        }
    }
}

class Ex6_Q1
{
    public static void main(String args[])
    {
        MyThread obj1 = new MyThread("hi");
        MyThread obj2 = new MyThread("bye");

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        try(FileWriter fw = new FileWriter("CompSync.txt"))
        {
            fw.write("This is created by Ex5_Q1.java file\n");
        }
        catch(IOException e)
        {
            System.out.println("An error ocurred : "+e.getMessage());
        }

        t1.start();
        t2.start();
    }
}