import java.util.*;

public class luckyNumber {
    static Scanner sc = new Scanner(System.in);

    public static int findLucky(int[] arr) {
        Map<Integer, Integer> elements = new HashMap<>();
        int ret = -1;
        for (int each : arr)
            elements.put(each, elements.getOrDefault(each, 0) + 1);

        for (int each : elements.keySet())
            ret = (each == elements.get(each)) ? Math.max(ret, each) : ret;

        return ret;
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findLucky(arr));
    }

}
