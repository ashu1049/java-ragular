public class ArrayIndexDemo {
    public static void main(String[] args) {
        
        int[] numbers={1,2,3,4,5};
        System.out.println("Welcome to exception handling.");
        try{
            System.out.println(numbers[10]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of my code.");
    }
}
