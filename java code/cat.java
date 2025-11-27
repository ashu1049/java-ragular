public class cat extends animal1 {

    cat(String name)
    {
        super(name);
    }
    void makesound()
    {
        System.out.println(name+" is making sound meow.");
    }
    public static void main(String[] args) {
        
        cat c1= new cat("cat");
        c1.eat();
        c1.makesound();
    }
}
