
//copy data of one array to another one
public class task7 {
    public static void main(String args[])
    {
        int arr[]= {3,5,7,2,5,9,4,7,1};
        int d_arr[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            d_arr[i]=arr[i];
        }

        System.out.println("original array: ");
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(arr[i]+" ");
        }

        System.out.println("\ncopy array: ");
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(d_arr[i]+" ");
        }
    }
}
