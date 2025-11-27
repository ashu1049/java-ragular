// arrange the array in ascending and descending order

public class task5 {
    public static void main(String[] args) {
        int arr[]={5,7,4,3,6,8,6,9,3};
        int temp;

        System.out.println("\nArray in insertion order:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        // logic for ascending array
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nArray in ascending order:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        // logic for descending array
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nArray in descending order:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
