public class Animal {
    
    String name = "tiger";
    
    void eat() {
        System.out.println(name + " eats other animals.");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        System.out.println(a1.name);
    }
}

