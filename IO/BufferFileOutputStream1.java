
import java.io.*;

public class BufferFileOutputStream1
{
    public static void main(String args[])
    {
        try{
            FileOutputStream fout= new FileOutputStream("C:\\Users\\ashut\\OneDrive\\Documents\\java vs\\java-ragular\\files\\textfile.txt");

            BufferedOutputStream bout = new BufferedOutputStream(fout);
            String s="Welcome to Buffered Stream.";
            bout.write(65);
            byte b[]=s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Success...");
        }catch(Exception e)
        {
            System.out.println(e);


        }
    }
}