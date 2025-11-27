public class nested_try_catch {
    public static void main(String[] args) {
        System.out.println("start");

        try{
            int a[]=new int[5];

            try{

                a[7]=30/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("end.");
    }
}
