import java.util.*;

public class sortString {

    static String sort(String str, int len) {
        if (len <= 1)
            return str;

        char tempArray[] = new char[len];
        for (int i = 0; i < len; i++)
            tempArray[i] = str.charAt(i);

        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        System.out.println(sort(str, str.length()));
    }
}
