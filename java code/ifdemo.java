
public class ifdemo {
    public static void main(String args[])
    {
        int pass=1234;
        //pass case
        if (pass==1234)
        System.out.println("welcome to java class");
        System.out.println("rest of the code");

        //fail case
        if (pass==123)
        System.out.println("welcome to java class");
        System.out.println("rest of the code");

        //using block for if
        if (pass==1234)
        {
            System.out.println("welcome to java class");
            System.out.println("its cloudy outside");
        }
        System.out.println("rest of the code");

    }
}
