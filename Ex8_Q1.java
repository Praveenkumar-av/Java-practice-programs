import java.util.*;

class Ex8_Q1
{
    public static void main(String args[])
    {
        System.out.println("Enter the no. of elements :");

        int i, j, n1, n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        ArrayList<ArrayList<Integer>> arl = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(i=0;i<n;i++)
        {
            n1 = scan.nextInt();
            arl.add(new ArrayList<Integer>());
            for(j=0;j<n1;j++)
            {
                arl.get(i).add(scan.nextInt());
            }
        }

        System.out.println(arl);

        ArrayList<String> result = new ArrayList<String>();
        int num, x, y;
        for(i=0;i<n;i++)
        {
            x = scan.nextInt()-1;
            y = scan.nextInt()-1;
            
            try
            {
                num = arl.get(x).get(y);
                result.add(Integer.toString(num));
            }
            catch(Exception e) 
            {
                result.add("Error!");
            }
        }

        for(String s : result)
            System.out.println(s);
    }
}