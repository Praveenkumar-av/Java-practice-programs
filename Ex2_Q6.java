// Bank Management System
// Design a class Bank with a list of BankAccount objects. Implement methods to add accounts,
// find an account by account number, calculate the total balance, and display account details.

import java.util.Scanner;
class Bank
{
    String name;
    long accountNo, phNo;

    void addAccount(String name,long accountNo,long phNo)
    {
        this.name = name;
        this.accountNo = accountNo;
        this.phNo = phNo;
    }

    static void findAccount(Bank b[],int n,long accno)
    {
        int i;
        for(i=0;i<n;i++)
        {
            if(b[i].accountNo == accno)
            {
                System.out.println("Name :"+b[i].name);
                System.out.println("Account no. :"+b[i].accountNo);
                System.out.println("Phone no. :"+b[i].phNo);
            }
        }
    }

    static void display(Bank b[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println((i+1)+" .Name :"+b[i].name);
            System.out.println((i+1)+" .Account no. :"+b[i].accountNo);
            System.out.println((i+1)+" .Phone no. :"+b[i].phNo);
        }
    } 
}

class Ex2_Q6
{
    public static void main(String args[])
    {
        Bank b[] = new Bank[20];

        b[0] = new Bank();
        b[0].addAccount("Raju",1201,7398348738l);
        b[1] = new Bank();
        b[1].addAccount("John",1202,8998348738l);
        b[2] = new Bank();
        b[2].addAccount("Jai",1203,9798348738l);

        int n = 3, choice = 1;
        long phNo, accNo;
        String name;
        Scanner scan = new Scanner(System.in);
        Bank.display(b,n);

        while(choice != 0)
        {
            System.out.println("Enter the choice 1 to add, 2 to find, 3 to display customers and 0 to exit :");
            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                    scan.nextLine();
                    System.out.println("Enter the name :");
                    name = scan.nextLine();
                    System.out.println("Enter the Account number :");
                    accNo = scan.nextLong();
                    System.out.println("Enter the Phone number :");
                    phNo = scan.nextLong();
                    b[n] = new Bank();
                    b[n].addAccount(name,accNo,phNo);
                    n++;
                    Bank.display(b,n);
                    break;

                case 2:
                    scan.nextLine();
                    System.out.println("Enter the Account number to find :");
                    accNo = scan.nextInt();
                    Bank.findAccount(b,n,accNo);
                    break;

                case 3:
                    Bank.display(b,n);
                    break;

                default :
                    if(choice != 0)
                        System.out.println("Invalid");
            }
        }
    }
}