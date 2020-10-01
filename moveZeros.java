import java.util.*;

public class moveZeros {
    static Scanner sc = new Scanner(System.in);

    public static void moveZero(int arr[]) {
        int index = 0;
        Set<Integer> elements = new HashSet<>();

        for (int each : arr)
            if (each != 0) {
                elements.add(each);
                index++;
            }

        while (index-- >= 0) {
            elements.add(0);
        }

        Iterator<Integer> value = elements.iterator();
        while (value.hasNext()) {
            System.out.print(value.next() + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        moveZero(arr);
    }
}
