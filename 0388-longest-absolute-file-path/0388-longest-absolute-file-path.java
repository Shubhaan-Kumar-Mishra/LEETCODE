class Solution {
    public int lengthLongestPath(String input) {
        String[] parts = input.split("\n");
        int[] len = new int[parts.length + 1];
        int ans = 0;

        for (String s : parts) {
            int depth = 0;
            while (depth < s.length() && s.charAt(depth) == '\t') {
                depth++;
            }

            String name = s.substring(depth);

            if (name.contains(".")) {
                ans = Math.max(ans, len[depth] + name.length());
            } else {
                len[depth + 1] = len[depth] + name.length() + 1;
            }
        }

        return ans;
    }
}