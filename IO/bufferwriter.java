import java.io.*;
public class bufferwriter {
    public static void main(String[] args) {
        
        try{
            Writer w = new FileWriter("output1.txt");
            BufferedWriter bw = new BufferedWriter(w);
            String content = "I like to travel India";
            bw.write(content);
            
            bw.close();
            System.out.println("Write Success...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
