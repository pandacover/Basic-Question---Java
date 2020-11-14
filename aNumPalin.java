import java.util.*;
public class aNumPalin {
    static Scanner sc = new Scanner(System.in);
    static boolean solution(String s) {
        if(s.isEmpty())
            return true;
       String newstr = s.replaceAll("[^a-zA-Z0-9]+", "");
       newstr = newstr.toLowerCase();
        StringBuffer sb = new StringBuffer(newstr);
        if(newstr.equals(sb.reverse().toString()))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = sc.nextLine();
        System.out.println(solution(s));
    }
}
