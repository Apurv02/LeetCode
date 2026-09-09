class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        ArrayList<int[]> res = new ArrayList<>();

        int i = 0, j = 0;

        while (i < firstList.length && j < secondList.length) {

            int start1 = firstList[i][0];
            int end1 = firstList[i][1];

            int start2 = secondList[j][0];
            int end2 = secondList[j][1];

           if(start1<=start2) {
            if(end1>=start2) {
                int start = Math.max(start1,start2);
                int end = Math.min(end1,end2);
                res.add(new int[]{start,end});
            }
           }else {
            if(end2>=start1) {
                int start = Math.max(start1,start2);
                int end = Math.min(end1,end2);
                res.add(new int[]{start,end});
            }
           }
            // jis interval ka end chhota hai usko aage badhao
            if (end1 <= end2) {
                i++;
            } else {
                j++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}