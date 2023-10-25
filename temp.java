class A extends Thread
{
    public void run()
    {
        System.out.println("Thread A");
        this.notify();
    }
}

class temp
{
    public static void main(String[] args)
    {
        A obj = new A();
        Thread t1 = new Thread(obj);
        t1.start();
    
        try { t1.wait(); } catch(Exception e) { System.out.println(e); }
        System.out.println("Main Thread");
    }
}