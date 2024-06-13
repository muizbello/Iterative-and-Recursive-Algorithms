package com.Iterative_and_Recursive_Methods_11068463;

public class Iteratives {

    public static int maximumValue(Object input) {
        // Wrong Input Error handling
        if (input == null) {
            System.out.println("Input is null");
            throw new IllegalArgumentException("Input is null");
        }

        if (!(input instanceof int[])) {
            System.out.println("Input is not an array");
            throw new IllegalArgumentException("Input is not an array");
        }

        int[] inputArray = (int[]) input;

        if (inputArray.length == 0) {
            System.out.println("Array is empty");
            throw new IllegalArgumentException("Array is empty");
        }
        //assign first array element to maxval variable which stores the maximum value from the array
        int maxval = inputArray[0];
        // iterate and compare across the array elements
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxval) {
                maxval = inputArray[i];
            }
        }
        // Return maxval after loop
        return maxval;
    }

    public static boolean isUnique(Object input) {
        // Wrong Input Error handling
        if (input == null) {
            System.out.println("The input is null");
            throw new IllegalArgumentException("Input is null");
        }

        if (!(input instanceof int[])) {
            System.out.println("The input is not an array");
            throw new IllegalArgumentException("Input is not an array");
        }

        int[] inputArray = (int[]) input;

        if (inputArray.length == 0) {
            System.out.println("The array is empty.");
            throw new IllegalArgumentException("The array is empty");
        }

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
        public static int[][] matrixMultiply ( int[][] A, int[][] B){
                // the function takes two integer matrices
                // Check if matrix A is null
                if (A == null) {
                    System.out.println("Error: The first Matrix is null.");
                }

                // Check if matrix B is null
                if (B == null) {
                    System.out.println("Error: The second matrix is null.");
                }

                // Check if matrix A is empty
                if (A.length == 0 || A[0].length == 0) {
                    System.out.println("Error: The first Matrix is empty.");

                }

                // Check if matrix B is empty
                if (B.length == 0 || B[0].length == 0) {
                    System.out.println("Error: The second Matrix is empty.");
                }

                // Check if the number of columns in A matches the number of rows in B
                if (A[0].length != B.length) {
                    System.out.println("Error: Number of columns in matrix A must be equal to the number of rows in matrix B.");
                    return null;
                }


            int n = A.length;
            int[][] C = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            return C;
        }

    public static double[][] gaussianEliminate(double[][] A) {

        if (A.length == 0 || A[0].length == 0) {
            System.out.println("Error: The Matrix is empty.");

        }


        int n = A.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double factor = A[j][i] / A[i][i];
                for (int k = i; k < n; k++) {
                    A[j][k] = A[j][k] - factor * A[i][k];
                }
            }
        }
        return A;
    }

    public static int numberOfBinaryDigits(int n) {
        // Initialize variable count and set it to 1
        int count = 1;

        // While n > 1, increment count and divide n by 2
        while (n > 1) {
            count++;
            n = n / 2;
        }

        // Return count
        return count;
    }
    }



