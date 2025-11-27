public class jagged_array {
    public static void main(String[] args) {
        
        int j_array[][] = {{1,2,3},{4,5},{6,7,8}};

        for(int i=0;i<j_array.length;i++)
        {
            for(int j=0;j<j_array[i].length;j++)
            {
                System.out.print(j_array[i][j]+" ");
            }
            System.out.println("");
        }
    }
}