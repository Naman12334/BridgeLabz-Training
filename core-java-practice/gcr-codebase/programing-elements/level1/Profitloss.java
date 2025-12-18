import java.util.*;

public class profitloss {
    public static void main(String[] args) {
        int cost = 129;
        int sell = 191;
        int profit = sell - cost;
        double profitpercent = (profit * 1d / cost) * 100;
        System.out.println("the cost price is " + cost + "and selling price is " + sell);
        System.out.print("the profit is inr" + profit + "and the profit percentage is " + profitpercent);
    }
    
}
