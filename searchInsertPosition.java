import java.util.*;

public class searchInsertPosition {
    static Scanner sc = new Scanner(System.in);

    private static int solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target)
                return i;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();
        int target = sc.nextInt();
        System.out.println(solution(arr, target));
    }

}
