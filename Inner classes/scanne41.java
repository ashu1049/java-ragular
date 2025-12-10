import java.util.Scanner;

public class scanne41 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner("Hello Ashutosh\n how are you.");
        
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        
        sc.close();
    }
}
