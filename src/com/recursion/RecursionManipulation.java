package com.recursion;

public class RecursionManipulation {

    public static void main(String[] args) {


        System.out.println("3 raised to power of 5 is " + pow(3, 5));
        System.out.println("The factorial of 4 is "+ factorial(4));



    }

    private static int factorial(int n){
        if (n == 1) return 1;

        return n * factorial(n-1);
    }

    private static int pow(int base, int x) {

        if (x == 0) return 1;

        return base * pow(base, x - 1);
    }
}
