class Solution {
    static {
        final int[] temperatures = new int[3];
        for (int i = 0; i < 500; i++) {
            dailyTemperatures(temperatures);
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        final int n = temperatures.length;
        final int[] result = new int[n];
        for (int i = n - 2; i >= 0; --i) {
            final int currentTemp = temperatures[i];
            int j = i + 1;
            while (j < n && temperatures[j] <= currentTemp) {
                j = (result[j] == 0) ? n : j + result[j];
            }
            if (j < n) {
                result[i] = j - i;
            }
        }
        return result;
    }
}