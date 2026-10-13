class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }else{
                max=Math.max(max,prices[i]-min);
            }


        }
        return max==Integer.MIN_VALUE ? 0 :max;
    }
}
