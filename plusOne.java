import java.util.*;

public class plusOne {
    static Scanner sc = new Scanner(System.in);

    private static int[] solution(int[] digits) {
        int sum, carry = 1;

        for (int i = digits.length - 1; i > -1; i--) {
            sum = digits[i] + carry;
            digits[i] = sum > 9 ? sum - 10 : sum;
            carry = sum > 9 ? 1 : 0;
        }

        if (carry == 1) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 1; i < newDigits.length; i++)
                newDigits[i] = digits[i - 1];
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = new int[5];
        for (int i = 0; i < digits.length; i++)
            digits[i] = sc.nextInt();
        for (int i = 0; i < solution(digits).length; i++)
            System.out.print(solution(digits)[i] + " ");
    }
}
