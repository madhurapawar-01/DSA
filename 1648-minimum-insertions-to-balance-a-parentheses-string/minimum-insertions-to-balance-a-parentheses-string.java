class Solution {
    public int minInsertions(String s) {

        int len = s.length();
        Stack<Character> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } 
            else {
                if (i + 1 < len && s.charAt(i + 1) == ')') {
                    i++;
                } 
                else {
                    ans++;
                }

                if (!st.isEmpty()) {
                    st.pop();
                } 
                else {
                    ans++;
                }
            }
        }

        ans += st.size() * 2;

        return ans;
    }
}