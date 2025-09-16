// buy and sell stock to get Maximum profit
public class array5 {
    public static void main(String args[])
    {
        int arr[] = {7,1,5,3,6,4};
        int n = arr.length;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<n; i++)
        {
            if(buyPrice < arr[i])
            {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else
            {
                buyPrice = arr[i];
            }
        }

        System.out.println("Maximum profit is ="+ maxProfit);
    }
}
