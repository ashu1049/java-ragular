public class Finally {
    public static void main(String[] args) {
         System.out.println("Start.");

         try{
            int data=10/0;
            System.out.println(data);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
            System.out.println(e);
         }
         finally{
            System.out.println("Finally block always executes");
         }
         System.out.println("end");
    }
}
