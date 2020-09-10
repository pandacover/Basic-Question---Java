import java.util.*;

public class reverseVowel {

    public static String reverseVowels(String s) {
        if (s.length() <= 1)
            return s;

        String temp = "";
        String array[] = new String[s.length()];
        for (int i = 0; i < s.length(); i++)
            array[i] = "" + s.charAt(i);
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("a") || array[i].equals("e") || array[i].equals("i") || array[i].equals("o")
                    || array[i].equals("u")) {
                temp += array[i];
                array[i] = "";
            }
        }

        StringBuffer str = new StringBuffer(temp);
        temp = str.reverse().toString();
        int index = 0;
        s = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == "")
                s += "" + temp.charAt(index++);
            else
                s += array[i];
        }
        return s;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        String str = sc.nextLine();
        System.out.println(reverseVowels(str));
    }
}