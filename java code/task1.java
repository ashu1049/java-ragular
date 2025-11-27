public class task1 {
    public static void main(String[] args) {
        int a[]= new int[10];
        int sum=0;

        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }

        for(int i=0;i<10;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
