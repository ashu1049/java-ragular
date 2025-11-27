// find the average of all elements inarray
public class task6 {
    public static void main(String[] args) {
        int arr[]={ 25,65,35,67,34,76,34,65,45};
        float sum=0;

        for(int i= 0;i<arr.length;i++)
        {
            sum+=arr[i];
        }

        float avg=sum/arr.length;

        System.out.println("Average of all numbers in an array is: "+avg);
    }
}

