class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        int bi = arr[0];
        int u = 0;
        int v = 0;
        int ans = arr[0];
        for(int i=1; i<n; i++) {
            u = bi + arr[i];
            v = arr[i];
            bi = Math.max(u,v);
            ans = Math.max(bi,ans);
        }
        return ans;
    }
}