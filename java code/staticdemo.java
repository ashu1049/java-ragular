public class staticdemo {
    
    static int a =50;
    final static int b=50;
     // with final static we cant change the value of variable

    public static void main (String args[])
    {
        System.out.println(a);
        System.out.println(b);

        a=100;
        //b=100; illegal

        System.out.println(a);
        System.out.println(b);

    }
}
