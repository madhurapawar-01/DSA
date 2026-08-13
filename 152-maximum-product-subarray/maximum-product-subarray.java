class Solution {
    public int maxProduct(int[] nums) {

        int ans=nums[0];

        int minbestend=nums[0];

        int maxbestend=nums[0];


        for(int i=1;i<nums.length;i++)
        {
            int v1=nums[i];

            int v2=nums[i]*maxbestend;
            
            int v3=nums[i]*minbestend;

            maxbestend=Math.max(v1,Math.max(v2,v3));
            minbestend=Math.min(v1,Math.min(v2,v3));

            ans=Math.max(ans,Math.max(maxbestend,minbestend));
        }
        
    return ans;
    }
}