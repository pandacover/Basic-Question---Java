import java.util.*;

public class tribonacciNumber {
    private static int tribonnaci(int n) {
        int[] array = new int[n + 1];

        if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;

        array[0] = 0;
        array[1] = 1;
        array[2] = 1;

        for (int i = 3; i <= n; i++) {
            array[i] = array[i - 3] + array[i - 2] + array[i - 1];
        }

        return array[n];
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        System.out.println(tribonnaci(n));
    }
}
