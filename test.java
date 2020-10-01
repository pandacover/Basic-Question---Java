import java.io.*;
import java.util.*;

class test {
    public static void main(String args[]) throws IOException {
        String str = "This is a String.";
        FileWriter fw = new FileWriter("output.txt");
        File obj = new File("output.txt");

        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }
        fw.close();

        Scanner scn = new Scanner(obj);

        while (scn.hasNext()) {
            String data = scn.nextLine();
            System.out.println(data);
        }
        scn.close();
    }
}