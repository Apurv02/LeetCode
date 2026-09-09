class Solution {
    public int findMaxLength(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int zero = 0;
        int one = 0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            sum+=arr[i];
            if(arr[i]==0) {
                zero++;
            } else{
                one++;
            }
            int diff = zero-one;
            if(diff==0) {
                res = i+1;
            }
            if(map.containsKey(diff)) {
                int length = i-map.get(diff);
                res = Math.max(length,res);
            } else{
                map.put(diff,i);
            }
        }
        return res;
    }
}