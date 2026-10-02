class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> list=new ArrayList<>();

        int open =0;
        int close=0;

        generate("",n,0,0,list);

        return list;

       

    }
    public void generate(String s,int n, int open, int close, List<String> list)
        {
            if(s.length() == 2*n)
            {
                list.add(s);
                return;
            }
            if (open < n)
            {
                generate(s+"(",n,open+1,close,list);
            }
            if(close<open)
            {
                generate(s+")",n,open,close+1,list);
            }
        }
}