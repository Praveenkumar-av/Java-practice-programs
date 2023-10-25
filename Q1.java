import java.util.Scanner;

class Class1
{
    static String[] invoked = new String[6];
    static String[] pending = {"Method21", "Method22", "Method31", "Method32", "Method41", "Method42"};
    static int last=5;

    void remove(String s)
    {
        for(int i = 0; i<=last; i++)
        {
            if(pending[i].equals(s))
            {
                pending[i] = pending[last];
                pending[last] = null;
                last--;
                break;
            }
        }
    }

    void add(String s)
    {
        for(int i = 0; i < invoked.length; i++)
        {
            if(invoked[i] == null)
            {
                invoked[i] = s;
                break;
            }
        }
    }
}

class Class2 extends Class1
{
    void Method21()
    {
        System.out.println("Method21 called");
    }

    void Method22()
    {
        System.out.println("Method22 called");
    }
}

class Class3 extends Class2
{
    void Method31()
    {
        System.out.println("Method31 called");
    }

    void Method32()
    {
        System.out.println("Method32 called");
    }
}

class Class4 extends Class3
{
    void Method41()
    {
        System.out.println("Method41 called");
    }

    void Method42()
    {
        System.out.println("Method42 called");
    }
}

class Q1
{
    public static void main(String[] args)
    {
        Class4 c = new Class4();

        Scanner scan = new Scanner(System.in);
        String s;

        c.Method42();
        c.remove("Method42");
        c.add("Method42");

        do
        {
            System.out.println("\nEnter method name to invoke: ");
            s = scan.nextLine();

            if(s.equals("Method21"))
            {
                c.Method21();
                c.remove(s);
                c.add(s);
            }
            else if(s.equals("Method22"))
            {
                c.Method22();
                c.remove(s);
                c.add(s);
            }
            else if(s.equals("Method31"))
            {
                c.Method31();
                c.remove(s);
                c.add(s);
            }
            else if(s.equals("Method32"))
            {
                c.Method32();
                c.remove(s);
                c.add(s);
            }
            else if(s.equals("Method41"))
            {
                c.Method41();
                c.remove(s);
                c.add(s);
            }
            else
            {
                System.out.println("Invalid method name");
            }

            System.out.println("\nPending methods: ");
            for(int i = 0;i<=Class1.last; i++)
            {
                System.out.println(c.pending[i]);
            }

            System.out.println("\nInvoked methods: ");
            for(int i = 0;c.invoked[i]!=null; i++)
            {
                System.out.println(c.invoked[i]);
            }

        }while(!(s.equals("exit")));
    }
}