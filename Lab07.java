import java.util.Scanner;

public class Lab07 {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        //matrix dimensions
        System.out.println("Enter the length of rows in matrix 1: ");
        int mat1_rows = key.nextInt();

        System.out.println("Enter the length of columns in matrix 1: ");
        int mat1_cols = key.nextInt();

        System.out.println("Enter the length of rows in matrix 2: ");
        int mat2_rows = key.nextInt();

        System.out.println("Enter the columns of matrix 2: ");
        int mat2_cols = key.nextInt();

        if (mat1_cols != mat2_cols)
        {
            System.out.println("Dimension mismatch! Cannot multiply matrices");
            System.exit(0);
        }
        //creating arrays for the matrices
        int[][] matrix1 = new int[mat1_rows][mat1_cols];
        int[][] matrix2 = new int[mat2_rows][mat2_cols];
        //1st matrix
        for(int i=0; i < mat1_rows; i++)
        {
            for (int j=0; j < mat1_cols; j++)
            {
                System.out.println("Enter the value of the matrix 1 at position ("+i+","+j+"):");
                matrix1[i][j] = key.nextInt();
            }
        }
        //2 matrix
        for(int i=0; i < mat2_rows; i++)
        {
            for(int j=0; j < mat2_cols; j++)
            {
                System.out.println("Enter the value of the matrix 2 at position ("+i+","+j+"):");
                matrix2[i][j] = key.nextInt();

            }
        }
        //adding the 2 matrices
        int[][] sum = new int[matrix1.length][matrix2[0].length];

        for (int i=0; i < matrix1.length; i++)
        {
            for (int j=0; j < matrix2[0].length; j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        //printing the sum
        System.out.println("The sum of the matrix 1 and 2 matrices are: ");
        for (int[] row : sum)
        {
            for (int element : row)
            {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
