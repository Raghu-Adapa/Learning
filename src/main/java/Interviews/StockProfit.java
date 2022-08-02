package Interviews;

public class StockProfit {

    public static void main(String[] args) {

        System.out.println("hello");

        int price[] = { 40, 25, 86, 12,44, 95, 65 };

        int profit = getProfit2(price);

        System.out.println(" Profit = "+ profit);
    }

    public static int getProfit(int[] price){
        int profit = 0;
        for(int i=0;i<price.length-1;i++){

            for(int j=i+1;j<price.length;j++){

                int curr_profit = price[j] - price[i];
                if(curr_profit>profit){
                    profit = curr_profit;
                }

            }

        }
        return profit;
    }

    // int price[] = { 40, 25, 86, 12,44, 95, 65 };

    public static int getProfit2(int[] price){

        int profit = Integer.MIN_VALUE;

        int curr=0;

        for(int i=1; curr<price.length-1 && i<price.length;){

            int diff = price[i]- price[curr];
            if(diff < 0){
                curr = i;
                i = i+1;
            }else{
                if(diff > profit)
                    profit = diff;
                i++;
            }
        }

        return profit;
    }
}
