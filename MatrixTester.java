import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
public class MatrixTester
{
   public static void main(String [] args)
   {
    System.out.println("Welcome to the Matrix Tester!");
    System.out.println("Do you want to create a random matrix? (yes/no)");
    Scanner scanner = new Scanner(System.in);
    String response = scanner.nextLine().trim().toLowerCase();
    int[][] matrix;
    if (response.equals("yes")) {
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        matrix = createMatrix(rows, cols);
    } else {
        matrix = new int[][] {
            {6, 90, 4},
            {8, 12, 5},
            {3, 19, 0}
        };
    }
    System.out.println("Original Matrix:");
    printMatrix(matrix);
   findExtrema(matrix);
   rotateArray(matrix);

   
      for (int i = 0; i < matrix.length; i++) 
      {          // rows
         for (int j = 0; j < matrix[i].length; j++) 
            {   // columns
               System.out.print(matrix[i][j] + " ");
            }
         System.out.println();
      }
   }
    public static void findExtrema(int [][] array)
    {
    int rows = array.length;
    int cols = array[0].length;

    int[] rowMax = new int[rows];
    int[] rowMin = new int[rows];
    int[] colMax = new int[cols];
    int[] colMin = new int[cols];

    for (int r = 0; r < rows; r++) {
        rowMax[r] = array[r][0];
        rowMin[r] = array[r][0];

        for (int c = 1; c < cols; c++) {
            if (array[r][c] > rowMax[r]) rowMax[r] = array[r][c];
            if (array[r][c] < rowMin[r]) rowMin[r] = array[r][c];
        }
    }

    for (int c = 0; c < cols; c++) {
        colMax[c] = array[0][c];
        colMin[c] = array[0][c];

        for (int r = 1; r < rows; r++) {
            if (array[r][c] > colMax[c]) colMax[c] = array[r][c];
            if (array[r][c] < colMin[c]) colMin[c] = array[r][c];
        }
    }

    System.out.println("The maximum values along the rows are " + java.util.Arrays.toString(rowMax));
    System.out.println("The minimum values along the rows are " + java.util.Arrays.toString(rowMin));
    System.out.println("The maximum values along the columns are " + java.util.Arrays.toString(colMax));
    System.out.println("The minimum values along the columns are " + java.util.Arrays.toString(colMin));
   }
   public static int[][] rotateArray(int [][] array) 
   {  
    int n= array.length;
    int l= array[0].length;
    for(int i= 0; i< n; i++)
      {
        for(int c= 0; c < l; c++)
        {    
        array[c][n-1-i]= array[i][c];
        }
      } 
    return array;
}
public static int[][] createMatrix(int rows, int cols)
{
    int[][] matrix = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            matrix[i][j] = (int)(Math.random() * 100); // Random values between 0 and 99
        }
    }
    return matrix;
}
public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + "\t");
        }
        System.out.println();
    }
}
}