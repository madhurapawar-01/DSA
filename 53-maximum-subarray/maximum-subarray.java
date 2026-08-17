class Solution {
    public int maxSubArray(int[] nums) {

        int sum=nums[0];

        int bestend=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int v1=nums[i];

            int v2= bestend+nums[i];

            bestend=Math.max(v1,v2);

            sum=Math.max(bestend,sum);
        }
        return sum;
        
    }
}