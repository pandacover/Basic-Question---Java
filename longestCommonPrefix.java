import java.util.*;

public class longestCommonPrefix {
    private static String solution(String[] strs) {
        if (strs.length == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLen)
                minLen = strs[i].length();
        }

        for (int i = 0; i < minLen; i++) {
            for (int j = 0; j < strs.length - 1; j++)
                if (strs[j].charAt(i) != strs[j + 1].charAt(i))
                    return sb.toString();
            sb.append(strs[0].charAt(i));
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++)
            str[i] = sc.nextLine();
        System.out.println(solution(str));
        sc.close();
    }

}
