class Solution {
    public int[] maxDepthAfterSplit(String seq) {

        int len=seq.length();
        int ans[]=new int[len];
        int depth=0;

        for(int i=0;i<len;i++)
        {
            if(seq.charAt(i)=='(')
            {
                depth++;
                ans[i]=depth%2;
            }
            if(seq.charAt(i)==')')
            {
                ans[i]=depth%2;
                depth--;
       
            }
        }
        return ans;
    }
}