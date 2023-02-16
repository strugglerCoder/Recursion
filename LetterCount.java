package Recursion;

public class LetterCount {
    public static void main(String[] args) {
        String str = "abcaad";
        System.out.println(let_cnt(str, str.length()));
    }

   static int let_cnt(String str,int n)
    {
        if (n == 0) {
            return 0;
        }
        else if (str.charAt(n-1) == 'a') {
            return 1 + let_cnt(str, n-1);
        } else {
            return let_cnt(str, n-1);
        }
    }
}
