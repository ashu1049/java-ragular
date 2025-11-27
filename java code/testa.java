class A {
    A getA()
    {
        return this;
    }
    void massage()
    {
        System.out.println("Hello everyone ....");
    }
}

class testa{
    public static void main()
    {  
        new A().getA().massage();
    }
}
