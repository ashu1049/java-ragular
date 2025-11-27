import java.io.FileInputStream;

public class FileInputStreamtest
{
    public static void main(String args[])
    {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\ashut\\OneDrive\\Documents\\java vs\\java-ragular\\files\\textfile");
            int i;
            while((i=fis.read())!=-1)
            {
                System.out.print((char)i);
            }
            fis.close();
           
        }catch(Exception e)
        {
            System.out.println(e);


        }
    }
}