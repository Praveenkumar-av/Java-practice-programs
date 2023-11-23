import java.util.*;

class Ex8_Q2
{
    public static void main(String args[])
    {
        HashSet<String> hs = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        int n, i, count=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the no. of elements :");
        n = scan.nextInt();
        scan.next();

        for(i=0;i<n;i++)
        {
            if(hs.add(scan.nextLine()))
            {
                count++;
                result.add(count);
            }
            else
                result.add(count);
        }

        Iterator it = result.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}