import java.util.*;

public class reveseNumber {

    private static int reverse(int x) {
        String answer = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();

        try {
            return Integer.parseInt(answer);
        }

        catch (Exception e) {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(reverse(n));
        scn.close();
    }
}
