

public class swap {
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("value of a and b before swapping is: ");
        System.out.println ("a:"+a+"  "+"b:"+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("value of a and b after swapping is: ");
        System.out.println ("a:"+a+"  "+"b:"+b);

    }

}
