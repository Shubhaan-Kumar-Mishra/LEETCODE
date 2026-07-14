class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        java.util.Arrays.fill(ans, -1);

        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;

            while (top >= 0 && nums[stack[top]] < nums[idx])
                ans[stack[top--]] = nums[idx];

            if (i < n)
                stack[++top] = idx;
        }

        return ans;
    }
}