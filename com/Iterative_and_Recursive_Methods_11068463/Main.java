import com.Iterative_and_Recursive_Methods_11068463.Iteratives;
import com.Iterative_and_Recursive_Methods_11068463.Recursives;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
                boolean continueRunning = true;

                while (continueRunning) {
                    System.out.println("1. Maximum Element");
                    System.out.println("2. Element Uniqueness");
                    System.out.println("3. Matrix Multiplication");
                    System.out.println("4. Gaussian Elimination");
                    System.out.println("5. Counting Binary Digits");
                    System.out.println("6. Factorial");
                    System.out.println("7. Tower of Hanoi");
                    System.out.println("8. Fibonacci Numbers");
                    System.out.println("Select an algorithm using its respective numbers(1-7): ");

                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (choice) {
                        case 1:
                            // Maximum Element
                            System.out.println("Enter the number of elements in the array:");
                            int n = scanner.nextInt();
                            int[] array = new int[n];
                            System.out.println("Enter the elements of the array(hit enter after every number):");
                            for (int i = 0; i < array.length; i++) {
                                array[i] = scanner.nextInt();
                            }
                            System.out.println("Maximum Element: " + Iteratives.maximumValue(array));
                            break;
                        case 2:
                            // Element Uniqueness
                            System.out.println("Enter the number of elements in the array:");
                            int uniqueSize = scanner.nextInt();
                            int[] uniqueArray = new int[uniqueSize];
                            System.out.println("Enter the elements of the array:");
                            for (int i = 0; i < uniqueSize; i++) {
                                uniqueArray[i] = scanner.nextInt();
                            }
                            System.out.println("Element Uniqueness: " + Iteratives.isUnique(uniqueArray));
                            break;
                        case 3:
                            // Matrix Multiplication
                            System.out.println("Enter the dimensions of the first matrix (rows and columns):");
                            int rowsA = scanner.nextInt();
                            int colsA = scanner.nextInt();
                            int[][] A = new int[rowsA][colsA];
                            System.out.println("Enter the elements of the first matrix:");
                            for (int i = 0; i < rowsA; i++) {
                                for (int j = 0; j < colsA; j++) {
                                    A[i][j] = scanner.nextInt();
                                }
                            }
                            System.out.println("Enter the dimensions of the second matrix (rows and columns):");
                            int rowsB = scanner.nextInt();
                            int colsB = scanner.nextInt();
                            int[][] B = new int[rowsB][colsB];
                            System.out.println("Enter the elements of the second matrix:");
                            for (int i = 0; i < rowsB; i++) {
                                for (int j = 0; j < colsB; j++) {
                                    B[i][j] = scanner.nextInt();
                                }
                            }
                            if (colsA != rowsB) {
                                System.out.println("Matrix multiplication not possible with the given dimensions.");
                            } else {
                                int[][] C = Iteratives.matrixMultiply(A, B);
                                System.out.println("Matrix Multiplication Result:");
                                for (int i = 0; i < C.length; i++) {
                                    for (int j = 0; j < C[i].length; j++) {
                                        System.out.print(C[i][j] + " ");
                                    }
                                    System.out.println();
                                }
                            }
                            break;
                        case 4:
                            // Gaussian Elimination
                            System.out.println("Enter the number of rows in the matrix:");
                            int rows = scanner.nextInt();
                            double[][] matrix = new double[rows][rows + 1];
                            System.out.println("Enter the elements of the augmented matrix:");
                            for (int i = 0; i < rows; i++) {
                                for (int j = 0; j <= rows; j++) {
                                    matrix[i][j] = scanner.nextDouble();
                                }
                            }
                            Iteratives.gaussianEliminate(matrix);
                            System.out.println("Gaussian Elimination Result:");
                            for (double[] row : matrix) {
                                for (double element : row) {
                                    System.out.print(element + " ");
                                }
                                System.out.println();
                            }
                            break;
                        case 5:
                            // Counting Binary Digits
                            System.out.print("Enter a number to obtain the number of binary digits in its binary representation: ");
                            int num = scanner.nextInt();
                            System.out.println("Number of binary digits in " + num + ": " + Iteratives.numberOfBinaryDigits(num));
                            break;
                        case 6:
                            // Factorial
                            System.out.print("Enter a number to find its factorial: ");
                            int factorialNum = scanner.nextInt();
                            System.out.println("Factorial of " + factorialNum + ": " + Recursives.Factorial(factorialNum));
                            break;
                        case 7:
                            // Tower of Hanoi
                            System.out.print("Enter the number of disks: ");
                            int disks = scanner.nextInt();
                            Recursives.towerOfHanoi(disks, 'A', 'C', 'B');
                            break;
                        case 8:
                            // Fibonacci Numbers
                            System.out.print("Enter a number to find its Fibonacci: ");
                            int fibonacciNum = scanner.nextInt();
                            System.out.println("Fibonacci number at position " + fibonacciNum + ": " + Recursives.fibonacciNumbers(fibonacciNum));
                            break;
                        default:
                            System.out.println("Invalid choice. Please select a number from 1 to 7.");
                            break;
                    }

                    System.out.print("Do you want to select another algorithm? (yes/no): ");
                    String response = scanner.next();
                    if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
                        System.out.println("Successfully exited the program");
                        continueRunning = false;
                    } else if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
                        continueRunning = true;
                    }
                    {

                    }
                }

                scanner.close();
            }
    }
