class Solution {
    public int maximumSum(int[] arr) {
        
       int nodel = arr[0];
       int onedel = -100000;
       int ans = arr[0];

       for(int i=1;i<arr.length;i++)
       {
            int prevNoDel = nodel;
            int prevOneDel = onedel;

            nodel = Math.max(arr[i], prevNoDel + arr[i]);
            onedel = Math.max(prevNoDel, prevOneDel + arr[i]);
            ans = Math.max(ans, Math.max(nodel, onedel));

       }

    return ans;
    }
}