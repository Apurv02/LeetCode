class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        ArrayList<int[]> list = new ArrayList<>();
        int n = intervals.length;
        boolean insert = false;
        //insert
        for(int i=0; i<n; i++) {
            if(!insert && intervals[i][0]>newInterval[0]) {
                list.add(new int[]{newInterval[0], newInterval[1]});
                insert = true;
            }
                list.add(intervals[i]);
            }
            if(!insert) {
                list.add(new int[]{newInterval[0],newInterval[1]});
            }    
            //merge 
            ArrayList<int[]> res = new ArrayList<>();
            int start1 = list.get(0)[0];
            int end1 = list.get(0)[1];
            for(int j=1; j<list.size(); j++) {
                int start2 = list.get(j)[0];
                int end2 = list.get(j)[1];
                if(end1>=start2) {
                    start1 = start1;
                    end1 = Math.max(end1,end2);
                } else {
                    res.add(new int[]{start1,end1});
                    start1 = start2;
                    end1 = end2;
                }
            }
            //last element
            res.add(new int[]{start1,end1});
            //list to array
            return res.toArray(new int[res.size()][]);
    }
}