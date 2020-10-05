import java.util.*;

public class lastLength {
    static Scanner sc = new Scanner(System.in);

    private static int solution(String s) {
        if (s.length() == 0)
            return 0;
        return s.substring(s.lastIndexOf(" ") + 1).length();
    }

    public static void main(String[] args) {
        String s = sc.nextLine().trim();
        System.out.println(solution(s));
    }
}
