class Solution {
    public int subarraySum(int[] nums, int k) {

        int low;
        int high;
        int n=nums.length;
        int count=0;
        //int max_e=nums[0];

        for(low=0;low<n;low++)
        {
            int sum=0;
            for(high=low;high<n;high++)
            {
                sum=sum+nums[high];
                if(sum==k)
                {
                    count++;
                }
                //max_e=Math.max(sum,max_e);
            }
        }
        return count;
    }
}