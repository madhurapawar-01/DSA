class Solution {
    public int smallestIndex(int[] nums) {

        int n=nums.length;
        

        for(int i=0;i<n;i++)
        {
            int sum=0;
            int no=nums[i];
            while(no>0)
            {
            int digit=no%10;
            sum=sum+digit;
            no=no/10;
            }
            

            if(i==sum)
            {
                return i;
            }
            
        }
        return -1;
        
    }
}