class Solution {
    // MADHURA PAWAR
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        int low=0;

        HashMap <Character,Integer> map= new HashMap<>();

        for(int high=0;high<n;high++)
        {
            char ch=s.charAt(high);

            if(map.containsKey(ch))
            {
                 int freq=map.get(ch);
                 freq+=1;
                 map.put(ch,freq);
            }
            else{
                map.put(ch,1);
            }
            int k=high-low+1;
            while(map.size()<k)
            {
                char left=s.charAt(low);
                int lf=map.get(left);

                lf-=1;
                map.put(left,lf);

                if(lf==0)
                {
                    map.remove(left);
                }
                low++;
                k=high-low+1;
            }
            ans=Math.max(ans,high-low+1);
        }
        return ans;
        
    }
}