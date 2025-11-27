public class task2 {
    public static void main(String[] args) {
        int a[]= new int[5];

        for(int i=0;i<5;i++)
        {
            a[i]=Integer.parseInt(args[i]);
        }

        int max =a[0];
        int min =a[0];
        for(int i=1;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            else 
            {
                if (a[i]< min)
                min=a[i];
            }
        }
        System.out.println( "largest nnumber in array is: "+max);
        System.out.println( "smallest nnumber in array is: "+min);
    }
}