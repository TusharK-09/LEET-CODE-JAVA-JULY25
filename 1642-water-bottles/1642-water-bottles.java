class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        if(numBottles == 0){
            return 0;
        }
        int drank = 0;
        int bottles = numBottles;
        int empty = 0;
        int remaining = 0;
        while(bottles > 0){
            drank = drank + bottles;
            empty = bottles + remaining;
            bottles = empty/numExchange;
            remaining = empty % numExchange;
             
        }

        return drank;
    }
}