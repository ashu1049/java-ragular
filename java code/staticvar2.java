public class staticvar2 {

    int count =0;

    staticvar2()
    {
        count++;
        System.out.println(count);
    }

    public static void main (String args[])
    {
        staticvar2 c1=new staticvar2();
        staticvar2 c2=new staticvar2();
        staticvar2 c3=new staticvar2();

    }
    
}
