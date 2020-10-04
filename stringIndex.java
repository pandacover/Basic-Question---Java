import java.util.*;

public class stringIndex {
    static Scanner sc = new Scanner(System.in);

    private static int solution(String haystack, String needle) {
        if (needle.isEmpty() || haystack.equals(needle))
            return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String evalString = haystack.substring(i, i + needle.length());
            if (evalString.equals(needle))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String x, y;
        x = sc.nextLine();
        y = sc.nextLine();
        System.out.println(solution(x, y));
    }

}
