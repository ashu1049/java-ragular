import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner("Hello Ashutosh 5 how are you.");
        
        while(sc.hasNext())
        {
            if(sc.hasNextInt())
                System.out.println(sc.next());
            else
                sc.next();
        }
        
        sc.close();
    }
}  