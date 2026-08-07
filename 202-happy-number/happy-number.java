class Solution {

    public int fun(int no)
    {
        int sum=0;

        while(no>0)
        {
            int d= no%10;
            sum = sum + (d * d);
            no=no/10;

        }
        return sum;
    }
    public boolean isHappy(int n) {


        int slow=n;
        int fast=n;

        while(fast!=1)
        {
            slow=fun(slow);
            fast=fun(fast);
            fast=fun(fast);

           if(slow==fast && slow!=1)
           {
            return false;
           }
        }
        
        return true;
        
    }
}