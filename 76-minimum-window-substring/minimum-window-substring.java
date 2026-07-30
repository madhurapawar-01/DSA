class Solution {

    public String minWindow(String s, String t) {

        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();

        int n1 = s.length();
        int n2 = t.length();

        int low = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for (int j = 0; j < n2; j++) {

            char ch1 = t.charAt(j);

            int freq2 = 0;
            if (need.containsKey(ch1)) {
                freq2 = need.get(ch1);
            }

            freq2 = freq2 + 1;
            need.put(ch1, freq2);
        }

        int req = 0;

        for (int high = 0; high < n1; high++) {

            char ch2 = s.charAt(high);

            int f = 0;
            if (window.containsKey(ch2)) {
                f = window.get(ch2);
            }

            f = f + 1;
            window.put(ch2, f);

            if (need.containsKey(ch2) && window.get(ch2).intValue() == need.get(ch2).intValue()) {
                req = req + 1;
            }

            while (req == need.size()) {

                int currLen = high - low + 1;

                if (currLen < minLen) {
                    minLen = currLen;
                    start = low;
                }

                char left = s.charAt(low);

                int lf = window.get(left);
                lf = lf - 1;
                window.put(left, lf);

                if (need.containsKey(left) && lf < need.get(left)) {
                    req = req - 1;
                }

                if (lf == 0) {
                    window.remove(left);
                }

                low++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}