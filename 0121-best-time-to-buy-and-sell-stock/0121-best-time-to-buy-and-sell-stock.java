class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int sum=0;
        int m=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<m)
                m=prices[i];
            sum=prices[i]-m;
            if(max<sum)
                max=sum;
        }
        return max;
    }
}