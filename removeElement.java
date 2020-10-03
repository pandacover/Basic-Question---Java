import java.util.*;

public class removeElement {
    public static int[] nums;

    private static int solution(int[] nums, int val) {
        int i = 0, j = 0, len = nums.length;
        while (j < len) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        return i;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nums = new int[5];
        for (int i = 0; i < 5; i++)
            nums[i] = sc.nextInt();
        int val = sc.nextInt();
        int len = solution(nums, val);
        for (int i = 0; i < len; i++)
            System.out.print(nums[i] + " ");
        sc.close();
    }

}
