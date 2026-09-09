class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int nodelete = arr[0];
        int onedelete = 0;
        int res  = arr[0];
        for(int i=1; i<n; i++) {
            int prevnodelete = nodelete;
            int prevonedelete = onedelete;
            int u = arr[i];             //no delete condition
            int v = nodelete + arr[i];  //no delete condition
            int w = prevnodelete;       //delete condition
            int x = prevonedelete + arr[i];  //delete condition
            nodelete = Math.max(u,v);
            onedelete = Math.max(w,x);
            res = Math.max(res,Math.max(onedelete,nodelete));
        }
        return res;
    }
}