// Create a base class called `BankAccount` with attributes like `accountNumber`,
// `accountHolderName`, and `balance`. Implement methods for depositing and withdrawing
// money. Then, create two subclasses, `SavingsAccount` and `CheckingAccount`, which inherit
// from the `BankAccount` class. Add specific attributes and methods to each subclass. For
// example, `SavingsAccount` might have an `interestRate` attribute, and `CheckingAccount` could
// have a `monthlyFee` attribute. Demonstrate how you can create instances of these subclasses and
// perform transactions.

import java.util.Scanner;
class BankAccount
{
    long accountNumber;
    String accountHolderName;
    float balance;

    void deposit(float money)
    {
        if(money<0)
            System.out.println("Invalid amount");
        else
        {
            balance += money;
            System.out.println("Money Deposited");
        }
        display();
    }

    void withdraw(float money)
    {
        if(balance - money < 0)
            System.out.println("Insufficient balance!");
        else
        {
            balance -= money;
        }
        display();
    }

    void display()
    {
        System.out.println("Balance :"+balance);
    }
}

class SavingsAccount extends BankAccount
{
    SavingsAccount(long accno,String name,float bal)
    {
        accountNumber = accno;
        accountHolderName = name;
        balance = bal;
    }

    void interestRate()
    {
        System.out.println("Interest :"+(balance*0.015));
    }
}

class CheckingAccount extends BankAccount
{
    CheckingAccount(long accno,String name,float bal)
    {
        accountNumber = accno;
        accountHolderName = name;
        balance = bal;
    }

    void monthlyFee()
    {
        System.out.println("Monthly fee : 500");
    }
}

class Ex3_Q1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        float money;

        // Savings Bank Account
        SavingsAccount obj1 = new SavingsAccount(12023912,"Praveen",10000f);
    
        System.out.println("Enter the amount to deposit :");
        money = scan.nextFloat();
        obj1.deposit(money);

        System.out.println("Enter the amount to withdraw :");
        money = scan.nextFloat();
        obj1.withdraw(money);

        obj1.interestRate();

        // Checking Bank Account
        CheckingAccount obj2 = new CheckingAccount(12023346,"Robert",15000f);
    
        System.out.println("Enter the amount to deposit :");
        money = scan.nextFloat();
        obj2.deposit(money);

        System.out.println("Enter the amount to withdraw :");
        money = scan.nextFloat();
        obj2.withdraw(money);

        obj2.monthlyFee();
    }
}