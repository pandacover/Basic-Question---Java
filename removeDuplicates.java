import java.util.*;

public class removeDuplicates {
    public static int[] nums;

    private static int solution(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nums = new int[5];
        for (int i = 0; i < 5; i++)
            nums[i] = sc.nextInt();
        int len = solution(nums);
        for (int i = 0; i < len; i++)
            System.out.print(nums[i] + " ");
        sc.close();
    }
}
