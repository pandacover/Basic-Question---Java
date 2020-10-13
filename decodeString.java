import java.util.*;

public class decodeString {

    public static String decodeAtIndex(String S, int K) {
        String[] digitList = { "2", "3", "4", "5", "6", "7", "8", "9" };
        Set<String> digits = new HashSet<>(Arrays.asList(digitList));
        int i = 0, flag = -1;
        int len = S.length();
        String ret = "";

        while (i < len) {
            int index = i;
            while (i < len && !digits.contains("" + S.charAt(i))) {
                i++;
                flag=0;
            }
            String temp = ret += S.substring(index, i);
            if (flag == 0)
                for (int j = 1; j < Integer.parseInt("" + S.charAt(i)); j++) {
                    ret += temp;
                }
            i++;
        }

        return "" + ret.charAt(K - 1);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(decodeAtIndex(str, k));
    }
}
