class Solution {
    public int totalFruit(int[] fruits) {
        int k = 2;
        int n = fruits.length;
        int low = 0;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int high=0; high<n; high++) {
            int ab = fruits[high];
            map.put(ab,map.getOrDefault(ab,0)+1);
            while(map.size()>k) {
                int lower = fruits[low];
                map.put(lower,map.get(lower)-1);
                //remove
                if(map.get(lower)==0) {
                    map.remove(lower);
                }
                low++;
            }
            int length = (high-low)+1;
            res = Math.max(length,res);
        }
        return res==0 ? -1:res;
    }
}