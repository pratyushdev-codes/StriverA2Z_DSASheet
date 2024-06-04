public class bestTimetobuyandsellstock {
    public static void main(String[] args) {
        
    }public static int bestTime(int arr []){
        if(arr.length==0){
            return 0;

        }
        int maxProfit= 0;

        int minPrice= arr[0];

        for(int i =0;i<arr.length-1;i++){
            if(minPrice>arr[i]){
                minPrice= arr[i];
            }else{
                int currentProfit= arr[i]-minPrice;
                if(currentProfit>maxProfit){
                    maxProfit=currentProfit;
                }


            }
        }
        return maxProfit;
    }
}


class Solution {
    public int maxProfit(int prices[]) {
        if (prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int currentProfit = prices[i] - minPrice;
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        return maxProfit;
    }
}
