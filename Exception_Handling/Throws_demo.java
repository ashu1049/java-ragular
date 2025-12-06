import java.io.*;

public class Throws_demo {
    public static void show() throws FileNotFoundException{

        FileReader fr = new FileReader("C:\\user\\desktop\\abc.txt");

        throw new FileNotFoundException("hi");
    }

    public static void main(String[] args) {
        
        try{
            show();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Rest of my code.");
    }
    
}
