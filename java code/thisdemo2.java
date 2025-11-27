class thisdemo2
{
    void info()
    {
        System.out.println(this);
    }

    public static void main (String arrgs[])
    {
        thisdemo2 t1= new thisdemo2();
        System.out.println(t1);

        t1.info();
    }
}