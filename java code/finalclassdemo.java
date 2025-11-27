final class finalclassdemo1 {
    
    void display()
    {
        System.out.println("A class with final keyword.");
    }
}


//class finalclassdemo extends finalclassdemo1 {
class finalclassdemo {
    void display()
    {
        System.out.println("class inheritating the final class");
    }

    public static void main(String[] args) {
        
        // finalclassdemo d1 = new finalclassdemo();
        // d1.display();
        //Above will not be return cause this calss is inheritating the final class which is not possible.

        finalclassdemo d2 = new finalclassdemo();
        d2.display();
    }
}
