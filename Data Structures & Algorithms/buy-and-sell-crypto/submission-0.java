class Solution {
    public int maxProfit(int[] prices) {
       int buyPrice = prices[0];
       int currentProf = 0;
       int maxProf = 0;

       for(int i=1;i<prices.length;i++){

        if(buyPrice>prices[i]){
            buyPrice = prices[i];
        }
        currentProf = prices[i]- buyPrice;
        if(maxProf<currentProf){
            maxProf = currentProf;
        }

       }
       return maxProf;
    }
}
