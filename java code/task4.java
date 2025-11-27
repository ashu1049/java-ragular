//print array in reverse
public class task4 {
    public static void main(String args[])
    {
        int arr[]={1,2,2,3,1,3,2};
        System.out.println("origial Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Reverse Array:");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
