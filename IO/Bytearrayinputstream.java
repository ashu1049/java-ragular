import java.io.*;

public class Bytearrayinputstream
{
    public static void main(String args[])
    {
        try{

            byte[] buf={35,36,37,38};
            
            ByteArrayInputStream bout = new ByteArrayInputStream(buf);
            int k;

            while((k=bout.read())!=-1)
            {
                char ch=(char)k;
                System.out.println("Ascii value of character is: "+k+ ", The special character is: "+ch);
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
         
    }
}