public class String_methods
{
    public static void main(String[] args) {
        String s1="hello";
        String s2=" ashutosh";
        s1.concat(s2);
        String s3=s1+s2;
        System.out.println(s1);
        System.out.println(s1.concat(s2));
        System.out.println(s3);

        System.out.println("Length of string is: "+s3.length());
        System.out.println("Character at index 10 is: "+s3.charAt(10));
        System.out.println("Substring: "+s3.substring(6,14));
        System.out.println("Substring: "+s3.substring(14));

    }
}