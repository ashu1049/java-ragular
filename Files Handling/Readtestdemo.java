import java.io.*;

public class Readtestdemo {
    public static void main(String[] args) {
        try
        {
            File f= new File("C:\\Users\\ashut\\OneDrive\\Documents\\java vs\\java-ragular\\files\\textfile5.txt");

            if(f.createNewFile())
            {
                System.out.println("file "+f.getName()+" is created successfully. ");
            }
            else
            {
                System.out.println("File already exists.");
            }

            System.out.println("Is file readable: "+f.canRead());
            System.out.println("Is file Writable: "+f.canWrite());
            System.out.println("Is file Executable: "+f.canExecute());

            f.setReadable(false);
            f.setWritable(false);
            f.setExecutable(true);

            System.out.println("Is file readable: "+f.canRead());
            System.out.println("Is file Writable: "+f.canWrite());
            System.out.println("Is file Executable: "+f.canExecute());
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
