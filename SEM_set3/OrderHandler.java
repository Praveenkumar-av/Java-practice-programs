import ecommerce.exceptions.InvalidOrderException;
import ecommerce.exceptions.OrderTrackingException;
import ecommerce.orders.*;

import java.util.*;

public class OrderHandler implements OrderProcessor{

    String username, date, time, trackId;
    OrderHandler obj[];
    int n, noObj;
    double totalPrice=0;
    ArrayList<String> products = new ArrayList<>();
    ArrayList<Double> prices = new ArrayList<>();
    OrderHandler(OrderHandler obj[], int noObj)
    {
        this.obj = obj;
        this.noObj = noObj;
    }

    @Override
    public void processOrder() {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter the user name :");
            username = scan.next();
            System.out.println("Enter the no. of products :");
            n = scan.nextInt();
            if(n < 1)
            {
                throw new InvalidOrderException("Produts cannot be negative or zero");
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the product name :");
                products.add(scan.next());
                System.out.println("Enter the price :");
                prices.add(scan.nextDouble());
            }
        }
        catch(InvalidOrderException ie) {
            System.out.println("Invalid");
        }

        for(Double price : prices)
        {
            totalPrice += price;
        }

        System.out.println("Total price :"+totalPrice);
    }

    @Override
    public void trackOrder() {
        System.out.println("Enter the trackId to find");
        Scanner scan = new Scanner(System.in);
        String tr = scan.nextLine();
        boolean found = false;

        for(int i=0;i<noObj;i++)
        {
            if(obj[i].trackId.trim().equals(tr.trim()))
            {
                System.out.print("User name :"+obj[i].username);
                System.out.println("Your products :");
                for(String p : obj[i].products)
                {
                    System.out.println(p);
                }
                found = true;
            }
        }

        try {
            if (!found) {
                throw new OrderTrackingException("Not found");
            }
        }
        catch (OrderTrackingException oe)
        {
            System.out.println("Order not found");
        }
    }

    public void generateId() {

        Random rand = new Random();
        int num = (rand.nextInt(89999)+10000);

        Calendar c = Calendar.getInstance();
        date = String.valueOf(c.getTime());

        String rs = String.valueOf(num);

        trackId = username+date+rs;

        System.out.println("Track id :"+trackId);
    }

}
