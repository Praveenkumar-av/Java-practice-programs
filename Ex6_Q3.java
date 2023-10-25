// Write a code to implement Java's multithreading features that allows multiple customers
// to perform transactions on their bank accounts concurrently while ensuring data
// consistency (Bank account shouldn’t have negative balance).

class Bank
{
    private double balance;

    Bank(double bal)
    {
        balance = bal;
    }

    synchronized void withDraw(String name,double amount)
    {
        System.out.println(name+" :");
        if(balance-amount < 0)
        {
            System.out.println("Insufficient Balance!");
        }
        else 
        {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
            checkBalance();
        }
    }

    synchronized void deposit(String name,double amount)
    {
        System.out.println(name+" :");
        balance += amount;
        System.out.println("Amount deposited successfully!");
        checkBalance();
    }

    void checkBalance()
    {
        System.out.println("Available balance :"+balance);
    }
}

class Transactions extends Thread
{
    Bank obj;
    String str, name;
    double amount;

    Transactions(Bank obj,String name, String str, double amount)
    {
        this.obj = obj;
        this.name = name;
        this.str = str;
        this.amount = amount;
    }

    public void run()
    {
        if(str.equals("withdraw"))
        {
            obj.withDraw(name,amount);
        }
        else if(str.equals("deposit"))
        {
            obj.deposit(name,amount);
        }
    }
}

class Ex6_Q3
{
    public static void main(String argsp[])
    {
        Bank b = new Bank(100000);
        
        Transactions t1 = new Transactions(b,"Customer 1","deposit",1000);
        Transactions t2 = new Transactions(b,"Customer 2","withdraw",1000);
        Transactions t3 = new Transactions(b,"Customer 3","deposit",2000);
        Transactions t4 = new Transactions(b,"Customer 4","withdraw",1500);
        Transactions t5 = new Transactions(b,"Customer 5","deposit",100000);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}