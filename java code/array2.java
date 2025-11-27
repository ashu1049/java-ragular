public class array2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        System.out.println("Output using normal for loop:");
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }

        System.out.println("Output using for each loop:");
        for (int j:a) {
            System.out.println(j);
        }
    }    
}
