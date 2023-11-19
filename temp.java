class Mythread extends Thread 
{
    static int count = 0;
    public void run()
    {
        count++;
        System.out.println("Count :"+count);
    }
}

class temp 
{
    public static void main(String args[])
    {
        Mythread t1 = new Mythread();

        Mythread t2 = new Mythread();

        t1.start();
        t2.start();
        
    }
}