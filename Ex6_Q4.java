// Develop a Java application that simulates a restaurant with multiple tables. Each table
// represents a potential order that a customer can place, and you want to use multithreading
// to handle the orders concurrently. You have a class called Table that represents each table,
// and a class called Waiter that takes customer orders and serves them.
// You should have a fixed number of tables and a variable number of waiters. The waiters
// should take orders from customers and serve them dishes. Multiple waiters should be able
// to serve different tables simultaneously. Implement the concepts of multithreading and
// synchronization in this scenario.

import java.util.Scanner;

class Table extends Thread
{
    String orders;

    Table(String str)
    {
        orders = str;
    }

    public void run()
    {
        synchronized(orders)
        {
            System.out.println("Order placed: " + orders);
            orders.notify();
        }
    }
}

class Waiter extends Thread 
{
    Table obj;

    Waiter(Table obj)
    {
        this.obj = obj;
    }

    public void run()
    {
        synchronized(obj.orders) 
        {
            try 
            {
                obj.start();
                System.out.println("Waiting for orders");
                obj.orders.wait();
                System.out.println("Orders taken");
            } 
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Delivered");
        }
    }
}

class Ex6_Q4 
{
    public static void main(String args[])
    {
        // Table class Objects
        Table t1 = new Table("Juice");
        Table t2 = new Table("Idli,Sambar");
        Table t3 = new Table("Dosa,sambar");
        Table t4 = new Table("Tea,Biscuit");

        // Waiter class objects 
        Waiter w1 = new Waiter(t1);
        Waiter w2 = new Waiter(t2);
        Waiter w3= new Waiter(t3);
        Waiter w4 = new Waiter(t4);
        Waiter w5 = new Waiter(t1);
        Waiter w6 = new Waiter(t3);
        Waiter w7 = new Waiter(t4);


        w1.start();
        w2.start();
        w3.start();
        w4.start();
        // w5.start();
        // w6.start();
        // w7.start();
    }
}