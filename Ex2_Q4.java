// Online Shopping Cart
// Create a class Product with attributes like name, price, and quantity. Design a class ShoppingCart
// to manage products added to the cart. Implement methods to add products, remove products,
// calculate the total price, and display cart contents.

import java.util.Scanner;
class Product 
{
    String name;
    float price, quantity;
    static float total = 0.0f;

    void addProduct(String name,float price,float quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    static int removeProduct(Product p[],int n,String name)
    {
        int i;
        boolean flag = false;
        for(i=0;i<n;i++)
        {
            if(name.equals(p[i].name))
            {
                p[i].name = p[n-1].name;
                p[i].price = p[n-1].price;
                p[i].quantity = p[n-1].quantity;

                p[n-1].name = null;
                p[n-1].price = 0.0f;
                p[n-1].quantity = 0.0f;

                flag = true;
            }
        }
        if(flag)
        {
            System.out.println("Product removed");
            return --n;
        }
        else
        {
            System.out.println("Product not found!");
            return n;
        }
    }

    static float totalPrice(Product p[],int n)
    {
        int i;
        total = 0;
        for(i=0;i<n;i++)
        {
            total += p[i].price*p[i].quantity;
        }
        return total;
    }

    static void display(Product p[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println((i+1)+". Name :"+p[i].name);
            System.out.println((i+1)+". Price :"+p[i].price);
            System.out.println((i+1)+". Quantity :"+p[i].quantity);
        }
        System.out.println("Total Price :"+Product.totalPrice(p,n));
    }
}

class Ex2_Q4 
{
    public static void main(String args[])
    {
        Product p[] = new Product[30];

        int n = 0, choice = 1;
        float quantity, price;
        String name;
        Scanner scan = new Scanner(System.in);

        while(choice != 0)
        {
            System.out.print("Enter the choice 1 to add, 2 to remove, 3 to display products and 0 to exit :");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    scan.nextLine();
                    System.out.println("Enter the Product name :");
                    name = scan.nextLine();
                    System.out.println("Enter the price :");
                    price = scan.nextFloat();
                    System.out.println("Enter the Quantity :");
                    quantity = scan.nextFloat();
                    p[n] = new Product();
                    p[n].addProduct(name,price,quantity);
                    n++;
                    break;
                
                case 2:
                    scan.nextLine();
                    System.out.println("Enter the Product name to remove :");
                    name = scan.nextLine();
                    n = Product.removeProduct(p,n,name);
                    break;

                case 3:
                    Product.display(p,n);
                    break;

                default :
                    if(choice != 0)
                        System.out.println("Invalid!");
            }
        }
    }
}