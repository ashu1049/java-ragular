
import java.io.*;

public class Bytearrayoutputstream
{
    public static void main(String args[])
    {
        try{
            FileOutputStream fout1= new FileOutputStream("C:\\Users\\ashut\\OneDrive\\Documents\\java vs\\java-ragular\\files\\textfile1.txt");
            FileOutputStream fout2= new FileOutputStream("C:\\Users\\ashut\\OneDrive\\Documents\\java vs\\java-ragular\\files\\textfile2.txt");
            FileOutputStream fout3= new FileOutputStream("C:\\Users\\ashut\\OneDrive\\Documents\\java vs\\java-ragular\\files\\textfile3.txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            bout.writeTo(fout3);

            bout.flush();
            bout.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }
         System.out.println("Success...");
    }
}