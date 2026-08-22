class Solution {
    public int maxProfit(int[] prices) {
        
        int lowestPrice = prices[0];
        int currentProf =0;
        int maxProf =0;

        for(int i=1;i<prices.length;i++){
    
            if(lowestPrice>prices[i]){
                lowestPrice = prices[i];
            }
            currentProf= prices[i]- lowestPrice;
            if(currentProf>maxProf){
                maxProf = currentProf;
            }
        }
        return maxProf;
    }
}
