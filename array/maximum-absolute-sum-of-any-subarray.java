class Solution {
    public int maxAbsoluteSum(int[] arr) {
         int n = arr.length;
        int negSum = arr[0];
        int posSum = arr[0];
        int res = Math.abs(arr[0]);
        for(int i=1; i<n; i++) {
            int u = arr[i];
            int v = negSum+arr[i];
            int w = posSum+arr[i];
            negSum = Math.min(u,Math.min(v,w));
            posSum = Math.max(u,Math.max(v,w));
            int abs = Math.max(Math.abs(u),Math.max(Math.abs(v),Math.abs(w)));
            res = Math.max(res,abs);
        }
        return res;
    }
}