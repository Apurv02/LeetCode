class Solution {
        long hoursNeeded(int piles[], int k) {
        int n = piles.length;
        long hours = 0; //hours at each pile
        for(int i=0; i<n; i++) { //helper function gives the hours if koko eats at speed k
            hours = hours + piles[i]/k;
            if(piles[i]%k!=0) {
                hours++;
            }
        }
        return  hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int max = piles[0];
        for(int i=0; i<n; i++) {
            if(piles[i]>max) {
                max = piles[i];
            }
        }
        int high = max;
        int res = -1;
        while(low<=high) {
            int guess = low + (high-low)/2;
            long speed = hoursNeeded(piles,guess);
            if(speed>h) {
                low = guess+1;
            } else {
                res = guess;
                high = guess-1;
            }
        }
        return res;
    }
}