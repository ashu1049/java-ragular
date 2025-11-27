public class dog {

    //this shows the state of dog(object) , we can show multiple states
    String name="sunny";

    // this method is used to show thw behaviour of dog(object)
    void bark()
    {
        System.out.println("dog barks.");
    }
    
    public static void main(String args[])
    {
        dog d1 = new dog();

        d1.bark();
        System.out.println(d1.name);
    }
}
