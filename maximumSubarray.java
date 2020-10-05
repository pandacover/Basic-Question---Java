import java.util.*;

public class maximumSubarray {
    static Scanner sc = new Scanner(System.in);

    private static int solution(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int max = nums[0], curr = max;

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(curr + nums[i], nums[i]);
            max = Math.max(curr, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(nums));
    }
}
