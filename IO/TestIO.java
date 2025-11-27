public class TestIO {
    public static void main(String[] args) {
        System.out.println("Test output stream");
        System.err.println("Test error stream");

        try{
            int i=System.in.read();
            System.out.println((char)i);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
