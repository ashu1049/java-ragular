public class dog1 extends animal1 {

    dog1(String name)
    {
        super(name);
    }
    void makesound()
    {
        System.out.println(name+" is making sound bho-bho.");
    }
    public static void main(String[] args) {
        
        dog1 c1= new dog1("dog");
        c1.eat();
        c1.makesound();
    }
}

