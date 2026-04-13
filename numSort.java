import java.util.Scanner;
public class numSort {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        //declare an array
        int[] array = {8, 4, 9, 2};
        System.out.println("The unsorted array is:");
        for (int i= 0; i < array.length; i++)
        {
            System.out.print(array[i] + ", ");
            
        }
        



        for (int i= 0; i < array.length; i++)
        {
            for (int n= 0; n < array.length- 1; n++)
            {
                if (array[n] > array[n+1])
                {
                    int temp = array[n];
                    array[n] = array[n+1];
                    array[n+1] = temp;
                    System.out.println("\nThe numbers " + array[n] + " and " + array[n+1] + " were swapped.");
                }
                System.out.println("The array is now: "+ java.util.Arrays.toString(array));
            }
            
        }
        System.out.println("\nThe sorted array is: "+ java.util.Arrays.toString(array));

    }

}