class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int n=nums.length;
        int pre=0;
        int suf=0;
        int sum=0;

        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }

        for(int i=0;i<n;i++)
        {
            suf=sum-pre-nums[i];
            if(pre==suf)
            {
                return i;
            }
            pre=pre+nums[i];
        }
        return -1;    
    }
}