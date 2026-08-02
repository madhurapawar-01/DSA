class Solution {
    public void sortColors(int[] nums) {
        //Madhura Pawar

        //int[] red = new int[nums.length];
        //int[] white = new int[nums.length];
        //int[] blue = new int[nums.length];

        int rc = 0;
        int wc = 0;
        int bc = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                //red[rc] = nums[i];
                rc++;
            } else if (nums[i] == 1) {
                //white[wc] = nums[i];
                wc++;
            } else {
                //blue[bc] = nums[i];
                bc++;
            }
        }

        int idx = 0;

        for (int i = 0; i < rc; i++) {
            nums[idx] = 0;
            idx++;
        }

        for (int i = 0; i < wc; i++) {
            nums[idx] = 1;
            idx++;
        }

        for (int i = 0; i < bc; i++) {
            nums[idx] = 2;
            idx++;
        }
    }
}