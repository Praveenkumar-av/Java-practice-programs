import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of details");
        int n = scan.nextInt();

        OrderHandler o[] = new OrderHandler[n];

        for (int i = 0; i < n; i++) {

            o[i] = new OrderHandler(o,n);
            o[i].processOrder();
            o[i].generateId();
        }
        
        if(n>0)
            o[0].trackOrder();
    }
}