import java.util.List;
import java.util.Scanner;

class SubscriptionPlans{
    public static final String MONTHLY = "MONTHLY";
    public static final String QUARTERLY = "QUARTERLY";
    public static final String YEARLY = "YEARLY";
    private String monthly;
    private String quarterly;
    private String yearly;
    public SubscriptionPlans(String monthly, String quarterly, String yearly) {
        this.monthly = monthly;
        this.quarterly = quarterly;     
        this.yearly = yearly;
    }

}
class SubscriptionType extends SubscriptionPlans{
    public SubscriptionType(String monthly, String quarterly, String yearly) {
        super(monthly, quarterly, yearly);
    }
    public void displayTypes() {
        System.out.println("Subscription Types:");
        System.out.println("Monthly: " + super.MONTHLY);
        System.out.println("Quarterly: " + super.QUARTERLY);
        System.out.println("Yearly: " + super.YEARLY);
    }
    public String getMonthly() {
        return super.MONTHLY;
    }
    public String getQuarterly() {
        return super.QUARTERLY;
    }
    public String getYearly() {
        return super.YEARLY;
    }  
}
class SubscriptionPrice extends SubscriptionType{
    public SubscriptionPrice(String monthly, String quarterly, String yearly) {
        super(monthly, quarterly, yearly);
    }
    public void displayPrices() {
        System.out.println("Subscription Prices:");
        System.out.println("Monthly: " + super.MONTHLY);
        System.out.println("Quarterly: " + super.QUARTERLY);
        System.out.println("Yearly: " + super.YEARLY);
    }
    public String getMonthlyPrice() {
        return super.MONTHLY;
    }
    public String getQuarterlyPrice() {
        return super.QUARTERLY;
    }
    public String getYearlyPrice() {
        return super.YEARLY;
    }


}

 class Subscription {
    private String subscriptionId;
    private String customerId;
    private String planName;
    private int durationInMonths;
    private double price;

    public Subscription(String subscriptionId, String customerId, String planName, int durationInMonths, double price) {
        this.subscriptionId = subscriptionId;
        this.customerId = customerId;
        this.planName = planName;
        this.durationInMonths = durationInMonths;
        this.price = price;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPlanName() {
        return planName;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public double getPrice() {
        return price;
    }
}
class futuerePlan{
    public void upcomingPlans() {
        System.out.println("Upcoming Subscription Plans will be announced soon!");
    }
}
public class SubscriptionTaker{
    List<Subscription> subscriptions;
    List<SubscriptionPrice> subscriptionPrices;

    public static void main(String[] args) {
        System.out.println("Welcome to the Subscription Management System");
        System.out.println("These are the available subscription plans and their prices:");
        SubscriptionPlans subscriptionPlans = new SubscriptionPlans("10", "25", "90");
        SubscriptionType subscriptionType = new SubscriptionType("10", "25", "90");
       

        SubscriptionPrice subscriptionPrice = new SubscriptionPrice("10", "25", "90");
        subscriptionPrice.displayPrices();

        Subscription subscription = new Subscription("SUB123", "CUST456", subscriptionPrice.getMonthlyPrice(), 1, 10.0);
        System.out.println("Subscription Details:");
        System.out.println("Subscription ID: " + subscription.getSubscriptionId());
        System.out.println("Customer ID: " + subscription.getCustomerId());
        System.out.println("Plan Name: " + subscription.getPlanName());
        System.out.println("Duration (months): " + subscription.getDurationInMonths());
        System.out.println("Price: $" + subscription.getPrice());

        futuerePlan futurePlan = new futuerePlan();
        futurePlan.upcomingPlans();
    }
    
}
    
   