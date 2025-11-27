public class String_buffer_methods {
    public static void main(String[] args) {
        
        StringBuffer sb1= new StringBuffer(20);
        sb1.append("hello, welcome to fct.");

        System.out.println("Index of h: "+sb1.indexOf("h"));
        System.out.println("Length of a string: "+sb1.length());
        System.out.println("String in reverse is: "+sb1.reverse());
        System.out.println("String in reverse is: "+sb1.reverse());
        System.out.println("Character at index 5: "+sb1.charAt(5));
        System.out.println("Delete characte from index 5: "+sb1.deleteCharAt(5));;
        System.out.println("Is empty: "+sb1.isEmpty());
        System.out.println("Hashcode: "+sb1.hashCode());
        System.out.println("Substring: "+sb1.substring(6,13));
        System.out.println("String class: "+sb1.getClass());

    }
}
