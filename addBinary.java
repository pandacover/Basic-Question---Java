import java.util.*;

public class addBinary {
    static Scanner sc = new Scanner(System.in);

    private static String solution(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0)
                sum += a.charAt(i--) - 48;
            if (j >= 0)
                sum += b.charAt(j--) - 48;

            sum += carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }

        if (carry > 0)
            sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = sc.next(), b = sc.next();
        System.out.println(solution(a, b));

    }

}
