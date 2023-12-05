// Imagine you're developing a gaming application that involves a multiplayer game where players have to guess a
// randomly generated number within a specific range (Get the range from the user). You're using the java.util.Random 
// class to generate the secret number. The game allows multiple players to participate and each player gets only
// three attempts to guess the number. Display a win or lose message at the end based on the result.

import java.util.Scanner;
import java.util.Random;

class guess
{
    int usernum, randnum;
    
    synchronized boolean play(String name,int a,int b)
    {
        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        randnum = rand.nextInt(b-a)+a;

        System.out.print(name+" :Guess a number :");
        usernum = scan.nextInt();

        if(usernum == randnum)
        {
            System.out.println("Correct");
            return true;
        }
        else
        {
            System.out.println("Wrong");
            return false;
        }
    }
}

class game implements Runnable
{
    int start, end;
    guess g;
    boolean win;

    game(guess obj,int start,int end)
    {
        this.start = start;
        this.end = end;
        this.g = obj;
    }

    public void run()
    {
        String name = Thread.currentThread().getName();

        for(int i=0;i<3;i++)
        {
            win = g.play(name,start,end);
            try
            {
                Thread.sleep(200);
            }
            catch(InterruptedException ie) 
            {
                System.out.println("Exception in sleep :"+ie);
            }
        }

        if(win)
            System.out.println(name+" :Win");
        else
            System.out.println(name+" :Lose");
    }
}

class Ex9_Q1
{
    public  static void main(String args[])
    {
        guess g = new guess();  // object for guess class

        int start, end;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the start value :");
        start = scan.nextInt();
        System.out.print("Enter the end value :");
        end = scan.nextInt();

        game p = new game(g,start,end);  // object for game thread

        Thread p1 = new Thread(p,"Player 1");
        Thread p2 = new Thread(p,"Player 2");
        Thread p3 = new Thread(p,"Player 3");

        p1.start();
        p2.start();
        p3.start();
    }
}