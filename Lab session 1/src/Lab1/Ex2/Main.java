package Lab1.Ex2;

public class Main {

    public static void main(String args[]) {
        int[][] matrix1 = {{2, 3, 1}, {7, 1, 6}, {9, 2, 4}};
        int[][] matrix2 = {{8, 5, 3}, {3, 9, 2}, {2, 7, 3}};
        int[][] matrix3 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
        }
        System.out.println("The sum of matrix1 and matrix2 is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix3[i][j] + " ");
            System.out.println();
        }
        int[][] matrix4 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    matrix4[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("The product of matrix1 and matrix2 is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix4[i][j] + " ");
            System.out.println();
        }
    }
}
