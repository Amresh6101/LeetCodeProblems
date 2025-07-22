class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;

        int firstBuy=prices[0];
        for(int i=1;i<prices.length;i++){
            int price=prices[i];
            if(price<=firstBuy){
                firstBuy=price;
            }
            else{
             profit=Math.max(profit,price-firstBuy);
            }
        }
        return profit;        
    }
}