import java.io.*;
public class writerdemo {
    public static void main(String[] args) {
        
        try{
            Writer w = new FileWriter("output.txt");
            String content = "I like to travel India";
            w.write(content);
            w.append("\nI love to live in pune\n");
            w.append("\nExplore the diff. methods of console class and writer and reader classes, try to prepare ex. also.");

            w.close();
            System.out.println("Write Success...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
