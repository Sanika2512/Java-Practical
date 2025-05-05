import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];
        System.out.println("Enter elements of first  matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Transpose of First Matrix");
        System.out.println("5. Transpose of Second Matrix");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < 2; i++) {
                   for (int j = 0; j < 2; j++) {
                     result[i][j] = matrix1[i][j] + matrix2[i][j];
					 
            }
        }
		System.out.println(" Addition of matrix :");
		 for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
		 }
                break;

            case 2:
                for (int i = 0; i < 2; i++) {
                   for (int j = 0; j < 2; j++) {
                     result[i][j] = matrix1[i][j] - matrix2[i][j];
					 
            }
        }
		System.out.println(" Substraction of matrix :");
		 for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
		 }
                break;

            case 3:
                 for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = matrix1[i][0] * matrix2[0][j] + matrix1[i][1] * matrix2[1][j];
            }
        } 
		     System.out.println(" Multiplication of matrix :");
		 for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
		 }
                break;

            case 4:
                int[][] transposed = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transposed[i][j] = matrix1[j][i];
            }
        }
		System.out.println(" Transpose of first Matrix:");
		 for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
		 }
                break;

            case 5:
			 transposed = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transposed[i][j] = matrix1[j][i];
            }
        }
		System.out.println("Transpose of Second Matrix:");
		 for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
		 }
		
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

   

   
    
}
