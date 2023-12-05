// Assume you are developing a global e-commerce platform where users can perform transactions in multiple 
// currencies (assume any 3). You are tasked with implementing a feature that requires currency conversion
// between those currencies for financial reporting purposes. Using the java.util.Currency class and its 
// related functionalities, design a system that allows users to input an amount in one currency and convert 
// it into another currency based on the current exchange rates (get it from the user).

import java.util.*;

class Ex9_Q2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        double usd=0, result=0;
        String curr1, curr2;

        System.out.println("Enter the current currency :");
        curr1 = scan.next();
        Currency c1 = Currency.getInstance(curr1);
        System.out.println("Enter the currency to be converted :");
        curr2 = scan.next();
        Currency c2 = Currency.getInstance(curr2);

        System.out.println("Enter the amount :");
        double am = scan.nextDouble();

        if(curr1.equals("EUR")) usd = am*1.09;
        else if(curr1.equals("INR")) usd = am*0.012;
        else if(curr1.equals("USD")) usd = am;

        if(curr2.equals("EUR")) result = usd*0.91;
        else if(curr2.equals("INR")) result = usd*83.39;
        else if(curr2.equals("USD")) result = usd;

        System.out.println(am+" "+c1.getSymbol()+" is equal to :"+c2.getSymbol()+" "+result);
    }
}