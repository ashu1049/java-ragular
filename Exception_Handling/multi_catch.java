public class multi_catch {
    public static void main(String[] args) {
        
        System.out.println("start.");
        try{
            int[] a=new int[5];
            a[7]=100/10;

            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);;
        }
        catch(Exception e)
        {
            System.out.println(e);;
        }

        System.out.println("end.");
    }
}
