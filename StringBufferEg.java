// String Buffer in Java

class StringBufferEg
{
    public static void main(String args[])
    {
        StringBuffer str = new StringBuffer("Hello");
        System.out.println(str);

        str.append("Java");
        System.out.println(str);

        System.out.println(str.length());

        System.out.println(str.capacity());

        System.out.println(str.charAt(2));
        
        str.delete(1,3);
        System.out.println(str);

        str.deleteCharAt(1);
        System.out.println(str);

        str.ensureCapacity(50);
        System.out.println(str.capacity());

        str.insert(1,"ell");
        System.out.println(str);

        str.replace(1,2,"a");
        System.out.println(str);

        str.reverse();
        System.out.println(str);
    }
}