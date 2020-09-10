import java.util.*;

public class passwordGen {
    static String pswdGen(String fname, String mname, String lname) {
        int lf = fname.length(), lm = mname.length(), ll = lname.length();
        if (lf <= 1 || lm <= 1 || ll <= 1)
            return "Enter a valid name";
        String temp = (lm % 2 != 0) ? "" + mname.charAt((int) Math.round(lm / 2))
                : "" + (char) (int) ((mname.charAt(lm / 2) + mname.charAt(lm / 2 - 1)) / 2);

        return fname.substring(0, 2) + temp + lname.substring(ll - 2);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        String fname, mname, lname;
        fname = sc.nextLine();
        mname = sc.nextLine();
        lname = sc.nextLine();

        System.out.println(pswdGen(fname, mname, lname));
    }

}
