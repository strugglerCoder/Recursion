package Recursion;

public class BinaryNo {
    static int n = 3;
    static int arr[] = new int[n];

    public static void main(String[] args) {
        int pos = 0;
        binaryCombo(n, pos, arr);
    }

    static void binaryCombo(int n, int pos, int arr[]) {
        if (pos == n) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        arr[pos] = 0;
        binaryCombo(n, pos + 1, arr);
        arr[pos] = 1;
        binaryCombo(n, pos + 1, arr);
    }
}
