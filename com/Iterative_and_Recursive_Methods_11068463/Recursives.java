package com.Iterative_and_Recursive_Methods_11068463;

public class Recursives{


    public static int Factorial(Object n){
        if (!(n instanceof Integer)) {
            throw new IllegalArgumentException("Input must be an integer.");
        }

        // Cast n to Integer
        int num = (Integer) n;

        // Check if n is non-negative
        if (num < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        if (num==0){
            return 1;
        }
        else{
            return num * Factorial(num-1);
        }
    }

    public static int fibonacciNumbers(Object n){
        if (!(n instanceof Integer)) {
            throw new IllegalArgumentException("Input must be an integer.");
        }

        // Cast n to Integer
        int num = (Integer) n;

        if (num < 0){
            throw new IllegalArgumentException("The number must be non-negative");
        }

        if (num <= 1){
            return num;
        }
        else{
            return fibonacciNumbers(num - 1) + fibonacciNumbers(num -2);
        }
    }

    public static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

}
