public class String_mutable {
    public static void main(String[] args) {
        String s1= new String("hello");//immutable string.
        s1.concat("Ashutosh");
        System.out.println(s1);

        StringBuffer sb1= new StringBuffer("hello");//mutable string.
        sb1.append(" rahul");
        System.out.println(sb1);
        
        StringBuffer sb2= new StringBuffer("hii");//mutable string.
        sb2.append(" vaishnav");
        System.out.println(sb2);

    }
}
