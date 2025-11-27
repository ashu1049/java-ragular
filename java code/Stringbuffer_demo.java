public class Stringbuffer_demo {
    public static void main(String[] args) {

        StringBuffer sb= new StringBuffer();
        System.out.println(sb.capacity());
        
        sb.append("Welcome everyone to FCT");
        System.out.println(sb.capacity());

        StringBuffer sb1=new StringBuffer(10);
        sb1.append("hello to all at fct");
        System.out.println(sb1.capacity());
    }
}
