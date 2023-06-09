/*
You have made a smartphone app and want to set its subscription price such that the profit earned is maximised.
There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.
You will be provided with a list of size N having budgets of subscribers and
you need to return the maximum profit that you can earn.

Lets say you decide that price of your app is Rs. x and there are N number of subscribers.
So maximum profit you can earn is : m * x
where m is total number of subscribers whose budget is greater than or equal to x.

Input format :
Line 1 : N (No. of subscribers)
Line 2 : Budget of subscribers (separated by space)
Output Format :
 Maximum profit

Constraints :
1 <= N <= 10^6
1 <=budget[i]<=9999

Sample Input 1 :
4
30 20 53 14
Sample Output 1 :
60

Sample Output 1 Explanation :
Price of your app should be Rs. 20 or Rs. 30. For both prices, you can get the profit Rs. 60.

Sample Input 2 :
5
34 78 90 15 67
Sample Output 2 :
201

Sample Output 2 Explanation :
Price of your app should be Rs. 67. You can get the profit Rs. 201 (i.e. 3 * 67).
 */

import java.util.Arrays;
import java.util.Scanner;

public class maximumProfitOnApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++)
            input[i] = s.nextInt();

        System.out.println(maximumProfit(input));
    }

    public static int maximumProfit(int[] budget) {
        Arrays.sort(budget);// [14, 20, 30, 53]
        int profit = 0;
        int j = budget.length;
        for (int i = 0; i < budget.length; i++) {
            int temp = j * budget[i];
            if (temp > profit) {
                profit = temp;
            }
            j--;
        }
        return profit;
    }
}