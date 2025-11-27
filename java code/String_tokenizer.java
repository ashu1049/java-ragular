import java.util.*;

public class String_tokenizer {
    public static void main(String[] args) {
        String s1="have a nice day everyone.";
        StringTokenizer st= new StringTokenizer(s1);

        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
