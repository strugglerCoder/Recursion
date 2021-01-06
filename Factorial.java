package Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of test case : ");
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            // int i = 1;
            System.out.print(factorial(n)+ " ");
        }
        sc.close();
    }

    static int factorial( int n)
    {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}
