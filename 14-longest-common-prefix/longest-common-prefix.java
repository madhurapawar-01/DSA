class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n=strs.length;
        String s="";

        for(int i=0;i<strs[0].length();i++)
        {
            for(int j=1;j<n;j++)
            {
                if(i>=strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i))
                {
                    return s;
                }
            }
            s=s+strs[0].charAt(i);
        }
        return s;
        
    }
}