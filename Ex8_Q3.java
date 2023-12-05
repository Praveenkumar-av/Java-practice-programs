// Linked list implementation 

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Ex8_Q3
{
    public static void main(String args[])
    {
        LinkedList<Integer> ll = new LinkedList<>();

        Scanner scan = new Scanner(System.in);

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ListIterator lit = ll.listIterator();

        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }

        int pos;
        System.out.println("Enter the position to print :");
        pos = scan.nextInt();

        for(int i=pos;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }

        System.out.println("List in previous order :");
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }

        System.out.println("Enter the position and element to insert :");
        pos = scan.nextInt();
        int e = scan.nextInt();

        ll.add(pos,e);

        ll.addFirst(5);

        ll.addLast(60);

        System.out.print(ll);
    }
}