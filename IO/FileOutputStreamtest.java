import java.io.FileOutputStream;

public class FileOutputStreamtest
{
    public static void main(String args[])
    {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ashut\\OneDrive\\Documents\\java vs\\java-ragular\\files\\textfile");
            String s="Welcome to IO programming.";
            fos.write(65);
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Success...");
        }catch(Exception e)
        {
            System.out.println(e);


        }
    }
}