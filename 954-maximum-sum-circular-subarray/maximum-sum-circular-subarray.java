class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int minend = nums[0];
        int maxend = nums[0];

        int maxsum = nums[0];
        int minsum = nums[0];

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            sum += nums[i];

            int v1 = nums[i];
            int v2 = minend + nums[i];
            int v3 = maxend + nums[i];

            minend = Math.min(v1, v2);
            minsum = Math.min(minsum, minend);

            maxend = Math.max(v1, v3);
            maxsum = Math.max(maxsum, maxend);
        }

        if (maxsum < 0) {
            return maxsum;
        }

        int csum = sum - minsum;

        return Math.max(maxsum, csum);
    }
}