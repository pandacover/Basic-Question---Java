import java.util.*;

public class palindrome {
    static Scanner sc = new Scanner(System.in);

    private static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int temp = x, rev = 0;
        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }

        return rev == x;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }

}
