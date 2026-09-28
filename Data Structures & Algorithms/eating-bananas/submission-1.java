class Solution {
    static long helper(int[] piles, int speed){
        long totalTime = 0;
        for(int i = 0; i<piles.length; i++){

            totalTime += piles[i] / speed; //time to eat each pile with the curr speed;

            if(piles[i] % speed != 0){ // if in case there is some banana of piles left then it will take 1 more hr to eat.
                totalTime++;
            }
        }
        return totalTime;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int num : piles){
            max = Math.max(max,num);
        }

        int i = 1;
        int j = max; 
        int ans = max;

        while(i<=j){
            int mid = i + (j - i)/2;

            long timeToEat = helper(piles, mid);
            
            if(timeToEat > h){
                i = mid + 1; // speed bhadao
            }
            else{
                
                ans = Math.min(ans,mid);
                j = mid - 1; //speed kaam kro
            }
        }
        return ans;
    }
}