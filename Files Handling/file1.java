import java.io.File;
public class file1 {
    public static void main(String[] args) {
        try{

            File f1 = new File("C:\\Users\\ashut\\OneDrive\\Documents\\java vs\\java-ragular\\files\\sample.txt");
            if(f1.createNewFile())
            {
                System.out.println("file "+f1.getName()+" is created successfully. ");
            }
            else
            {
                System.out.println("File already exists.");
            }

            System.out.println("Path of the file: "+f1.getAbsolutePath());
            System.out.println("Do we have permission to read: "+f1.canRead());
            System.out.println("Do we have permission to write: "+f1.canWrite());
            System.out.println("Length of the file "+f1.length());
            
            if(f1.delete())
            {
                System.out.println("file "+f1.getName()+" is deleted successfully. ");
            }
            else
            {
                System.out.println("Error occured during deletion.");
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
