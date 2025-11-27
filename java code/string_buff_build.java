public class string_buff_build {
    public static void main(String[] args) {
        
        long starttime = System.currentTimeMillis();

        StringBuffer sb1 = new StringBuffer("java");

        for (int i = 0; i < 10000; i++) {
            sb1.append(" is easy.");
        }

        System.out.println("time taken by StringBuffer: " + (System.currentTimeMillis() - starttime));

        starttime = System.currentTimeMillis();

        StringBuilder sb2 = new StringBuilder("wd");

        for (int i = 0; i < 10000; i++) {
            sb2.append(" is easy.");
        }

        System.out.println("time taken by StringBuilder: " + (System.currentTimeMillis() - starttime));
    }
}
