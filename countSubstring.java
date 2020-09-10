import java.util.*;

public class countSubstring {

    public static int countSub(String str, int len) {
        if (len <= 1)
            return len;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (str.charAt(j) == '1' && str.charAt(i) == '1')
                    count++;
            }
        }

        return count;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int testCases, len;
        testCases = sc.nextInt();
        while (testCases >= 0) {
            String str = sc.nextLine();
            len = str.length();
            System.out.println(countSub(str, len));
            testCases--;
        }
    }
}
