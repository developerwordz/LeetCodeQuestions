class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> store = new HashSet<>();

        for (int num : nums) {
            store.add(num);
        }
        int res = 0;

        for (int num : store) {
            if (!store.contains(num - 1)) {
                int cur = num;
                int count = 1;

                while (store.contains(cur + 1)) {
                    cur++;
                    count++;
                }

                res = Math.max(res, count);
            }
        }
        return res;
    }
}