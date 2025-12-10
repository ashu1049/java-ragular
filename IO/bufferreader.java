import java.io.*;
public class bufferreader {
    public static void main(String[] args) {
        
        try{
            Reader r = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(r);
            int data= br.read();

            while(data!=-1)
            {
                System.out.print((char)data);
                data=br.read();
            }

            br.close();  
            r.close(); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}