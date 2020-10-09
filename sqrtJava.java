import java.util.Scanner;

public class sqrtJava {
    static Scanner sc = new Scanner(System.in);

    private static int solution(int x) {
        if (x < 2)
            return x;
        long start = 2;
        long end = x / 2;
        while (start <= end) {
            long mid = start + ((end - start) / 2);

            if (mid * mid > x)
                end = mid - 1;

            else if (mid * mid <= x)
                start = mid + 1;

            else
                return (int) mid;
        }

        return (int) end;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        System.out.println(solution(x));
    }

}
