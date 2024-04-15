package cafe.yamds.work0329;

// 全排列

import java.util.Arrays;

public class work05 {
    static int n = 8;       // 个数

    public static void main(String[] args) {
        int[] nums = new int[n];    // 用来遍历的数组
        for (int i = 0; i < n; i++) {
            nums[i] = i+1;
        }
        System.out.println("nums : " + Arrays.toString(nums));

        dfs(nums, "");
    }

    public static void dfs(int[] nums, String ans) {
        if (ans.length() == n) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != -1) {
                nums[i] = -1;
                dfs(nums, ans + (i+1));
                nums[i] = i+1;
            }
        }
    }
}
