// Implement a Simple Bank Account
// Create a class BankAccount with instance variables accountNumber, accountHolder, and
// balance. Implement methods for deposit, withdrawal, and checking the balance.

import java.util.Scanner;
class BankAccount
{
    int accountNumber;
    String accountHolder;
    float balance;
    BankAccount(int accno,String name,float bal)
    {
        accountNumber = accno;
        accountHolder = name;
        balance = bal;
    }

    void deposit(float amount)
    {
        if(amount<0)
            System.out.println("Invalid amount");
        else
            balance += amount;

        checkBalance();
    }

    void withDrawal(float amount)
    {
        if(balance-amount < 1)
            System.out.println("Insufficient balance");
        else   
            balance -= amount;

        checkBalance();
    }

    void checkBalance()
    {
        System.out.println("Balance :"+balance);
    }
}

class Ex2_Q1
{
    public static void main(String args[])
    {
        BankAccount customer1 = new BankAccount(1002,"John",12000);
        int choice;
        float amount;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the choice 1 to deposit, 2 to withdraw, 3 to check balance :");
        choice = scan.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Enter the amount to deposit:");
                amount = scan.nextFloat();
                customer1.deposit(amount);
                break;

            case 2:
                System.out.println("Enter the amount to withdraw:");
                amount = scan.nextFloat();
                customer1.withDrawal(amount);
                break;

            case 3:
                customer1.checkBalance();
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}