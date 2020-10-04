import java.io.*;
import java.util.*;

class test {
    public static void main(String args[]) throws IOException {
        int arr[] = { 1, 2, 3 };
        StringBuilder sb = new StringBuilder();
        String str = sb.append(arr).toString();
        System.out.println(str);
    }
}