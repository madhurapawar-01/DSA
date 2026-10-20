class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {


        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[!?',;.]", " ");
        String[] words = paragraph.split("\\s+");
        String ans = "";

        HashMap<String,Integer> map=new HashMap<>();
        
        for (int i = 0; i < words.length; i++) 
        {

            boolean isBanned = false;

            for (int j = 0; j < banned.length; j++) 
            {
                if (words[i].equals(banned[j])) 
                {
                    isBanned = true;
                    break;
                }
            }

            if (!isBanned) 
            {
                if (map.containsKey(words[i])) {
                    map.put(words[i], map.get(words[i]) + 1);
                } else {
                    map.put(words[i], 1);
                }
            }

        
        int max = 0;

        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                ans = key;
            }
        }
        }

        return ans;
    }
}