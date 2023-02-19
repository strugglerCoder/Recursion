package Recursion;

public class StairCase {
    public static void main(String[] args) {
        int no_of_steps = 4;

        System.out.println(noOfWays(no_of_steps));
    }
    static int noOfWays(int n)
    {
        if(n<=2)
            return n;
        return (n-1)+(n-2);
    }
}
