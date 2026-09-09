class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int n = arr.length;
        int circ = arr[0];
        int notCirc = arr[0];
        int res = arr[0];
        int minSum = arr[0];
        int sum = arr[0];
        for(int i = 1; i<n; i++) {
            sum = sum + arr[i];
            int u = arr[i];
            int v = notCirc + arr[i];
            notCirc = Math.max(u,v);
            int w = circ + arr[i];
            circ = Math.min(u,w);
            minSum = Math.min(minSum, circ);
            res = Math.max(res,notCirc);
        }
        if(res<0) {
            return res;
        }
        return Math.max(res,sum-minSum);
    }
}